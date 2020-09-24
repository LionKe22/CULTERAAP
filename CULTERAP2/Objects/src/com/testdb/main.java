package com.testdb;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "com.testdb", "com.testdb.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.testdb", "com.testdb.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.testdb.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static boolean _gb_phoneverificationsuccess = false;
public static String _gs_verificationid = "";
public static String _gs_phonenumber = "";
public static anywheresoftware.b4a.objects.FirebaseAuthWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public static anywheresoftware.b4a.FirebaseAuthPhone.FirebaseAuthPhoneWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public static anywheresoftware.b4a.FirebaseAuthEmail.FirebaseAuthEmailWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public static anywheresoftware.b4a.objects.collections.Map _vv3 = null;
public static anywheresoftware.b4a.objects.collections.Map _vv4 = null;
public static anywheresoftware.b4a.objects.collections.Map _vv5 = null;
public static anywheresoftware.b4a.objects.collections.Map _vv6 = null;
public static anywheresoftware.b4a.objects.collections.Map _vv7 = null;
public static anywheresoftware.b4a.objects.collections.Map _vv0 = null;
public static String _vvv1 = "";
public static String _vvv2 = "";
public static String _vvv3 = "";
public anywheresoftware.b4a.objects.RuntimePermissions _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.IME _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_phonelogin = null;
public com.testdb.b4xfloattextfield _fet_phonenumber = null;
public com.testdb.b4xfloattextfield _fet_smscode = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_phonesignin = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _iv_exitphonelogin = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_emaillogin = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_googlelogin = null;
public static String _gs_signinmethod = "";
public com.testdb.b4xfloattextfield _fet_emailreset = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_emailresetpassword = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblregister = null;
public com.testdb.b4xfloattextfield _fet_email = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_emailsignin = null;
public com.testdb.b4xfloattextfield _fet_regemail = null;
public com.testdb.b4xfloattextfield _fet_regemailpassword = null;
public com.testdb.b4xfloattextfield _fet_regemailpassword2 = null;
public com.testdb.b4xfloattextfield _fet_emailpassword = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelloginmethod = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeluser = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_setphonenumber = null;
public com.testdb.b4xfloattextfield _fet_setphonenumber = null;
public de.donmanfred.FirebaseDatabaseWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public de.donmanfred.DatabaseReferenceWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnon = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnoff = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtusuario = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtcontraseña = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsalir = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnatras = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnivel = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnivel2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnon2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnoff2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnluces = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnrojo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnazul = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnamarillo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblluces = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsensado = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsn1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsn2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsn3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblluces2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblluces3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnoff1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnoff3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnoff_2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblestado2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblestado1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnon_3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblestado3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprescripcion = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edthora = null;
public anywheresoftware.b4a.objects.EditTextWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblhora = null;
public anywheresoftware.b4a.objects.LabelWrapper _edthoraant = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnguardar = null;
public b4a.example.dateutils _vvvvvvv5 = null;
public com.testdb.starter _vvvvvvv7 = null;
public com.testdb.httputils2service _vvvvvvv0 = null;
public com.testdb.b4xcollections _vvvvvvvv1 = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
public static class _dbcommand{
public boolean IsInitialized;
public String Name;
public Object[] Parameters;
public void Initialize() {
IsInitialized = true;
Name = "";
Parameters = new Object[0];
{
int d0 = Parameters.length;
for (int i0 = 0;i0 < d0;i0++) {
Parameters[i0] = new Object();
}
}
;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _dbresult{
public boolean IsInitialized;
public Object Tag;
public anywheresoftware.b4a.objects.collections.Map Columns;
public anywheresoftware.b4a.objects.collections.List Rows;
public void Initialize() {
IsInitialized = true;
Tag = new Object();
Columns = new anywheresoftware.b4a.objects.collections.Map();
Rows = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static void  _activity_create(boolean _firsttime) throws Exception{
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(com.testdb.main parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
com.testdb.main parent;
boolean _firsttime;
String _permission = "";
boolean _result = false;
String _ls_phonenumber = "";
String _keynode1 = "";
String _link = "";
com.testdb.httpjob _job22 = null;
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _m1 = null;
String _rpreescribir = "";
String _keynode3 = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 140;BA.debugLine="realtime.Initialize(\"Realtime\")";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize(processBA,"Realtime");
 //BA.debugLineNum = 141;BA.debugLine="realtime.PersistenceEnabled = True";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setPersistenceEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 142;BA.debugLine="realtime.goOnline";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.goOnline();
 //BA.debugLineNum = 144;BA.debugLine="ref.Initialize(\"Reference\",  realtime.getReferenc";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize(processBA,"Reference",(com.google.firebase.database.DatabaseReference)(parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getReferencefromUrl("https://culterapp.firebaseio.com/").getObject()),(Object)(""));
 //BA.debugLineNum = 146;BA.debugLine="ref.addChildEventListener";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.addChildEventListener();
 //BA.debugLineNum = 147;BA.debugLine="ref.addListenerForSingleValueEvent";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.addListenerForSingleValueEvent();
 //BA.debugLineNum = 148;BA.debugLine="ref.addValueEventListener";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.addValueEventListener();
 //BA.debugLineNum = 153;BA.debugLine="If FirstTime Then";
if (true) break;

case 1:
//if
this.state = 38;
if (_firsttime) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 154;BA.debugLine="ime.Initialize(\"e_ime\")";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize("e_ime");
 //BA.debugLineNum = 155;BA.debugLine="gb_phoneVerificationSuccess = False";
parent._gb_phoneverificationsuccess = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 157;BA.debugLine="If CheckForGooglePlayServices = True Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 158;BA.debugLine="ToastMessageShow(\"Google play services active!\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Google play services active!"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 160;BA.debugLine="Activity.Initialize(\"Main\")";
parent.mostCurrent._activity.Initialize(mostCurrent.activityBA,"Main");
 //BA.debugLineNum = 161;BA.debugLine="Activity.RemoveAllViews";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 162;BA.debugLine="Activity.LoadLayout(\"Main\")";
parent.mostCurrent._activity.LoadLayout("Main",mostCurrent.activityBA);
 //BA.debugLineNum = 164;BA.debugLine="RP.CheckAndRequest(RP.PERMISSION_READ_PHONE_STAT";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.CheckAndRequest(processBA,parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.PERMISSION_READ_PHONE_STATE);
 //BA.debugLineNum = 165;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 47;
return;
case 47:
//C
this.state = 8;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 166;BA.debugLine="If Result = False Then";
if (true) break;

case 8:
//if
this.state = 11;
if (_result==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 167;BA.debugLine="MsgboxAsync(\"Phone access permission not allowe";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Phone access permission not allowed!"),BA.ObjectToCharSequence("Alert..."),processBA);
 //BA.debugLineNum = 168;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 11:
//C
this.state = 12;
;
 //BA.debugLineNum = 172;BA.debugLine="read_signInMethod ' get preferred method from fi";
_read_signinmethod();
 //BA.debugLineNum = 173;BA.debugLine="If gs_signInMethod = \"googleLogin\" Then";
if (true) break;

case 12:
//if
this.state = 37;
if ((parent.mostCurrent._gs_signinmethod).equals("googleLogin")) { 
this.state = 14;
}else if((parent.mostCurrent._gs_signinmethod).equals("phoneLogin")) { 
this.state = 22;
}else if((parent.mostCurrent._gs_signinmethod).equals("emailLogin")) { 
this.state = 36;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 176;BA.debugLine="auth.Initialize(\"auth\")";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize(processBA,"auth");
 //BA.debugLineNum = 177;BA.debugLine="If auth.CurrentUser.IsInitialized Then Auth_Sig";
if (true) break;

case 15:
//if
this.state = 20;
if (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getCurrentUser().IsInitialized()) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
_auth_signedin(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getCurrentUser());
if (true) break;

case 20:
//C
this.state = 37;
;
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 179;BA.debugLine="authphone.Initialize(\"authphone\")";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize(processBA,"authphone");
 //BA.debugLineNum = 180;BA.debugLine="Dim ls_phoneNumber As String = getPhoneNumber";
_ls_phonenumber = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
 //BA.debugLineNum = 181;BA.debugLine="If ls_phoneNumber <> \"\" Then gs_phoneNumber = l";
if (true) break;

case 23:
//if
this.state = 28;
if ((_ls_phonenumber).equals("") == false) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
parent._gs_phonenumber = _ls_phonenumber;
if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 182;BA.debugLine="If gs_phoneNumber = \"\" Then";
if (true) break;

case 29:
//if
this.state = 34;
if ((parent._gs_phonenumber).equals("")) { 
this.state = 31;
}else {
this.state = 33;
}if (true) break;

case 31:
//C
this.state = 34;
 //BA.debugLineNum = 183;BA.debugLine="setPhoneNumber";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
 if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 185;BA.debugLine="authphone.startPhoneNumberVerification(gs_phon";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startPhoneNumberVerification(parent._gs_phonenumber);
 if (true) break;

case 34:
//C
this.state = 37;
;
 if (true) break;

case 36:
//C
this.state = 37;
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = 39;
;
 //BA.debugLineNum = 197;BA.debugLine="childUpdates1.Initialize";
parent._vv6.Initialize();
 //BA.debugLineNum = 198;BA.debugLine="mapPostValues1.Initialize";
parent._vv5.Initialize();
 //BA.debugLineNum = 199;BA.debugLine="childUpdates3.Initialize";
parent._vv0.Initialize();
 //BA.debugLineNum = 200;BA.debugLine="mapPostValues3.Initialize";
parent._vv7.Initialize();
 //BA.debugLineNum = 203;BA.debugLine="mapPostValues1.Put(\"TIPO1\", \"OFF\")";
parent._vv5.Put((Object)("TIPO1"),(Object)("OFF"));
 //BA.debugLineNum = 204;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 205;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
parent._vv6.Put((Object)("/"+_keynode1),(Object)(parent._vv5.getObject()));
 //BA.debugLineNum = 206;BA.debugLine="ref.push";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 207;BA.debugLine="ref.updateChildren( childUpdates1)";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,parent._vv6);
 //BA.debugLineNum = 209;BA.debugLine="mapPostValues1.Put(\"TIPO2\", \"OFF\")";
parent._vv5.Put((Object)("TIPO2"),(Object)("OFF"));
 //BA.debugLineNum = 210;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 211;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
parent._vv6.Put((Object)("/"+_keynode1),(Object)(parent._vv5.getObject()));
 //BA.debugLineNum = 212;BA.debugLine="ref.push";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 213;BA.debugLine="ref.updateChildren( childUpdates1)";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,parent._vv6);
 //BA.debugLineNum = 215;BA.debugLine="mapPostValues1.Put(\"TIPO3\", \"OFF\")";
parent._vv5.Put((Object)("TIPO3"),(Object)("OFF"));
 //BA.debugLineNum = 216;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 217;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
parent._vv6.Put((Object)("/"+_keynode1),(Object)(parent._vv5.getObject()));
 //BA.debugLineNum = 218;BA.debugLine="ref.push";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 219;BA.debugLine="ref.updateChildren( childUpdates1)";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,parent._vv6);
 //BA.debugLineNum = 221;BA.debugLine="childUpdates.Initialize";
parent._vv4.Initialize();
 //BA.debugLineNum = 222;BA.debugLine="mapPostValues.Initialize";
parent._vv3.Initialize();
 //BA.debugLineNum = 224;BA.debugLine="mapPostValues.Put(\"VALVULA_I\", \"OFF\")";
parent._vv3.Put((Object)("VALVULA_I"),(Object)("OFF"));
 //BA.debugLineNum = 225;BA.debugLine="keynode = \"CULTIVO/VALVULAS\"";
parent._vvv1 = "CULTIVO/VALVULAS";
 //BA.debugLineNum = 226;BA.debugLine="childUpdates.Put(  \"/\" & keynode,  mapPostValues)";
parent._vv4.Put((Object)("/"+parent._vvv1),(Object)(parent._vv3.getObject()));
 //BA.debugLineNum = 227;BA.debugLine="ref.updateChildren( childUpdates)";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,parent._vv4);
 //BA.debugLineNum = 228;BA.debugLine="ref.push";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 230;BA.debugLine="mapPostValues.Put(\"VALVULA_R\", \"OFF\")";
parent._vv3.Put((Object)("VALVULA_R"),(Object)("OFF"));
 //BA.debugLineNum = 231;BA.debugLine="keynode = \"CULTIVO/VALVULAS\"";
parent._vvv1 = "CULTIVO/VALVULAS";
 //BA.debugLineNum = 232;BA.debugLine="childUpdates.Put(  \"/\" & keynode,  mapPostValues)";
parent._vv4.Put((Object)("/"+parent._vvv1),(Object)(parent._vv3.getObject()));
 //BA.debugLineNum = 233;BA.debugLine="ref.updateChildren( childUpdates)";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,parent._vv4);
 //BA.debugLineNum = 234;BA.debugLine="ref.push";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 236;BA.debugLine="Dim link As String =\"https://culterapp.firebaseio";
_link = "https://culterapp.firebaseio.com/CULTIVO/TIEMPO.json";
 //BA.debugLineNum = 238;BA.debugLine="Dim job22 As HttpJob";
_job22 = new com.testdb.httpjob();
 //BA.debugLineNum = 239;BA.debugLine="job22.Initialize(link, Me)";
_job22._initialize /*String*/ (processBA,_link,main.getObject());
 //BA.debugLineNum = 240;BA.debugLine="job22.Download(link)";
_job22._vvv6 /*String*/ (_link);
 //BA.debugLineNum = 241;BA.debugLine="Wait For (job22) JobDone(job22 As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_job22));
this.state = 48;
return;
case 48:
//C
this.state = 39;
_job22 = (com.testdb.httpjob) result[0];
;
 //BA.debugLineNum = 243;BA.debugLine="If job22.Success Then";
if (true) break;

case 39:
//if
this.state = 46;
if (_job22._vvvvvv4 /*boolean*/ ) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 //BA.debugLineNum = 244;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 245;BA.debugLine="res = job22.GetString";
_res = _job22._vvvv6 /*String*/ ();
 //BA.debugLineNum = 246;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 247;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 249;BA.debugLine="If res <> False Then";
if (true) break;

case 42:
//if
this.state = 45;
if ((_res).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False)) == false) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 //BA.debugLineNum = 250;BA.debugLine="Dim m1 As Map =	parser.NextObject";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
_m1 = _parser.NextObject();
 //BA.debugLineNum = 251;BA.debugLine="RHORA = \" \" &  m1.Get(\"HORA\")";
parent._vvv3 = " "+BA.ObjectToString(_m1.Get((Object)("HORA")));
 //BA.debugLineNum = 252;BA.debugLine="RPREESCRIBIR= \" \" &  m1.Get(\"PREESCRIBIR\")";
_rpreescribir = " "+BA.ObjectToString(_m1.Get((Object)("PREESCRIBIR")));
 if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = -1;
;
 //BA.debugLineNum = 258;BA.debugLine="mapPostValues3.Put(\"PREESCRIBIR\", \"OFF\")";
parent._vv7.Put((Object)("PREESCRIBIR"),(Object)("OFF"));
 //BA.debugLineNum = 259;BA.debugLine="Dim keynode3 As String = \"CULTIVO/TIEMPO\"";
_keynode3 = "CULTIVO/TIEMPO";
 //BA.debugLineNum = 260;BA.debugLine="childUpdates3.Put(  \"/\" & keynode3,  mapPostValue";
parent._vv0.Put((Object)("/"+_keynode3),(Object)(parent._vv7.getObject()));
 //BA.debugLineNum = 261;BA.debugLine="ref.push";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 262;BA.debugLine="ref.updateChildren( childUpdates3)";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,parent._vv0);
 //BA.debugLineNum = 264;BA.debugLine="mapPostValues3.Put(\"HORA\", RHORA)";
parent._vv7.Put((Object)("HORA"),(Object)(parent._vvv3));
 //BA.debugLineNum = 265;BA.debugLine="Dim keynode3 As String = \"CULTIVO/TIEMPO\"";
_keynode3 = "CULTIVO/TIEMPO";
 //BA.debugLineNum = 266;BA.debugLine="childUpdates3.Put(  \"/\" & keynode3,  mapPostValue";
parent._vv0.Put((Object)("/"+_keynode3),(Object)(parent._vv7.getObject()));
 //BA.debugLineNum = 267;BA.debugLine="ref.push";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 268;BA.debugLine="ref.updateChildren( childUpdates3)";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,parent._vv0);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _activity_permissionresult(String _permission,boolean _result) throws Exception{
}
public static void  _jobdone(com.testdb.httpjob _job22) throws Exception{
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 288;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return "";
}
public static String  _auth_signedin(anywheresoftware.b4a.objects.FirebaseAuthWrapper.FirebaseUserWrapper _user) throws Exception{
 //BA.debugLineNum = 476;BA.debugLine="Sub Auth_SignedIn(User As FirebaseUser)";
 //BA.debugLineNum = 478;BA.debugLine="If User.DisplayName <> Null Then";
if (_user.getDisplayName()!= null) { 
 //BA.debugLineNum = 479;BA.debugLine="Log(\"google SignedIn: \" & User.email)";
anywheresoftware.b4a.keywords.Common.LogImpl("724510467","google SignedIn: "+_user.getEmail(),0);
 //BA.debugLineNum = 480;BA.debugLine="Log(\"UID: \" & User.Uid)";
anywheresoftware.b4a.keywords.Common.LogImpl("724510468","UID: "+_user.getUid(),0);
 //BA.debugLineNum = 481;BA.debugLine="Log(\"User name: \" & User.DisplayName)";
anywheresoftware.b4a.keywords.Common.LogImpl("724510469","User name: "+_user.getDisplayName(),0);
 //BA.debugLineNum = 482;BA.debugLine="ToastMessageShow(\"Welcome: \" & User.email , True";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Welcome: "+_user.getEmail()),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 483;BA.debugLine="gs_signInMethod = \"googleLogin\"";
mostCurrent._gs_signinmethod = "googleLogin";
 //BA.debugLineNum = 491;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 492;BA.debugLine="Activity.LoadLayout(\"pant1\")";
mostCurrent._activity.LoadLayout("pant1",mostCurrent.activityBA);
 };
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return "";
}
public static String  _auth_usercreated(anywheresoftware.b4a.objects.FirebaseAuthWrapper.FirebaseUserWrapper _user) throws Exception{
 //BA.debugLineNum = 498;BA.debugLine="Sub auth_UserCreated(User As FirebaseUser)";
 //BA.debugLineNum = 500;BA.debugLine="ToastMessageShow(\"User created successfully!\" , F";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("User created successfully!"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 501;BA.debugLine="End Sub";
return "";
}
public static void  _authemail_createfailure(boolean _success,String _info) throws Exception{
ResumableSub_authemail_createfailure rsub = new ResumableSub_authemail_createfailure(null,_success,_info);
rsub.resume(processBA, null);
}
public static class ResumableSub_authemail_createfailure extends BA.ResumableSub {
public ResumableSub_authemail_createfailure(com.testdb.main parent,boolean _success,String _info) {
this.parent = parent;
this._success = _success;
this._info = _info;
}
com.testdb.main parent;
boolean _success;
String _info;
int _response = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 730;BA.debugLine="If info.Contains(\"La dirección de correo electrón";
if (true) break;

case 1:
//if
this.state = 14;
if (_info.contains("La dirección de correo electrónico ya está siendo utilizada por otra cuenta.")) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 731;BA.debugLine="Msgbox2Async(\"Dirección de correo electrónico \"&";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Dirección de correo electrónico "+anywheresoftware.b4a.keywords.Common.CRLF+"<"+parent.mostCurrent._fet_regemail._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ()+">"+anywheresoftware.b4a.keywords.Common.CRLF+"ya está en uso por otro usuario!"+anywheresoftware.b4a.keywords.Common.CRLF+"presiona <reintentar> para corregir el correo electrónico."+anywheresoftware.b4a.keywords.Common.CRLF+"Si el correo electrónico es correcto vaya a <Ingresar>"),BA.ObjectToCharSequence("Alerta!"),"Reintenta","Ingresar","Cancelar",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"unreg_user.png"),processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 737;BA.debugLine="wait for MsgBox_result(response As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 15;
return;
case 15:
//C
this.state = 4;
_response = (Integer) result[0];
;
 //BA.debugLineNum = 738;BA.debugLine="If response = -1 Then";
if (true) break;

case 4:
//if
this.state = 11;
if (_response==-1) { 
this.state = 6;
}else if(_response==-3) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 6:
//C
this.state = 11;
 //BA.debugLineNum = 739;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 11;
 //BA.debugLineNum = 741;BA.debugLine="Activity.RemoveAllViews";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 742;BA.debugLine="Activity.LoadLayout(\"emaillogin\")";
parent.mostCurrent._activity.LoadLayout("emaillogin",mostCurrent.activityBA);
 if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 744;BA.debugLine="Activity.RemoveAllViews";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 745;BA.debugLine="Activity.LoadLayout(\"main\")";
parent.mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 751;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _msgbox_result(int _response) throws Exception{
}
public static String  _authemail_passwordreset(boolean _success,String _info) throws Exception{
 //BA.debugLineNum = 867;BA.debugLine="Sub authemail_passwordreset(success As Boolean, in";
 //BA.debugLineNum = 869;BA.debugLine="Log($\"AuthEmail_PasswordReset(${success})\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("725952258",("AuthEmail_PasswordReset("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_success))+")"),0);
 //BA.debugLineNum = 870;BA.debugLine="Log(info)";
anywheresoftware.b4a.keywords.Common.LogImpl("725952259",_info,0);
 //BA.debugLineNum = 871;BA.debugLine="End Sub";
return "";
}
public static void  _authemail_signedinfailure(boolean _success,String _info) throws Exception{
ResumableSub_authemail_signedinfailure rsub = new ResumableSub_authemail_signedinfailure(null,_success,_info);
rsub.resume(processBA, null);
}
public static class ResumableSub_authemail_signedinfailure extends BA.ResumableSub {
public ResumableSub_authemail_signedinfailure(com.testdb.main parent,boolean _success,String _info) {
this.parent = parent;
this._success = _success;
this._info = _info;
}
com.testdb.main parent;
boolean _success;
String _info;
String _msg = "";
int _response = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 702;BA.debugLine="Dim msg As String = \"\"";
_msg = "";
 //BA.debugLineNum = 703;BA.debugLine="If info.Contains(\"El usuario puede haber sido eli";
if (true) break;

case 1:
//if
this.state = 8;
if (_info.contains("El usuario puede haber sido eliminado") || _info.contains("The email address is badly formatted")) { 
this.state = 3;
}else if(_info.contains("The password is invalid")) { 
this.state = 5;
}else {
this.state = 7;
}if (true) break;

case 3:
//C
this.state = 8;
 //BA.debugLineNum = 705;BA.debugLine="msg = \"Unknown user!\"& CRLF &\"Email <\" & fet_ema";
_msg = "Unknown user!"+anywheresoftware.b4a.keywords.Common.CRLF+"Email <"+parent.mostCurrent._fet_email._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ()+"> doesn't exist in our records.";
 if (true) break;

case 5:
//C
this.state = 8;
 //BA.debugLineNum = 707;BA.debugLine="msg = \"Invalid password!\"";
_msg = "Invalid password!";
 if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 709;BA.debugLine="ToastMessageShow(\"Login failed, retry!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Login failed, retry!"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
 //BA.debugLineNum = 711;BA.debugLine="If msg <> \"\" Then";

case 8:
//if
this.state = 19;
if ((_msg).equals("") == false) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 712;BA.debugLine="Msgbox2Async(msg, \"Error!\",\"Retry\",\"Register new";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_msg),BA.ObjectToCharSequence("Error!"),"Retry","Register new account","Cancel",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"unreg_user.png"),processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 713;BA.debugLine="wait for MsgBox_result(response As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 20;
return;
case 20:
//C
this.state = 11;
_response = (Integer) result[0];
;
 //BA.debugLineNum = 714;BA.debugLine="If response = -1 Then";
if (true) break;

case 11:
//if
this.state = 18;
if (_response==-1) { 
this.state = 13;
}else if(_response==-3) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 13:
//C
this.state = 18;
 //BA.debugLineNum = 715;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 15:
//C
this.state = 18;
 //BA.debugLineNum = 717;BA.debugLine="Activity.RemoveAllViews";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 718;BA.debugLine="Activity.LoadLayout(\"createEmailAccount\")";
parent.mostCurrent._activity.LoadLayout("createEmailAccount",mostCurrent.activityBA);
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 720;BA.debugLine="Activity.RemoveAllViews";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 721;BA.debugLine="Activity.LoadLayout(\"main\")";
parent.mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = -1;
;
 //BA.debugLineNum = 724;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _authphone_oncodesent(boolean _success,String _verificationid) throws Exception{
 //BA.debugLineNum = 625;BA.debugLine="Sub authphone_oncodesent(success As Boolean, verif";
 //BA.debugLineNum = 627;BA.debugLine="If success = True And gb_phoneVerificationSuccess";
if (_success==anywheresoftware.b4a.keywords.Common.True && _gb_phoneverificationsuccess==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 628;BA.debugLine="gs_verificationID = verificationid";
_gs_verificationid = _verificationid;
 //BA.debugLineNum = 629;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 630;BA.debugLine="Activity.LoadLayout(\"phonelogin\")";
mostCurrent._activity.LoadLayout("phonelogin",mostCurrent.activityBA);
 };
 //BA.debugLineNum = 632;BA.debugLine="Log(\"authphone_oncodesent success\" & success)";
anywheresoftware.b4a.keywords.Common.LogImpl("725165831","authphone_oncodesent success"+BA.ObjectToString(_success),0);
 //BA.debugLineNum = 633;BA.debugLine="End Sub";
return "";
}
public static String  _authphone_phonesignedin(boolean _success,anywheresoftware.b4a.FirebaseAuthPhone.FirebaseAuthPhoneWrapper.FirebaseAuthPhoneUserWrapper _user,String _info) throws Exception{
 //BA.debugLineNum = 601;BA.debugLine="Sub authphone_phonesignedin(success As Boolean, Us";
 //BA.debugLineNum = 603;BA.debugLine="If success = True Then";
if (_success==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 604;BA.debugLine="Log(\"Phone Signed In: \")";
anywheresoftware.b4a.keywords.Common.LogImpl("725100291","Phone Signed In: ",0);
 //BA.debugLineNum = 605;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 606;BA.debugLine="Activity.LoadLayout(\"main2\")";
mostCurrent._activity.LoadLayout("main2",mostCurrent.activityBA);
 //BA.debugLineNum = 607;BA.debugLine="Log (\"IsInitialized: \" & User.IsInitialized)";
anywheresoftware.b4a.keywords.Common.LogImpl("725100294","IsInitialized: "+BA.ObjectToString(_user.IsInitialized()),0);
 //BA.debugLineNum = 608;BA.debugLine="Log (\"ProviderId:\" & User.ProviderId)";
anywheresoftware.b4a.keywords.Common.LogImpl("725100295","ProviderId:"+_user.getProviderId(),0);
 //BA.debugLineNum = 609;BA.debugLine="Log (\"Uid:\" & User.Uid)";
anywheresoftware.b4a.keywords.Common.LogImpl("725100296","Uid:"+_user.getUid(),0);
 //BA.debugLineNum = 610;BA.debugLine="gs_signInMethod = \"phoneLogin\"";
mostCurrent._gs_signinmethod = "phoneLogin";
 //BA.debugLineNum = 611;BA.debugLine="save_signInMethod";
_save_signinmethod();
 //BA.debugLineNum = 612;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 613;BA.debugLine="Activity.LoadLayout(\"main2\")";
mostCurrent._activity.LoadLayout("main2",mostCurrent.activityBA);
 //BA.debugLineNum = 614;BA.debugLine="labelLogInMethod.Text = \"Logged in with Phone nu";
mostCurrent._labelloginmethod.setText(BA.ObjectToCharSequence("Logged in with Phone number"));
 //BA.debugLineNum = 615;BA.debugLine="LabelUser.Text =  \"phone: \" & gs_phoneNumber";
mostCurrent._labeluser.setText(BA.ObjectToCharSequence("phone: "+_gs_phonenumber));
 }else {
 //BA.debugLineNum = 618;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 619;BA.debugLine="Activity.LoadLayout(\"main\")";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
 };
 //BA.debugLineNum = 621;BA.debugLine="End Sub";
return "";
}
public static String  _authphone_phoneverification(boolean _success,String _info) throws Exception{
 //BA.debugLineNum = 585;BA.debugLine="Sub authphone_phoneverification(success As Boolean";
 //BA.debugLineNum = 587;BA.debugLine="If success = True Then";
if (_success==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 588;BA.debugLine="ToastMessageShow(\"Phone number successfully veri";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Phone number successfully verified!"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 589;BA.debugLine="gb_phoneVerificationSuccess = True";
_gb_phoneverificationsuccess = anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 591;BA.debugLine="MsgboxAsync(\"Phone number verification failed!\"&";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Phone number verification failed!"+anywheresoftware.b4a.keywords.Common.CRLF+"info: "+_info),BA.ObjectToCharSequence("Alert..."),processBA);
 //BA.debugLineNum = 592;BA.debugLine="gs_phoneNumber = \"\"";
_gs_phonenumber = "";
 //BA.debugLineNum = 593;BA.debugLine="gs_signInMethod = \"\"";
mostCurrent._gs_signinmethod = "";
 //BA.debugLineNum = 594;BA.debugLine="save_signInMethod";
_save_signinmethod();
 //BA.debugLineNum = 595;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 596;BA.debugLine="Activity.LoadLayout(\"main\")";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
 };
 //BA.debugLineNum = 598;BA.debugLine="End Sub";
return "";
}
public static String  _b_emaillogin_click() throws Exception{
 //BA.debugLineNum = 640;BA.debugLine="Sub b_emailLogin_Click";
 //BA.debugLineNum = 642;BA.debugLine="authemail.Initialize(\"authemail\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize(processBA,"authemail");
 //BA.debugLineNum = 643;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 644;BA.debugLine="Activity.LoadLayout(\"emaillogin\")";
mostCurrent._activity.LoadLayout("emaillogin",mostCurrent.activityBA);
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return "";
}
public static void  _b_emailregistration_click() throws Exception{
ResumableSub_b_emailRegistration_Click rsub = new ResumableSub_b_emailRegistration_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_b_emailRegistration_Click extends BA.ResumableSub {
public ResumableSub_b_emailRegistration_Click(com.testdb.main parent) {
this.parent = parent;
}
com.testdb.main parent;
boolean _success = false;
anywheresoftware.b4a.FirebaseAuthEmail.FirebaseAuthEmailWrapper.FirebaseAuthEmailUserWrapper _user = null;
String _info = "";
int _response = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 763;BA.debugLine="If fet_regemailpassword.Text.trim <> fet_regemail";
if (true) break;

case 1:
//if
this.state = 38;
if ((parent.mostCurrent._fet_regemailpassword._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim()).equals(parent.mostCurrent._fet_regemailpassword2._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim()) == false) { 
this.state = 3;
}else if((parent.mostCurrent._fet_regemail._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim()).equals("")) { 
this.state = 5;
}else if((parent.mostCurrent._fet_regemailpassword._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim()).equals("") || (parent.mostCurrent._fet_regemailpassword2._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim()).equals("")) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 38;
 //BA.debugLineNum = 764;BA.debugLine="MsgboxAsync(\"Las contraseñas no coinciden.\",\"Err";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Las contraseñas no coinciden."),BA.ObjectToCharSequence("Error!"),processBA);
 //BA.debugLineNum = 765;BA.debugLine="fet_regemailpassword.RequestFocusAndShowKeyboard";
parent.mostCurrent._fet_regemailpassword._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*String*/ ();
 if (true) break;

case 5:
//C
this.state = 38;
 //BA.debugLineNum = 767;BA.debugLine="MsgboxAsync(\"Introduce tu correo electrónico!.\",";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Introduce tu correo electrónico!."),BA.ObjectToCharSequence("Alerta!"),processBA);
 if (true) break;

case 7:
//C
this.state = 38;
 //BA.debugLineNum = 769;BA.debugLine="MsgboxAsync(\"¡Tienes que escribir tu contraseña";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("¡Tienes que escribir tu contraseña en los dos campos de la contraseña!"),BA.ObjectToCharSequence("Alerta!"),processBA);
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 771;BA.debugLine="checkEmail(fet_regemail.Text)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(parent.mostCurrent._fet_regemail._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ());
 //BA.debugLineNum = 772;BA.debugLine="authemail.createUserWithEmailAndPassword(fet_reg";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.createUserWithEmailAndPassword(processBA,parent.mostCurrent._fet_regemail._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim(),parent.mostCurrent._fet_regemailpassword._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim());
 //BA.debugLineNum = 773;BA.debugLine="wait for authemail_usercreated(success As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("authemail_usercreated", processBA, this, null);
this.state = 39;
return;
case 39:
//C
this.state = 10;
_success = (Boolean) result[0];
_user = (anywheresoftware.b4a.FirebaseAuthEmail.FirebaseAuthEmailWrapper.FirebaseAuthEmailUserWrapper) result[1];
_info = (String) result[2];
;
 //BA.debugLineNum = 775;BA.debugLine="If success Then";
if (true) break;

case 10:
//if
this.state = 37;
if (_success) { 
this.state = 12;
}else {
this.state = 36;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 776;BA.debugLine="If User = Null Then";
if (true) break;

case 13:
//if
this.state = 34;
if (_user== null) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 34;
 //BA.debugLineNum = 777;BA.debugLine="Log(\"null User SignedIn: \")";
anywheresoftware.b4a.keywords.Common.LogImpl("725559056","null User SignedIn: ",0);
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 779;BA.debugLine="Log(\"SignedIn: \" & User.Uid)";
anywheresoftware.b4a.keywords.Common.LogImpl("725559058","SignedIn: "+_user.getUid(),0);
 //BA.debugLineNum = 780;BA.debugLine="Log(\"User: \" & User.DisplayName)";
anywheresoftware.b4a.keywords.Common.LogImpl("725559059","User: "+_user.getDisplayName(),0);
 //BA.debugLineNum = 781;BA.debugLine="Log(\"eMail: \" & User.Email)";
anywheresoftware.b4a.keywords.Common.LogImpl("725559060","eMail: "+_user.getEmail(),0);
 //BA.debugLineNum = 782;BA.debugLine="Log(\"Anonymous: \" & User.Anonymous)";
anywheresoftware.b4a.keywords.Common.LogImpl("725559061","Anonymous: "+BA.ObjectToString(_user.getAnonymous()),0);
 //BA.debugLineNum = 783;BA.debugLine="Log(\"email verified: \" & User.EmailVerified)";
anywheresoftware.b4a.keywords.Common.LogImpl("725559062","email verified: "+BA.ObjectToString(_user.getEmailVerified()),0);
 //BA.debugLineNum = 785;BA.debugLine="If User.EmailVerified = False Then";
if (true) break;

case 18:
//if
this.state = 33;
if (_user.getEmailVerified()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 786;BA.debugLine="Do While True";
if (true) break;

case 21:
//do while
this.state = 32;
while (anywheresoftware.b4a.keywords.Common.True) {
this.state = 23;
if (true) break;
}
if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 787;BA.debugLine="User.sendEmailVerification";
_user.sendEmailVerification();
 //BA.debugLineNum = 788;BA.debugLine="Msgbox2Async(\"En breve recibirá un correo el";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("En breve recibirá un correo electrónico a "+anywheresoftware.b4a.keywords.Common.CRLF+"<"+parent.mostCurrent._fet_regemail._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ()+">"+anywheresoftware.b4a.keywords.Common.CRLF+"Haz clic en el enlace del correo electrónico para activar tu cuenta!"),BA.ObjectToCharSequence("Alert!"),"Reenviar el correo de confirmación","Reintentar el acceso","Cancelar",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"unreg_user.png"),processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 792;BA.debugLine="wait for MsgBox_result(response As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 40;
return;
case 40:
//C
this.state = 24;
_response = (Integer) result[0];
;
 //BA.debugLineNum = 793;BA.debugLine="If response = -1 Then";
if (true) break;

case 24:
//if
this.state = 31;
if (_response==-1) { 
this.state = 26;
}else if(_response==-3) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 26:
//C
this.state = 31;
 if (true) break;

case 28:
//C
this.state = 31;
 //BA.debugLineNum = 796;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 798;BA.debugLine="Activity.RemoveAllViews";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 799;BA.debugLine="Activity.LoadLayout(\"main\")";
parent.mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
 //BA.debugLineNum = 800;BA.debugLine="Exit";
this.state = 32;
if (true) break;
 if (true) break;

case 31:
//C
this.state = 21;
;
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = 37;
;
 if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 808;BA.debugLine="ToastMessageShow(\"Falló la entrada, ¡reintenta!";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Falló la entrada, ¡reintenta!"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 809;BA.debugLine="Log(\"Info: \" & info)";
anywheresoftware.b4a.keywords.Common.LogImpl("725559088","Info: "+_info,0);
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = -1;
;
 //BA.debugLineNum = 814;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _authemail_usercreated(boolean _success,anywheresoftware.b4a.FirebaseAuthEmail.FirebaseAuthEmailWrapper.FirebaseAuthEmailUserWrapper _user,String _info) throws Exception{
}
public static void  _b_emailresetpassword_click() throws Exception{
ResumableSub_b_emailResetPassword_Click rsub = new ResumableSub_b_emailResetPassword_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_b_emailResetPassword_Click extends BA.ResumableSub {
public ResumableSub_b_emailResetPassword_Click(com.testdb.main parent) {
this.parent = parent;
}
com.testdb.main parent;
int _response = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 886;BA.debugLine="If fet_emailReset.Text.trim  = \"\" Then";
if (true) break;

case 1:
//if
this.state = 20;
if ((parent.mostCurrent._fet_emailreset._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim()).equals("")) { 
this.state = 3;
}else if(parent.mostCurrent._fet_emailreset._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim().contains("@")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 5;
}else {
this.state = 7;
}if (true) break;

case 3:
//C
this.state = 20;
 //BA.debugLineNum = 887;BA.debugLine="MsgboxAsync(\"Introduce tu correo electrónico! \",";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Introduce tu correo electrónico! "),BA.ObjectToCharSequence("Error!"),processBA);
 if (true) break;

case 5:
//C
this.state = 20;
 //BA.debugLineNum = 889;BA.debugLine="MsgboxAsync(\"¡Correo electrónico inválido! \",\"Er";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("¡Correo electrónico inválido! "),BA.ObjectToCharSequence("Error!"),processBA);
 if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 891;BA.debugLine="Do While True";
if (true) break;

case 8:
//do while
this.state = 19;
while (anywheresoftware.b4a.keywords.Common.True) {
this.state = 10;
if (true) break;
}
if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 892;BA.debugLine="authemail.sendPasswordResetEmail(fet_emailReset";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.sendPasswordResetEmail(processBA,parent.mostCurrent._fet_emailreset._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim());
 //BA.debugLineNum = 893;BA.debugLine="Msgbox2Async(\"El correo electrónico ha sido env";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("El correo electrónico ha sido enviado a la dirección: "+anywheresoftware.b4a.keywords.Common.CRLF+"<"+parent.mostCurrent._fet_emailreset._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ()+">"+anywheresoftware.b4a.keywords.Common.CRLF+"establecer una nueva contraseña e intentarlo de nuevo!"),BA.ObjectToCharSequence("Alert!"),"Solicite el correo electrónico de nuevo","Ingresar","Cancelar",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"unreg_user.png"),processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 897;BA.debugLine="wait for MsgBox_result(response As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 21;
return;
case 21:
//C
this.state = 11;
_response = (Integer) result[0];
;
 //BA.debugLineNum = 898;BA.debugLine="If response = -1 Then";
if (true) break;

case 11:
//if
this.state = 18;
if (_response==-1) { 
this.state = 13;
}else if(_response==-3) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 13:
//C
this.state = 18;
 //BA.debugLineNum = 899;BA.debugLine="Exit";
this.state = 19;
if (true) break;
 if (true) break;

case 15:
//C
this.state = 18;
 //BA.debugLineNum = 901;BA.debugLine="Activity.RemoveAllViews";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 902;BA.debugLine="Activity.LoadLayout(\"emaillogin\")";
parent.mostCurrent._activity.LoadLayout("emaillogin",mostCurrent.activityBA);
 //BA.debugLineNum = 903;BA.debugLine="Exit";
this.state = 19;
if (true) break;
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 906;BA.debugLine="Activity.RemoveAllViews";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 907;BA.debugLine="Activity.LoadLayout(\"main\")";
parent.mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
 //BA.debugLineNum = 908;BA.debugLine="Exit";
this.state = 19;
if (true) break;
 if (true) break;

case 18:
//C
this.state = 8;
;
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _b_emailsignin_click() throws Exception{
ResumableSub_b_emailSignIn_Click rsub = new ResumableSub_b_emailSignIn_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_b_emailSignIn_Click extends BA.ResumableSub {
public ResumableSub_b_emailSignIn_Click(com.testdb.main parent) {
this.parent = parent;
}
com.testdb.main parent;
boolean _success = false;
anywheresoftware.b4a.FirebaseAuthEmail.FirebaseAuthEmailWrapper.FirebaseAuthEmailUserWrapper _user = null;
String _info = "";
int _response = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 651;BA.debugLine="If checkEmail(fet_email.text) Then";
if (true) break;

case 1:
//if
this.state = 28;
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(parent.mostCurrent._fet_email._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ())) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 652;BA.debugLine="authemail.signInWithEmailAndPassword(fet_email.T";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.signInWithEmailAndPassword(processBA,parent.mostCurrent._fet_email._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim(),parent.mostCurrent._fet_emailpassword._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim());
 //BA.debugLineNum = 654;BA.debugLine="wait for authemail_signedin(success As Boolean,";
anywheresoftware.b4a.keywords.Common.WaitFor("authemail_signedin", processBA, this, null);
this.state = 29;
return;
case 29:
//C
this.state = 4;
_success = (Boolean) result[0];
_user = (anywheresoftware.b4a.FirebaseAuthEmail.FirebaseAuthEmailWrapper.FirebaseAuthEmailUserWrapper) result[1];
_info = (String) result[2];
;
 //BA.debugLineNum = 655;BA.debugLine="If success Then";
if (true) break;

case 4:
//if
this.state = 27;
if (_success) { 
this.state = 6;
}else {
this.state = 26;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 656;BA.debugLine="Log(\"SignedIn: \" & User.Uid)";
anywheresoftware.b4a.keywords.Common.LogImpl("725296903","SignedIn: "+_user.getUid(),0);
 //BA.debugLineNum = 657;BA.debugLine="Log(\"User: \" & User.DisplayName)";
anywheresoftware.b4a.keywords.Common.LogImpl("725296904","User: "+_user.getDisplayName(),0);
 //BA.debugLineNum = 658;BA.debugLine="Log(\"eMail: \" & User.Email)";
anywheresoftware.b4a.keywords.Common.LogImpl("725296905","eMail: "+_user.getEmail(),0);
 //BA.debugLineNum = 659;BA.debugLine="Log(\"Anonymous: \" & User.Anonymous)";
anywheresoftware.b4a.keywords.Common.LogImpl("725296906","Anonymous: "+BA.ObjectToString(_user.getAnonymous()),0);
 //BA.debugLineNum = 660;BA.debugLine="Log(\"mail verified: \" & User.EmailVerified)";
anywheresoftware.b4a.keywords.Common.LogImpl("725296907","mail verified: "+BA.ObjectToString(_user.getEmailVerified()),0);
 //BA.debugLineNum = 662;BA.debugLine="If User.EmailVerified = False Then";
if (true) break;

case 7:
//if
this.state = 24;
if (_user.getEmailVerified()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 9;
}else {
this.state = 23;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 663;BA.debugLine="Do While True";
if (true) break;

case 10:
//do while
this.state = 21;
while (anywheresoftware.b4a.keywords.Common.True) {
this.state = 12;
if (true) break;
}
if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 664;BA.debugLine="User.sendEmailVerification";
_user.sendEmailVerification();
 //BA.debugLineNum = 665;BA.debugLine="Msgbox2Async(\"En breve recibirá un correo ele";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("En breve recibirá un correo electrónico a "+anywheresoftware.b4a.keywords.Common.CRLF+"<"+parent.mostCurrent._fet_regemail._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ()+">"+anywheresoftware.b4a.keywords.Common.CRLF+"Haz clic en el enlace del correo electrónico para activar tu cuenta!"),BA.ObjectToCharSequence("Alerta!"),"Reenviar el correo de confirmación","Reintentar el acceso","Cancelar",anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"unreg_user.png"),processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 669;BA.debugLine="wait for MsgBox_result(response As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, this, null);
this.state = 30;
return;
case 30:
//C
this.state = 13;
_response = (Integer) result[0];
;
 //BA.debugLineNum = 670;BA.debugLine="If response = -1 Then";
if (true) break;

case 13:
//if
this.state = 20;
if (_response==-1) { 
this.state = 15;
}else if(_response==-3) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 15:
//C
this.state = 20;
 if (true) break;

case 17:
//C
this.state = 20;
 //BA.debugLineNum = 673;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 675;BA.debugLine="Activity.RemoveAllViews";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 676;BA.debugLine="Activity.LoadLayout(\"main\")";
parent.mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
 //BA.debugLineNum = 677;BA.debugLine="Exit";
this.state = 21;
if (true) break;
 if (true) break;

case 20:
//C
this.state = 10;
;
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 682;BA.debugLine="Log(\"Firmado y verificado por el usuario: \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("725296929","Firmado y verificado por el usuario: "+_user.getEmail(),0);
 //BA.debugLineNum = 683;BA.debugLine="gs_signInMethod = \"emailLogin\"";
parent.mostCurrent._gs_signinmethod = "emailLogin";
 //BA.debugLineNum = 684;BA.debugLine="save_signInMethod";
_save_signinmethod();
 //BA.debugLineNum = 689;BA.debugLine="Activity.RemoveAllViews";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 690;BA.debugLine="Activity.LoadLayout(\"pant1\")";
parent.mostCurrent._activity.LoadLayout("pant1",mostCurrent.activityBA);
 if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 693;BA.debugLine="ToastMessageShow(\"Login failed!\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Login failed!"),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 694;BA.debugLine="Log(\"Info: \" & info)";
anywheresoftware.b4a.keywords.Common.LogImpl("725296941","Info: "+_info,0);
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = -1;
;
 //BA.debugLineNum = 697;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _authemail_signedin(boolean _success,anywheresoftware.b4a.FirebaseAuthEmail.FirebaseAuthEmailWrapper.FirebaseAuthEmailUserWrapper _user,String _info) throws Exception{
}
public static String  _b_googlelogin_click() throws Exception{
 //BA.debugLineNum = 469;BA.debugLine="Sub b_googleLogin_Click";
 //BA.debugLineNum = 471;BA.debugLine="auth.Initialize(\"auth\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize(processBA,"auth");
 //BA.debugLineNum = 472;BA.debugLine="auth.SignInWithGoogle";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.SignInWithGoogle(processBA);
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return "";
}
public static String  _b_phonelogin_click() throws Exception{
String _ls_phonenumber = "";
 //BA.debugLineNum = 510;BA.debugLine="Sub b_phoneLogin_Click";
 //BA.debugLineNum = 512;BA.debugLine="authphone.Initialize(\"authphone\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize(processBA,"authphone");
 //BA.debugLineNum = 513;BA.debugLine="Dim ls_phoneNumber As String = getPhoneNumber";
_ls_phonenumber = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
 //BA.debugLineNum = 514;BA.debugLine="If ls_phoneNumber <> \"\" Then gs_phoneNumber = ls_";
if ((_ls_phonenumber).equals("") == false) { 
_gs_phonenumber = _ls_phonenumber;};
 //BA.debugLineNum = 515;BA.debugLine="If gs_phoneNumber = \"\" Then";
if ((_gs_phonenumber).equals("")) { 
 //BA.debugLineNum = 516;BA.debugLine="setPhoneNumber";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
 }else {
 //BA.debugLineNum = 518;BA.debugLine="authphone.startPhoneNumberVerification(gs_phoneN";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startPhoneNumberVerification(_gs_phonenumber);
 };
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return "";
}
public static String  _b_phonesignin_click() throws Exception{
String _ls_code = "";
 //BA.debugLineNum = 523;BA.debugLine="Sub b_PhoneSignIn_Click";
 //BA.debugLineNum = 528;BA.debugLine="Dim ls_code As String = fet_smsCode.Text";
_ls_code = mostCurrent._fet_smscode._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ();
 //BA.debugLineNum = 529;BA.debugLine="If fet_phonenumber.Text = \"\" Then";
if ((mostCurrent._fet_phonenumber._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ()).equals("")) { 
 //BA.debugLineNum = 530;BA.debugLine="MsgboxAsync(\"phone number field empty!\", \"Alert.";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("phone number field empty!"),BA.ObjectToCharSequence("Alert..."),processBA);
 }else if((mostCurrent._fet_smscode._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ()).equals("")) { 
 //BA.debugLineNum = 532;BA.debugLine="MsgboxAsync(\"sms code field empty!\", \"Alert...\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("sms code field empty!"),BA.ObjectToCharSequence("Alert..."),processBA);
 }else {
 //BA.debugLineNum = 534;BA.debugLine="authphone.verifyPhoneNumberWithCode(gs_verificat";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.verifyPhoneNumberWithCode(_gs_verificationid,_ls_code);
 };
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return "";
}
public static String  _b_setphonenumber_click() throws Exception{
String _ls_phonenr = "";
 //BA.debugLineNum = 567;BA.debugLine="Sub b_setPhoneNumber_Click";
 //BA.debugLineNum = 569;BA.debugLine="Dim ls_phoneNr As String = fet_setphonenumber.Tex";
_ls_phonenr = mostCurrent._fet_setphonenumber._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim();
 //BA.debugLineNum = 570;BA.debugLine="If ls_phoneNr.StartsWith(\"+\") = False  Then";
if (_ls_phonenr.startsWith("+")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 571;BA.debugLine="MsgboxAsync(\"Please digit complete Phone number";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please digit complete Phone number using +xx prefix!"),BA.ObjectToCharSequence("Alert..."),processBA);
 //BA.debugLineNum = 572;BA.debugLine="Return";
if (true) return "";
 }else if(mostCurrent._fet_setphonenumber._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().length()<=9) { 
 //BA.debugLineNum = 574;BA.debugLine="MsgboxAsync(\"Please digit complete Phone number";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please digit complete Phone number using +xx prefix!"),BA.ObjectToCharSequence("Alert..."),processBA);
 //BA.debugLineNum = 575;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 577;BA.debugLine="gs_phoneNumber = fet_setphonenumber.text";
_gs_phonenumber = mostCurrent._fet_setphonenumber._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ();
 //BA.debugLineNum = 578;BA.debugLine="authphone.startPhoneNumberVerification(gs_phoneN";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.startPhoneNumberVerification(_gs_phonenumber);
 //BA.debugLineNum = 579;BA.debugLine="save_signInMethod";
_save_signinmethod();
 };
 //BA.debugLineNum = 581;BA.debugLine="End Sub";
return "";
}
public static String  _btnamarillo_click() throws Exception{
String _keynode1 = "";
 //BA.debugLineNum = 1092;BA.debugLine="Sub BtnAmarillo_Click";
 //BA.debugLineNum = 1093;BA.debugLine="mapPostValues1.Put(\"TIPO1\", \"AMARILLO\")";
_vv5.Put((Object)("TIPO1"),(Object)("AMARILLO"));
 //BA.debugLineNum = 1094;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 1095;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
_vv6.Put((Object)("/"+_keynode1),(Object)(_vv5.getObject()));
 //BA.debugLineNum = 1096;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1097;BA.debugLine="ref.updateChildren( childUpdates1)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv6);
 //BA.debugLineNum = 1098;BA.debugLine="End Sub";
return "";
}
public static String  _btnamarillo2_click() throws Exception{
String _keynode1 = "";
 //BA.debugLineNum = 1100;BA.debugLine="Sub BtnAmarillo2_Click";
 //BA.debugLineNum = 1102;BA.debugLine="mapPostValues1.Put(\"TIPO2\", \"AMARILLO\")";
_vv5.Put((Object)("TIPO2"),(Object)("AMARILLO"));
 //BA.debugLineNum = 1103;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 1104;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
_vv6.Put((Object)("/"+_keynode1),(Object)(_vv5.getObject()));
 //BA.debugLineNum = 1105;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1106;BA.debugLine="ref.updateChildren( childUpdates1)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv6);
 //BA.debugLineNum = 1107;BA.debugLine="End Sub";
return "";
}
public static String  _btnamarillo3_click() throws Exception{
String _keynode1 = "";
 //BA.debugLineNum = 1127;BA.debugLine="Sub BtnAmarillo3_Click";
 //BA.debugLineNum = 1129;BA.debugLine="mapPostValues1.Put(\"TIPO3\", \"AMARILLO\")";
_vv5.Put((Object)("TIPO3"),(Object)("AMARILLO"));
 //BA.debugLineNum = 1130;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 1131;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
_vv6.Put((Object)("/"+_keynode1),(Object)(_vv5.getObject()));
 //BA.debugLineNum = 1132;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1133;BA.debugLine="ref.updateChildren( childUpdates1)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv6);
 //BA.debugLineNum = 1134;BA.debugLine="End Sub";
return "";
}
public static String  _btnatras_click() throws Exception{
 //BA.debugLineNum = 1034;BA.debugLine="Sub BtnAtras_Click";
 //BA.debugLineNum = 1035;BA.debugLine="Activity.RemoveAllViews ''quita todas las pantall";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 1036;BA.debugLine="Activity.LoadLayout(\"pant1\")";
mostCurrent._activity.LoadLayout("pant1",mostCurrent.activityBA);
 //BA.debugLineNum = 1037;BA.debugLine="End Sub";
return "";
}
public static String  _btnazul_click() throws Exception{
String _keynode1 = "";
 //BA.debugLineNum = 1084;BA.debugLine="Sub BtnAzul_Click";
 //BA.debugLineNum = 1085;BA.debugLine="mapPostValues1.Put(\"TIPO1\", \"AZUL\")";
_vv5.Put((Object)("TIPO1"),(Object)("AZUL"));
 //BA.debugLineNum = 1086;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 1087;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
_vv6.Put((Object)("/"+_keynode1),(Object)(_vv5.getObject()));
 //BA.debugLineNum = 1088;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1089;BA.debugLine="ref.updateChildren( childUpdates1)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv6);
 //BA.debugLineNum = 1090;BA.debugLine="End Sub";
return "";
}
public static String  _btnazul2_click() throws Exception{
String _keynode1 = "";
 //BA.debugLineNum = 1109;BA.debugLine="Sub BtnAzul2_Click";
 //BA.debugLineNum = 1111;BA.debugLine="mapPostValues1.Put(\"TIPO2\", \"AZUL\")";
_vv5.Put((Object)("TIPO2"),(Object)("AZUL"));
 //BA.debugLineNum = 1112;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 1113;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
_vv6.Put((Object)("/"+_keynode1),(Object)(_vv5.getObject()));
 //BA.debugLineNum = 1114;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1115;BA.debugLine="ref.updateChildren( childUpdates1)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv6);
 //BA.debugLineNum = 1116;BA.debugLine="End Sub";
return "";
}
public static String  _btnazul3_click() throws Exception{
String _keynode1 = "";
 //BA.debugLineNum = 1136;BA.debugLine="Sub BtnAzul3_Click";
 //BA.debugLineNum = 1138;BA.debugLine="mapPostValues1.Put(\"TIPO3\", \"AZUL\")";
_vv5.Put((Object)("TIPO3"),(Object)("AZUL"));
 //BA.debugLineNum = 1139;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 1140;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
_vv6.Put((Object)("/"+_keynode1),(Object)(_vv5.getObject()));
 //BA.debugLineNum = 1141;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1142;BA.debugLine="ref.updateChildren( childUpdates1)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv6);
 //BA.debugLineNum = 1143;BA.debugLine="End Sub";
return "";
}
public static String  _btnguardar_click() throws Exception{
String _keynode3 = "";
 //BA.debugLineNum = 1307;BA.debugLine="Sub BtnGuardar_Click";
 //BA.debugLineNum = 1309;BA.debugLine="TIEMPO=edtHora.Text";
_vvv2 = mostCurrent._edthora.getText();
 //BA.debugLineNum = 1310;BA.debugLine="mapPostValues3.Put(\"HORA\", TIEMPO)";
_vv7.Put((Object)("HORA"),(Object)(_vvv2));
 //BA.debugLineNum = 1311;BA.debugLine="Dim keynode3 As String = \"CULTIVO/TIEMPO\"";
_keynode3 = "CULTIVO/TIEMPO";
 //BA.debugLineNum = 1312;BA.debugLine="childUpdates3.Put(  \"/\" & keynode3,  mapPostValue";
_vv0.Put((Object)("/"+_keynode3),(Object)(_vv7.getObject()));
 //BA.debugLineNum = 1313;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1314;BA.debugLine="ref.updateChildren( childUpdates3)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv0);
 //BA.debugLineNum = 1316;BA.debugLine="End Sub";
return "";
}
public static void  _btnluces_click() throws Exception{
ResumableSub_BtnLuces_Click rsub = new ResumableSub_BtnLuces_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BtnLuces_Click extends BA.ResumableSub {
public ResumableSub_BtnLuces_Click(com.testdb.main parent) {
this.parent = parent;
}
com.testdb.main parent;
int _i = 0;
String _link = "";
com.testdb.httpjob _job22 = null;
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _m3 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1041;BA.debugLine="Activity.RemoveAllViews ''quita todas las pantall";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 1042;BA.debugLine="Activity.LoadLayout(\"PantBtn2\")";
parent.mostCurrent._activity.LoadLayout("PantBtn2",mostCurrent.activityBA);
 //BA.debugLineNum = 1045;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 1046;BA.debugLine="i=0";
_i = (int) (0);
 //BA.debugLineNum = 1047;BA.debugLine="Do While i>-1";
if (true) break;

case 1:
//do while
this.state = 12;
while (_i>-1) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1048;BA.debugLine="Dim link As String =\"https://culterapp.firebasei";
_link = "https://culterapp.firebaseio.com/CULTIVO/LUCES.json";
 //BA.debugLineNum = 1051;BA.debugLine="Dim job22 As HttpJob";
_job22 = new com.testdb.httpjob();
 //BA.debugLineNum = 1052;BA.debugLine="job22.Initialize(link, Me)";
_job22._initialize /*String*/ (processBA,_link,main.getObject());
 //BA.debugLineNum = 1053;BA.debugLine="job22.Download(link)";
_job22._vvv6 /*String*/ (_link);
 //BA.debugLineNum = 1054;BA.debugLine="Wait For (job22) JobDone(job22 As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_job22));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job22 = (com.testdb.httpjob) result[0];
;
 //BA.debugLineNum = 1056;BA.debugLine="If job22.Success Then";
if (true) break;

case 4:
//if
this.state = 11;
if (_job22._vvvvvv4 /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 1057;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 1058;BA.debugLine="res = job22.GetString";
_res = _job22._vvvv6 /*String*/ ();
 //BA.debugLineNum = 1059;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 1060;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 1062;BA.debugLine="If res <> False Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_res).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False)) == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1063;BA.debugLine="Dim m3 As Map =	parser.NextObject";
_m3 = new anywheresoftware.b4a.objects.collections.Map();
_m3 = _parser.NextObject();
 //BA.debugLineNum = 1064;BA.debugLine="LblLuces.Text= \" \" &  m3.Get(\"TIPO1\")";
parent.mostCurrent._lblluces.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m3.Get((Object)("TIPO1")))));
 //BA.debugLineNum = 1065;BA.debugLine="LblLuces2.Text= \" \" &  m3.Get(\"TIPO2\")";
parent.mostCurrent._lblluces2.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m3.Get((Object)("TIPO2")))));
 //BA.debugLineNum = 1066;BA.debugLine="LblLuces3.Text= \" \" &  m3.Get(\"TIPO3\")";
parent.mostCurrent._lblluces3.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m3.Get((Object)("TIPO3")))));
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 1;
;
 //BA.debugLineNum = 1072;BA.debugLine="i=i+1";
_i = (int) (_i+1);
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 1074;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btnnivelt_click() throws Exception{
ResumableSub_BtnNivelT_Click rsub = new ResumableSub_BtnNivelT_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BtnNivelT_Click extends BA.ResumableSub {
public ResumableSub_BtnNivelT_Click(com.testdb.main parent) {
this.parent = parent;
}
com.testdb.main parent;
int _i = 0;
String _link = "";
com.testdb.httpjob _job22 = null;
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _m1 = null;
String _link2 = "";
com.testdb.httpjob _job222 = null;
String _res2 = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser2 = null;
anywheresoftware.b4a.objects.collections.Map _m2 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 935;BA.debugLine="Activity.RemoveAllViews ''quita todas las pantall";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 936;BA.debugLine="Activity.LoadLayout(\"PantBtn1\")";
parent.mostCurrent._activity.LoadLayout("PantBtn1",mostCurrent.activityBA);
 //BA.debugLineNum = 939;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 940;BA.debugLine="i=0";
_i = (int) (0);
 //BA.debugLineNum = 941;BA.debugLine="Do While i>-1";
if (true) break;

case 1:
//do while
this.state = 20;
while (_i>-1) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 942;BA.debugLine="Dim link As String =\"https://culterapp.firebasei";
_link = "https://culterapp.firebaseio.com/CULTIVO/SENSORES_NIVEL.json";
 //BA.debugLineNum = 944;BA.debugLine="Dim job22 As HttpJob";
_job22 = new com.testdb.httpjob();
 //BA.debugLineNum = 945;BA.debugLine="job22.Initialize(link, Me)";
_job22._initialize /*String*/ (processBA,_link,main.getObject());
 //BA.debugLineNum = 946;BA.debugLine="job22.Download(link)";
_job22._vvv6 /*String*/ (_link);
 //BA.debugLineNum = 947;BA.debugLine="Wait For (job22) JobDone(job22 As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_job22));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_job22 = (com.testdb.httpjob) result[0];
;
 //BA.debugLineNum = 949;BA.debugLine="If job22.Success Then";
if (true) break;

case 4:
//if
this.state = 19;
if (_job22._vvvvvv4 /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 950;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 951;BA.debugLine="res = job22.GetString";
_res = _job22._vvvv6 /*String*/ ();
 //BA.debugLineNum = 952;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 953;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 955;BA.debugLine="If res <> False Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_res).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False)) == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 956;BA.debugLine="Dim m1 As Map =	parser.NextObject";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
_m1 = _parser.NextObject();
 //BA.debugLineNum = 957;BA.debugLine="LblNivel.Text= \" \" &  m1.Get(\"S_N1\") & \" % \"";
parent.mostCurrent._lblnivel.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m1.Get((Object)("S_N1")))+" % "));
 //BA.debugLineNum = 958;BA.debugLine="LblNivel2.Text= \" \" &  m1.Get(\"S_N2\") & \" % \"";
parent.mostCurrent._lblnivel2.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m1.Get((Object)("S_N2")))+" % "));
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 964;BA.debugLine="Dim link2 As String =\"https://culterapp.firebas";
_link2 = "https://culterapp.firebaseio.com/CULTIVO/VALVULAS.json";
 //BA.debugLineNum = 966;BA.debugLine="Dim job222 As HttpJob";
_job222 = new com.testdb.httpjob();
 //BA.debugLineNum = 967;BA.debugLine="job222.Initialize(link2, Me)";
_job222._initialize /*String*/ (processBA,_link2,main.getObject());
 //BA.debugLineNum = 968;BA.debugLine="job222.Download(link2)";
_job222._vvv6 /*String*/ (_link2);
 //BA.debugLineNum = 969;BA.debugLine="Wait For (job222) JobDone(job222 As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_job222));
this.state = 22;
return;
case 22:
//C
this.state = 11;
_job222 = (com.testdb.httpjob) result[0];
;
 //BA.debugLineNum = 971;BA.debugLine="If job222.Success Then";
if (true) break;

case 11:
//if
this.state = 18;
if (_job222._vvvvvv4 /*boolean*/ ) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 972;BA.debugLine="Dim res2 As String";
_res2 = "";
 //BA.debugLineNum = 973;BA.debugLine="res2 = job222.GetString";
_res2 = _job222._vvvv6 /*String*/ ();
 //BA.debugLineNum = 974;BA.debugLine="Dim parser2 As JSONParser";
_parser2 = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 975;BA.debugLine="parser2.Initialize(res2)";
_parser2.Initialize(_res2);
 //BA.debugLineNum = 977;BA.debugLine="If res2 <> False Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((_res2).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False)) == false) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 978;BA.debugLine="Dim m2 As Map =	parser2.NextObject";
_m2 = new anywheresoftware.b4a.objects.collections.Map();
_m2 = _parser2.NextObject();
 //BA.debugLineNum = 980;BA.debugLine="LblEstado1.Text= \" \" &  m2.Get(\"VALVULA_I\")";
parent.mostCurrent._lblestado1.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m2.Get((Object)("VALVULA_I")))));
 //BA.debugLineNum = 981;BA.debugLine="LblEstado2.Text= \" \" &  m2.Get(\"VALVULA_R\")";
parent.mostCurrent._lblestado2.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m2.Get((Object)("VALVULA_R")))));
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 1;
;
 //BA.debugLineNum = 985;BA.debugLine="i=i+1";
_i = (int) (_i+1);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 987;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnoff_2_click() throws Exception{
String _keynode1 = "";
 //BA.debugLineNum = 1171;BA.debugLine="Sub BtnOff_2_Click";
 //BA.debugLineNum = 1172;BA.debugLine="mapPostValues1.Put(\"TIPO2\", \"OFF\")";
_vv5.Put((Object)("TIPO2"),(Object)("OFF"));
 //BA.debugLineNum = 1173;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 1174;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
_vv6.Put((Object)("/"+_keynode1),(Object)(_vv5.getObject()));
 //BA.debugLineNum = 1175;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1176;BA.debugLine="ref.updateChildren( childUpdates1)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv6);
 //BA.debugLineNum = 1177;BA.debugLine="End Sub";
return "";
}
public static String  _btnoff_3_click() throws Exception{
String _keynode3 = "";
 //BA.debugLineNum = 1298;BA.debugLine="Sub BtnOff_3_Click";
 //BA.debugLineNum = 1299;BA.debugLine="mapPostValues3.Put(\"PREESCRIBIR\", \"OFF\")";
_vv7.Put((Object)("PREESCRIBIR"),(Object)("OFF"));
 //BA.debugLineNum = 1300;BA.debugLine="Dim keynode3 As String = \"CULTIVO/TIEMPO\"";
_keynode3 = "CULTIVO/TIEMPO";
 //BA.debugLineNum = 1301;BA.debugLine="childUpdates3.Put(  \"/\" & keynode3,  mapPostValue";
_vv0.Put((Object)("/"+_keynode3),(Object)(_vv7.getObject()));
 //BA.debugLineNum = 1302;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1303;BA.debugLine="ref.updateChildren( childUpdates3)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv0);
 //BA.debugLineNum = 1304;BA.debugLine="End Sub";
return "";
}
public static String  _btnoff_click() throws Exception{
 //BA.debugLineNum = 1000;BA.debugLine="Sub BtnOff_Click";
 //BA.debugLineNum = 1002;BA.debugLine="mapPostValues.put(\"VALVULA_I\", \"OFF\")";
_vv3.Put((Object)("VALVULA_I"),(Object)("OFF"));
 //BA.debugLineNum = 1003;BA.debugLine="keynode = \"CULTIVO/VALVULAS\"";
_vvv1 = "CULTIVO/VALVULAS";
 //BA.debugLineNum = 1004;BA.debugLine="childUpdates.Put(  \"/\" & keynode,  mapPostValues)";
_vv4.Put((Object)("/"+_vvv1),(Object)(_vv3.getObject()));
 //BA.debugLineNum = 1005;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1006;BA.debugLine="ref.updateChildren( childUpdates)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv4);
 //BA.debugLineNum = 1008;BA.debugLine="End Sub";
return "";
}
public static String  _btnoff1_click() throws Exception{
String _keynode1 = "";
 //BA.debugLineNum = 1155;BA.debugLine="Sub BtnOff1_Click";
 //BA.debugLineNum = 1156;BA.debugLine="mapPostValues1.Put(\"TIPO1\", \"OFF\")";
_vv5.Put((Object)("TIPO1"),(Object)("OFF"));
 //BA.debugLineNum = 1157;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 1158;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
_vv6.Put((Object)("/"+_keynode1),(Object)(_vv5.getObject()));
 //BA.debugLineNum = 1159;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1160;BA.debugLine="ref.updateChildren( childUpdates1)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv6);
 //BA.debugLineNum = 1161;BA.debugLine="End Sub";
return "";
}
public static String  _btnoff2_click() throws Exception{
 //BA.debugLineNum = 1020;BA.debugLine="Sub BtnOFF2_Click";
 //BA.debugLineNum = 1022;BA.debugLine="mapPostValues.Put(\"VALVULA_R\", \"OFF\")";
_vv3.Put((Object)("VALVULA_R"),(Object)("OFF"));
 //BA.debugLineNum = 1023;BA.debugLine="keynode = \"CULTIVO/VALVULAS\"";
_vvv1 = "CULTIVO/VALVULAS";
 //BA.debugLineNum = 1024;BA.debugLine="childUpdates.Put(  \"/\" & keynode,  mapPostValues)";
_vv4.Put((Object)("/"+_vvv1),(Object)(_vv3.getObject()));
 //BA.debugLineNum = 1025;BA.debugLine="ref.updateChildren( childUpdates)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv4);
 //BA.debugLineNum = 1026;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1028;BA.debugLine="End Sub";
return "";
}
public static String  _btnoff3_click() throws Exception{
String _keynode1 = "";
 //BA.debugLineNum = 1163;BA.debugLine="Sub BtnOff3_Click";
 //BA.debugLineNum = 1164;BA.debugLine="mapPostValues1.Put(\"TIPO3\", \"OFF\")";
_vv5.Put((Object)("TIPO3"),(Object)("OFF"));
 //BA.debugLineNum = 1165;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 1166;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
_vv6.Put((Object)("/"+_keynode1),(Object)(_vv5.getObject()));
 //BA.debugLineNum = 1167;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1168;BA.debugLine="ref.updateChildren( childUpdates1)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv6);
 //BA.debugLineNum = 1169;BA.debugLine="End Sub";
return "";
}
public static void  _btnon_3_click() throws Exception{
ResumableSub_BtnOn_3_Click rsub = new ResumableSub_BtnOn_3_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BtnOn_3_Click extends BA.ResumableSub {
public ResumableSub_BtnOn_3_Click(com.testdb.main parent) {
this.parent = parent;
}
com.testdb.main parent;
String _keynode3 = "";
int _j = 0;
String _link = "";
com.testdb.httpjob _job22 = null;
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _m1 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1252;BA.debugLine="mapPostValues3.Put(\"PREESCRIBIR\", \"ON\")";
parent._vv7.Put((Object)("PREESCRIBIR"),(Object)("ON"));
 //BA.debugLineNum = 1253;BA.debugLine="Dim keynode3 As String = \"CULTIVO/TIEMPO\"";
_keynode3 = "CULTIVO/TIEMPO";
 //BA.debugLineNum = 1254;BA.debugLine="childUpdates3.Put(  \"/\" & keynode3,  mapPostValue";
parent._vv0.Put((Object)("/"+_keynode3),(Object)(parent._vv7.getObject()));
 //BA.debugLineNum = 1255;BA.debugLine="ref.push";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1256;BA.debugLine="ref.updateChildren( childUpdates3)";
parent.mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,parent._vv0);
 //BA.debugLineNum = 1258;BA.debugLine="Dim j As Int";
_j = 0;
 //BA.debugLineNum = 1259;BA.debugLine="j=0";
_j = (int) (0);
 //BA.debugLineNum = 1260;BA.debugLine="Do While j>-1";
if (true) break;

case 1:
//do while
this.state = 12;
while (_j>-1) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1263;BA.debugLine="Dim link As String =\"https://culterapp.firebaseio";
_link = "https://culterapp.firebaseio.com/CULTIVO/TIEMPO2.json";
 //BA.debugLineNum = 1265;BA.debugLine="Dim job22 As HttpJob";
_job22 = new com.testdb.httpjob();
 //BA.debugLineNum = 1266;BA.debugLine="job22.Initialize(link, Me)";
_job22._initialize /*String*/ (processBA,_link,main.getObject());
 //BA.debugLineNum = 1267;BA.debugLine="job22.Download(link)";
_job22._vvv6 /*String*/ (_link);
 //BA.debugLineNum = 1268;BA.debugLine="Wait For (job22) JobDone(job22 As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_job22));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job22 = (com.testdb.httpjob) result[0];
;
 //BA.debugLineNum = 1270;BA.debugLine="If job22.Success Then";
if (true) break;

case 4:
//if
this.state = 11;
if (_job22._vvvvvv4 /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 1271;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 1272;BA.debugLine="res = job22.GetString";
_res = _job22._vvvv6 /*String*/ ();
 //BA.debugLineNum = 1273;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 1274;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 1276;BA.debugLine="If res <> False Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_res).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False)) == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1277;BA.debugLine="Dim m1 As Map =	parser.NextObject";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
_m1 = _parser.NextObject();
 //BA.debugLineNum = 1279;BA.debugLine="LblPrescripcion.Text= \" \" &  m1.Get(\"PRIEGO\")";
parent.mostCurrent._lblprescripcion.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m1.Get((Object)("PRIEGO")))));
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 1;
;
 //BA.debugLineNum = 1291;BA.debugLine="j=j+1";
_j = (int) (_j+1);
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 1296;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnon_click() throws Exception{
 //BA.debugLineNum = 990;BA.debugLine="Sub BtnOn_Click";
 //BA.debugLineNum = 992;BA.debugLine="mapPostValues.Put(\"VALVULA_I\", \"ON\")";
_vv3.Put((Object)("VALVULA_I"),(Object)("ON"));
 //BA.debugLineNum = 993;BA.debugLine="keynode = \"CULTIVO/VALVULAS\"";
_vvv1 = "CULTIVO/VALVULAS";
 //BA.debugLineNum = 994;BA.debugLine="childUpdates.Put(  \"/\" & keynode,  mapPostValues)";
_vv4.Put((Object)("/"+_vvv1),(Object)(_vv3.getObject()));
 //BA.debugLineNum = 995;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 996;BA.debugLine="ref.updateChildren( childUpdates)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv4);
 //BA.debugLineNum = 998;BA.debugLine="End Sub";
return "";
}
public static String  _btnon2_click() throws Exception{
 //BA.debugLineNum = 1010;BA.debugLine="Sub BtnON2_Click";
 //BA.debugLineNum = 1012;BA.debugLine="mapPostValues.Put(\"VALVULA_R\", \"ON\")";
_vv3.Put((Object)("VALVULA_R"),(Object)("ON"));
 //BA.debugLineNum = 1013;BA.debugLine="keynode = \"CULTIVO/VALVULAS\"";
_vvv1 = "CULTIVO/VALVULAS";
 //BA.debugLineNum = 1014;BA.debugLine="childUpdates.Put(  \"/\" & keynode,  mapPostValues)";
_vv4.Put((Object)("/"+_vvv1),(Object)(_vv3.getObject()));
 //BA.debugLineNum = 1015;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1016;BA.debugLine="ref.updateChildren( childUpdates)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv4);
 //BA.debugLineNum = 1018;BA.debugLine="End Sub";
return "";
}
public static String  _btnrojo_click() throws Exception{
String _keynode1 = "";
 //BA.debugLineNum = 1076;BA.debugLine="Sub BtnRojo_Click";
 //BA.debugLineNum = 1077;BA.debugLine="mapPostValues1.Put(\"TIPO1\", \"ROJO\")";
_vv5.Put((Object)("TIPO1"),(Object)("ROJO"));
 //BA.debugLineNum = 1078;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 1079;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
_vv6.Put((Object)("/"+_keynode1),(Object)(_vv5.getObject()));
 //BA.debugLineNum = 1080;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1081;BA.debugLine="ref.updateChildren( childUpdates1)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv6);
 //BA.debugLineNum = 1082;BA.debugLine="End Sub";
return "";
}
public static String  _btnrojo2_click() throws Exception{
String _keynode1 = "";
 //BA.debugLineNum = 1118;BA.debugLine="Sub BtnRojo2_Click";
 //BA.debugLineNum = 1120;BA.debugLine="mapPostValues1.Put(\"TIPO2\", \"ROJO\")";
_vv5.Put((Object)("TIPO2"),(Object)("ROJO"));
 //BA.debugLineNum = 1121;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 1122;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
_vv6.Put((Object)("/"+_keynode1),(Object)(_vv5.getObject()));
 //BA.debugLineNum = 1123;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1124;BA.debugLine="ref.updateChildren( childUpdates1)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv6);
 //BA.debugLineNum = 1125;BA.debugLine="End Sub";
return "";
}
public static String  _btnrojo3_click() throws Exception{
String _keynode1 = "";
 //BA.debugLineNum = 1145;BA.debugLine="Sub BtnRojo3_Click";
 //BA.debugLineNum = 1147;BA.debugLine="mapPostValues1.Put(\"TIPO3\", \"ROJO\")";
_vv5.Put((Object)("TIPO3"),(Object)("ROJO"));
 //BA.debugLineNum = 1148;BA.debugLine="Dim keynode1 As String = \"CULTIVO/LUCES\"";
_keynode1 = "CULTIVO/LUCES";
 //BA.debugLineNum = 1149;BA.debugLine="childUpdates1.Put(  \"/\" & keynode1,  mapPostValue";
_vv6.Put((Object)("/"+_keynode1),(Object)(_vv5.getObject()));
 //BA.debugLineNum = 1150;BA.debugLine="ref.push";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.push();
 //BA.debugLineNum = 1151;BA.debugLine="ref.updateChildren( childUpdates1)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.updateChildren(processBA,_vv6);
 //BA.debugLineNum = 1153;BA.debugLine="End Sub";
return "";
}
public static String  _btnsalir_click() throws Exception{
 //BA.debugLineNum = 930;BA.debugLine="Sub BtnSalir_Click";
 //BA.debugLineNum = 931;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 932;BA.debugLine="End Sub";
return "";
}
public static void  _btnsensado_click() throws Exception{
ResumableSub_BtnSensado_Click rsub = new ResumableSub_BtnSensado_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_BtnSensado_Click extends BA.ResumableSub {
public ResumableSub_BtnSensado_Click(com.testdb.main parent) {
this.parent = parent;
}
com.testdb.main parent;
int _i = 0;
String _link = "";
com.testdb.httpjob _job22 = null;
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _m3 = null;
anywheresoftware.b4a.objects.collections.Map _m1 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1182;BA.debugLine="Activity.RemoveAllViews ''quita todas las pantall";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 1183;BA.debugLine="Activity.LoadLayout(\"PantBtn3\")";
parent.mostCurrent._activity.LoadLayout("PantBtn3",mostCurrent.activityBA);
 //BA.debugLineNum = 1185;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 1186;BA.debugLine="i=0";
_i = (int) (0);
 //BA.debugLineNum = 1187;BA.debugLine="Do While i>-1";
if (true) break;

case 1:
//do while
this.state = 20;
while (_i>-1) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1189;BA.debugLine="Dim link As String =\"https://culterapp.firebasei";
_link = "https://culterapp.firebaseio.com/CULTIVO/SENSORES.json";
 //BA.debugLineNum = 1191;BA.debugLine="Dim job22 As HttpJob";
_job22 = new com.testdb.httpjob();
 //BA.debugLineNum = 1192;BA.debugLine="job22.Initialize(link, Me)";
_job22._initialize /*String*/ (processBA,_link,main.getObject());
 //BA.debugLineNum = 1193;BA.debugLine="job22.Download(link)";
_job22._vvv6 /*String*/ (_link);
 //BA.debugLineNum = 1194;BA.debugLine="Wait For (job22) JobDone(job22 As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_job22));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_job22 = (com.testdb.httpjob) result[0];
;
 //BA.debugLineNum = 1196;BA.debugLine="If job22.Success Then";
if (true) break;

case 4:
//if
this.state = 11;
if (_job22._vvvvvv4 /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 1197;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 1198;BA.debugLine="res = job22.GetString";
_res = _job22._vvvv6 /*String*/ ();
 //BA.debugLineNum = 1199;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 1200;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 1202;BA.debugLine="If res <> False Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_res).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False)) == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1203;BA.debugLine="Dim m3 As Map =	parser.NextObject";
_m3 = new anywheresoftware.b4a.objects.collections.Map();
_m3 = _parser.NextObject();
 //BA.debugLineNum = 1204;BA.debugLine="LblSn1.Text= \" \" &  m3.Get(\"SENSOR1\") & \" % \"";
parent.mostCurrent._lblsn1.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m3.Get((Object)("SENSOR1")))+" % "));
 //BA.debugLineNum = 1205;BA.debugLine="LblSn2.Text= \" \" &  m3.Get(\"SENSOR2\") & \" % \"";
parent.mostCurrent._lblsn2.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m3.Get((Object)("SENSOR2")))+" % "));
 //BA.debugLineNum = 1206;BA.debugLine="LblSn3.Text= \" \" &  m3.Get(\"SENSOR3\") & \" % \"";
parent.mostCurrent._lblsn3.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m3.Get((Object)("SENSOR3")))+" % "));
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 //BA.debugLineNum = 1214;BA.debugLine="Dim link As String =\"https://culterapp.firebasei";
_link = "https://culterapp.firebaseio.com/CULTIVO/TIEMPO2.json";
 //BA.debugLineNum = 1216;BA.debugLine="Dim job22 As HttpJob";
_job22 = new com.testdb.httpjob();
 //BA.debugLineNum = 1217;BA.debugLine="job22.Initialize(link, Me)";
_job22._initialize /*String*/ (processBA,_link,main.getObject());
 //BA.debugLineNum = 1218;BA.debugLine="job22.Download(link)";
_job22._vvv6 /*String*/ (_link);
 //BA.debugLineNum = 1219;BA.debugLine="Wait For (job22) JobDone(job22 As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_job22));
this.state = 22;
return;
case 22:
//C
this.state = 12;
_job22 = (com.testdb.httpjob) result[0];
;
 //BA.debugLineNum = 1221;BA.debugLine="If job22.Success Then";
if (true) break;

case 12:
//if
this.state = 19;
if (_job22._vvvvvv4 /*boolean*/ ) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 1222;BA.debugLine="Dim res As String";
_res = "";
 //BA.debugLineNum = 1223;BA.debugLine="res = job22.GetString";
_res = _job22._vvvv6 /*String*/ ();
 //BA.debugLineNum = 1224;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 1225;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
 //BA.debugLineNum = 1227;BA.debugLine="If res <> False Then";
if (true) break;

case 15:
//if
this.state = 18;
if ((_res).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False)) == false) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 1228;BA.debugLine="Dim m1 As Map =	parser.NextObject";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
_m1 = _parser.NextObject();
 //BA.debugLineNum = 1231;BA.debugLine="LblEstado3.Text= \" \" &  m1.Get(\"FECHA_RIEGO\")";
parent.mostCurrent._lblestado3.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m1.Get((Object)("FECHA_RIEGO")))));
 //BA.debugLineNum = 1232;BA.debugLine="edtHoraAnt.Text= \" \" &  m1.Get(\"HORA_ANTERIOR\"";
parent.mostCurrent._edthoraant.setText(BA.ObjectToCharSequence(" "+BA.ObjectToString(_m1.Get((Object)("HORA_ANTERIOR")))));
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 1;
;
 //BA.debugLineNum = 1244;BA.debugLine="i=i+1";
_i = (int) (_i+1);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 1247;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _ps_email) throws Exception{
boolean _valid = false;
 //BA.debugLineNum = 846;BA.debugLine="Sub checkEmail(ps_email As String) As Boolean";
 //BA.debugLineNum = 848;BA.debugLine="Dim Valid As Boolean";
_valid = false;
 //BA.debugLineNum = 849;BA.debugLine="Valid = Regex.IsMatch(\"^[_a-z0-9-]+(\\.[_a-z0-9-]+";
_valid = anywheresoftware.b4a.keywords.Common.Regex.IsMatch("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$",_ps_email.trim());
 //BA.debugLineNum = 850;BA.debugLine="If Not(Valid) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_valid)) { 
 //BA.debugLineNum = 851;BA.debugLine="MsgboxAsync(\"Dirección de correo inválida!\", \"Er";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Dirección de correo inválida!"),BA.ObjectToCharSequence("Error"),processBA);
 //BA.debugLineNum = 852;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 854;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 856;BA.debugLine="End Sub";
return false;
}
public static boolean  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
anywheresoftware.b4j.object.JavaObject _googleapiavailablity = null;
anywheresoftware.b4j.object.JavaObject _context = null;
 //BA.debugLineNum = 437;BA.debugLine="Sub CheckForGooglePlayServices As Boolean";
 //BA.debugLineNum = 439;BA.debugLine="Dim GoogleApiAvailablity As JavaObject";
_googleapiavailablity = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 440;BA.debugLine="GoogleApiAvailablity = GoogleApiAvailablity.Initi";
_googleapiavailablity.setObject((java.lang.Object)(_googleapiavailablity.InitializeStatic("com.google.android.gms.common.GoogleApiAvailability").RunMethod("getInstance",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 441;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 442;BA.debugLine="context.InitializeContext";
_context.InitializeContext(processBA);
 //BA.debugLineNum = 443;BA.debugLine="If GoogleApiAvailablity.RunMethod(\"isGooglePlaySe";
if ((_googleapiavailablity.RunMethod("isGooglePlayServicesAvailable",new Object[]{(Object)(_context.getObject())})).equals((Object)(0)) == false) { 
 //BA.debugLineNum = 444;BA.debugLine="GoogleApiAvailablity.RunMethod(\"makeGooglePlaySe";
_googleapiavailablity.RunMethod("makeGooglePlayServicesAvailable",new Object[]{(Object)(_context.getObject())});
 //BA.debugLineNum = 445;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 447;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return false;
}
public static String  _fet_email_enterpressed() throws Exception{
boolean _valid = false;
 //BA.debugLineNum = 829;BA.debugLine="Sub fet_email_EnterPressed";
 //BA.debugLineNum = 831;BA.debugLine="Dim Valid As Boolean";
_valid = false;
 //BA.debugLineNum = 832;BA.debugLine="Valid = Regex.IsMatch(\"^[_a-z0-9-]+(\\.[_a-z0-9-]+";
_valid = anywheresoftware.b4a.keywords.Common.Regex.IsMatch("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$",mostCurrent._fet_email._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim());
 //BA.debugLineNum = 833;BA.debugLine="If Not(Valid) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_valid)) { 
 //BA.debugLineNum = 834;BA.debugLine="MsgboxAsync(\"Dirección de correo inválida\", \"Err";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Dirección de correo inválida"),BA.ObjectToCharSequence("Error"),processBA);
 };
 //BA.debugLineNum = 836;BA.debugLine="End Sub";
return "";
}
public static String  _fet_emailpassword_enterpressed() throws Exception{
 //BA.debugLineNum = 839;BA.debugLine="Sub fet_emailpassword_EnterPressed";
 //BA.debugLineNum = 841;BA.debugLine="checkEmail(fet_email.Text)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(mostCurrent._fet_email._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ());
 //BA.debugLineNum = 843;BA.debugLine="End Sub";
return "";
}
public static String  _fet_regemailpassword2_enterpressed() throws Exception{
 //BA.debugLineNum = 819;BA.debugLine="Sub fet_regemailpassword2_EnterPressed";
 //BA.debugLineNum = 821;BA.debugLine="If fet_regemailpassword.Text.trim <> fet_regemail";
if ((mostCurrent._fet_regemailpassword._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim()).equals(mostCurrent._fet_regemailpassword2._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ().trim()) == false) { 
 //BA.debugLineNum = 822;BA.debugLine="MsgboxAsync(\"Las contraseñas no coinciden.\",\"Ale";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Las contraseñas no coinciden."),BA.ObjectToCharSequence("Alert!"),processBA);
 //BA.debugLineNum = 823;BA.debugLine="fet_regemailpassword.RequestFocusAndShowKeyboard";
mostCurrent._fet_regemailpassword._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*String*/ ();
 };
 //BA.debugLineNum = 825;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
anywheresoftware.b4a.phone.Phone.PhoneId _pid = null;
String _phonenumber = "";
 //BA.debugLineNum = 549;BA.debugLine="Sub getPhoneNumber As String";
 //BA.debugLineNum = 551;BA.debugLine="Dim pID As PhoneId";
_pid = new anywheresoftware.b4a.phone.Phone.PhoneId();
 //BA.debugLineNum = 552;BA.debugLine="Dim phonenumber As String";
_phonenumber = "";
 //BA.debugLineNum = 553;BA.debugLine="phonenumber = pID.GetLine1Number";
_phonenumber = _pid.GetLine1Number();
 //BA.debugLineNum = 554;BA.debugLine="Return phonenumber";
if (true) return _phonenumber;
 //BA.debugLineNum = 555;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 73;BA.debugLine="Private RP As RuntimePermissions";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 74;BA.debugLine="Dim ime As IME";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 75;BA.debugLine="Private b_phoneLogin As Button";
mostCurrent._b_phonelogin = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 76;BA.debugLine="Private fet_phonenumber As B4XFloatTextField";
mostCurrent._fet_phonenumber = new com.testdb.b4xfloattextfield();
 //BA.debugLineNum = 77;BA.debugLine="Private fet_smsCode As B4XFloatTextField";
mostCurrent._fet_smscode = new com.testdb.b4xfloattextfield();
 //BA.debugLineNum = 78;BA.debugLine="Private b_PhoneSignIn As Button";
mostCurrent._b_phonesignin = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 79;BA.debugLine="Private iv_exitPhoneLogin As ImageView";
mostCurrent._iv_exitphonelogin = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 80;BA.debugLine="Private b_emailLogin As Button";
mostCurrent._b_emaillogin = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 81;BA.debugLine="Private b_googleLogin As Button";
mostCurrent._b_googlelogin = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 82;BA.debugLine="Dim gs_signInMethod As String";
mostCurrent._gs_signinmethod = "";
 //BA.debugLineNum = 83;BA.debugLine="Private fet_emailReset As B4XFloatTextField";
mostCurrent._fet_emailreset = new com.testdb.b4xfloattextfield();
 //BA.debugLineNum = 84;BA.debugLine="Private b_emailResetPassword As Button";
mostCurrent._b_emailresetpassword = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 85;BA.debugLine="Private lblRegister As Label";
mostCurrent._lblregister = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 86;BA.debugLine="Private fet_email As B4XFloatTextField";
mostCurrent._fet_email = new com.testdb.b4xfloattextfield();
 //BA.debugLineNum = 87;BA.debugLine="Private b_emailSignIn As Button";
mostCurrent._b_emailsignin = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 88;BA.debugLine="Private fet_regemail As B4XFloatTextField";
mostCurrent._fet_regemail = new com.testdb.b4xfloattextfield();
 //BA.debugLineNum = 89;BA.debugLine="Private fet_regemailpassword As B4XFloatTextField";
mostCurrent._fet_regemailpassword = new com.testdb.b4xfloattextfield();
 //BA.debugLineNum = 90;BA.debugLine="Private fet_regemailpassword2 As B4XFloatTextFiel";
mostCurrent._fet_regemailpassword2 = new com.testdb.b4xfloattextfield();
 //BA.debugLineNum = 91;BA.debugLine="Private fet_emailpassword As B4XFloatTextField";
mostCurrent._fet_emailpassword = new com.testdb.b4xfloattextfield();
 //BA.debugLineNum = 92;BA.debugLine="Private labelLogInMethod As Label";
mostCurrent._labelloginmethod = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 93;BA.debugLine="Private LabelUser As Label";
mostCurrent._labeluser = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 94;BA.debugLine="Private b_setPhoneNumber As Button";
mostCurrent._b_setphonenumber = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 95;BA.debugLine="Private fet_setphonenumber As B4XFloatTextField";
mostCurrent._fet_setphonenumber = new com.testdb.b4xfloattextfield();
 //BA.debugLineNum = 97;BA.debugLine="Dim realtime As FirebaseDatabase";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new de.donmanfred.FirebaseDatabaseWrapper();
 //BA.debugLineNum = 98;BA.debugLine="Dim ref As DatabaseReference";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new de.donmanfred.DatabaseReferenceWrapper();
 //BA.debugLineNum = 99;BA.debugLine="Private BtnOn As Button";
mostCurrent._btnon = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 100;BA.debugLine="Private BtnOff As Button";
mostCurrent._btnoff = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 101;BA.debugLine="Private edtUSUARIO As EditText";
mostCurrent._edtusuario = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 102;BA.debugLine="Private edtContraseña As EditText";
mostCurrent._edtcontraseña = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 103;BA.debugLine="Private BtnSalir As Button";
mostCurrent._btnsalir = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 104;BA.debugLine="Private BtnAtras As Button";
mostCurrent._btnatras = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 105;BA.debugLine="Private LblNivel As Label";
mostCurrent._lblnivel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 106;BA.debugLine="Private LblNivel2 As Label";
mostCurrent._lblnivel2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 107;BA.debugLine="Private BtnON2 As Button";
mostCurrent._btnon2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 108;BA.debugLine="Private BtnOFF2 As Button";
mostCurrent._btnoff2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 109;BA.debugLine="Private BtnLuces As Button";
mostCurrent._btnluces = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 110;BA.debugLine="Private BtnRojo As Button";
mostCurrent._btnrojo = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 111;BA.debugLine="Private BtnAzul As Button";
mostCurrent._btnazul = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 112;BA.debugLine="Private BtnAmarillo As Button";
mostCurrent._btnamarillo = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 113;BA.debugLine="Private LblLuces As Label";
mostCurrent._lblluces = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 114;BA.debugLine="Private BtnSensado As Button";
mostCurrent._btnsensado = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 115;BA.debugLine="Private LblSn1 As Label";
mostCurrent._lblsn1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 116;BA.debugLine="Private LblSn2 As Label";
mostCurrent._lblsn2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 117;BA.debugLine="Private LblSn3 As Label";
mostCurrent._lblsn3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 118;BA.debugLine="Private LblLuces2 As Label";
mostCurrent._lblluces2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 119;BA.debugLine="Private LblLuces3 As Label";
mostCurrent._lblluces3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 120;BA.debugLine="Private BtnOff1 As Button";
mostCurrent._btnoff1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 121;BA.debugLine="Private BtnOff3 As Button";
mostCurrent._btnoff3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 122;BA.debugLine="Private BtnOff_2 As Button";
mostCurrent._btnoff_2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 123;BA.debugLine="Private LblEstado2 As Label";
mostCurrent._lblestado2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 124;BA.debugLine="Private LblEstado1 As Label";
mostCurrent._lblestado1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 125;BA.debugLine="Private BtnOn_3 As Button";
mostCurrent._btnon_3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 126;BA.debugLine="Private LblEstado3 As Label";
mostCurrent._lblestado3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 127;BA.debugLine="Private LblPrescripcion As Label";
mostCurrent._lblprescripcion = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 128;BA.debugLine="Private edtHora As EditText";
mostCurrent._edthora = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 129;BA.debugLine="Private edtPRiego As EditText";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 130;BA.debugLine="Private LblHora As Label";
mostCurrent._lblhora = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 131;BA.debugLine="Private edtHoraAnt As Label";
mostCurrent._edthoraant = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 132;BA.debugLine="Private BtnGuardar As Button";
mostCurrent._btnguardar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public static String  _iv_exit_click() throws Exception{
 //BA.debugLineNum = 451;BA.debugLine="Sub iv_exit_Click";
 //BA.debugLineNum = 453;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 454;BA.debugLine="Activity.LoadLayout(\"main2\")";
mostCurrent._activity.LoadLayout("main2",mostCurrent.activityBA);
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
return "";
}
public static String  _iv_exit_main2_click() throws Exception{
 //BA.debugLineNum = 458;BA.debugLine="Sub iv_exit_main2_Click";
 //BA.debugLineNum = 460;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 461;BA.debugLine="Activity.LoadLayout(\"Main\")";
mostCurrent._activity.LoadLayout("Main",mostCurrent.activityBA);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return "";
}
public static String  _iv_exitemaillogin_click() throws Exception{
 //BA.debugLineNum = 860;BA.debugLine="Sub iv_exitEmailLogin_Click";
 //BA.debugLineNum = 862;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 863;BA.debugLine="Activity.LoadLayout(\"Main\")";
mostCurrent._activity.LoadLayout("Main",mostCurrent.activityBA);
 //BA.debugLineNum = 864;BA.debugLine="End Sub";
return "";
}
public static String  _iv_exitlogin_click() throws Exception{
 //BA.debugLineNum = 923;BA.debugLine="Sub iv_exitLogin_Click";
 //BA.debugLineNum = 924;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 925;BA.debugLine="Activity.LoadLayout(\"emaillogin\")";
mostCurrent._activity.LoadLayout("emaillogin",mostCurrent.activityBA);
 //BA.debugLineNum = 926;BA.debugLine="End Sub";
return "";
}
public static String  _iv_exitphonelogin_click() throws Exception{
 //BA.debugLineNum = 540;BA.debugLine="Sub iv_exitPhoneLogin_Click";
 //BA.debugLineNum = 542;BA.debugLine="authphone.SignOut";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SignOut();
 //BA.debugLineNum = 543;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 544;BA.debugLine="Activity.LoadLayout(\"main\")";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
 //BA.debugLineNum = 545;BA.debugLine="End Sub";
return "";
}
public static String  _lblregister_click() throws Exception{
 //BA.debugLineNum = 754;BA.debugLine="Sub lblRegister_Click";
 //BA.debugLineNum = 756;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 757;BA.debugLine="Activity.LoadLayout(\"createEmailAccount\")";
mostCurrent._activity.LoadLayout("createEmailAccount",mostCurrent.activityBA);
 //BA.debugLineNum = 758;BA.debugLine="End Sub";
return "";
}
public static String  _lblresetpassword_click() throws Exception{
 //BA.debugLineNum = 874;BA.debugLine="Sub lblresetPassword_Click";
 //BA.debugLineNum = 876;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 877;BA.debugLine="Activity.LoadLayout(\"resetPassword\")";
mostCurrent._activity.LoadLayout("resetPassword",mostCurrent.activityBA);
 //BA.debugLineNum = 880;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub MainForm_Resize (Width As Double, Height As Do";
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
main._process_globals();
starter._process_globals();
httputils2service._process_globals();
b4xcollections._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 50;BA.debugLine="Dim gb_phoneVerificationSuccess As Boolean";
_gb_phoneverificationsuccess = false;
 //BA.debugLineNum = 51;BA.debugLine="Dim gs_verificationID, gs_phoneNumber As String";
_gs_verificationid = "";
_gs_phonenumber = "";
 //BA.debugLineNum = 52;BA.debugLine="Private auth As FirebaseAuth";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.FirebaseAuthWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private authphone As FirebaseAuthPhoneWrapper";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.FirebaseAuthPhone.FirebaseAuthPhoneWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private authemail As FirebaseAuthEmailWrapper";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.FirebaseAuthEmail.FirebaseAuthEmailWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Type DBCommand (Name As String, Parameters() As O";
;
 //BA.debugLineNum = 56;BA.debugLine="Type DBResult (Tag As Object, Columns As Map, Row";
;
 //BA.debugLineNum = 58;BA.debugLine="Dim mapPostValues As Map";
_vv3 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 59;BA.debugLine="Dim childUpdates As Map";
_vv4 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 60;BA.debugLine="Dim mapPostValues1 As Map";
_vv5 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 61;BA.debugLine="Dim childUpdates1 As Map";
_vv6 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 62;BA.debugLine="Dim mapPostValues3 As Map";
_vv7 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 63;BA.debugLine="Dim childUpdates3 As Map";
_vv0 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 64;BA.debugLine="Dim keynode As String";
_vvv1 = "";
 //BA.debugLineNum = 65;BA.debugLine="Dim TIEMPO As String=\"\"";
_vvv2 = "";
 //BA.debugLineNum = 66;BA.debugLine="Dim RHORA As String=\"\"";
_vvv3 = "";
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public static String  _read_signinmethod() throws Exception{
String _ls_tempkey = "";
anywheresoftware.b4a.objects.collections.Map _mapconfig = null;
int _i = 0;
 //BA.debugLineNum = 410;BA.debugLine="Sub read_signInMethod";
 //BA.debugLineNum = 412;BA.debugLine="Dim ls_tempKey As String";
_ls_tempkey = "";
 //BA.debugLineNum = 413;BA.debugLine="Dim MapConfig As Map";
_mapconfig = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 414;BA.debugLine="MapConfig.Initialize";
_mapconfig.Initialize();
 //BA.debugLineNum = 416;BA.debugLine="If File.Exists(File.DirInternal,\"firebase.ini\") =";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"firebase.ini")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 417;BA.debugLine="File.WriteMap(File.DirInternal, \"firebase.ini\",";
anywheresoftware.b4a.keywords.Common.File.WriteMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"firebase.ini",_mapconfig);
 };
 //BA.debugLineNum = 419;BA.debugLine="MapConfig.Clear";
_mapconfig.Clear();
 //BA.debugLineNum = 420;BA.debugLine="MapConfig = File.ReadMap(File.DirInternal,\"fireba";
_mapconfig = anywheresoftware.b4a.keywords.Common.File.ReadMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"firebase.ini");
 //BA.debugLineNum = 421;BA.debugLine="ls_tempKey = \"\"";
_ls_tempkey = "";
 //BA.debugLineNum = 422;BA.debugLine="For i = 0 To MapConfig.Size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_mapconfig.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 423;BA.debugLine="ls_tempKey = MapConfig.GetKeyAt(i)";
_ls_tempkey = BA.ObjectToString(_mapconfig.GetKeyAt(_i));
 //BA.debugLineNum = 424;BA.debugLine="Select ls_tempKey";
switch (BA.switchObjectToInt(_ls_tempkey,"authSignInMethod","authPhoneNumber")) {
case 0: {
 //BA.debugLineNum = 426;BA.debugLine="gs_signInMethod = MapConfig.GetValueAt(i)";
mostCurrent._gs_signinmethod = BA.ObjectToString(_mapconfig.GetValueAt(_i));
 break; }
case 1: {
 //BA.debugLineNum = 428;BA.debugLine="gs_phoneNumber = MapConfig.GetValueAt(i)";
_gs_phonenumber = BA.ObjectToString(_mapconfig.GetValueAt(_i));
 break; }
}
;
 }
};
 //BA.debugLineNum = 431;BA.debugLine="Log (\"Method: \" & gs_signInMethod & CRLF & \" Phon";
anywheresoftware.b4a.keywords.Common.LogImpl("724182805","Method: "+mostCurrent._gs_signinmethod+anywheresoftware.b4a.keywords.Common.CRLF+" Phone: "+_gs_phonenumber,0);
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return "";
}
public static String  _reference_onchildchanged(Object _snapshot,String _child,Object _tag) throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub Reference_onChildChanged(snapshot As Object, c";
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public static String  _reference_oncomplete(Object _snapshot,String _child,Object _tag) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub Reference_onComplete(snapshot As Object, child";
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return "";
}
public static String  _reference_ondatachange(Object _snapshot,Object _tag) throws Exception{
de.donmanfred.DataSnapshotWrapper _snap = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _k = "";
anywheresoftware.b4a.objects.collections.List _customers = null;
String _val = "";
 //BA.debugLineNum = 334;BA.debugLine="Sub Reference_onDataChange(snapshot As Object, tag";
 //BA.debugLineNum = 335;BA.debugLine="Try";
try { //BA.debugLineNum = 337;BA.debugLine="Log($\"Reference_onDatachange(${tag})\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("723986179",("Reference_onDatachange("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_tag)+")"),0);
 //BA.debugLineNum = 338;BA.debugLine="If snapshot <> Null Then";
if (_snapshot!= null) { 
 //BA.debugLineNum = 339;BA.debugLine="Dim snap As DataSnapshot";
_snap = new de.donmanfred.DataSnapshotWrapper();
 //BA.debugLineNum = 340;BA.debugLine="snap.Initialize(snapshot)";
_snap.Initialize(processBA,(com.google.firebase.database.DataSnapshot)(_snapshot));
 //BA.debugLineNum = 342;BA.debugLine="If snap.Value Is Map Then";
if (_snap.getValue() instanceof anywheresoftware.b4a.objects.collections.Map.MyMap) { 
 //BA.debugLineNum = 344;BA.debugLine="Dim m As Map = snap.Value";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_snap.getValue()));
 //BA.debugLineNum = 346;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _m.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_k = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 348;BA.debugLine="Log(m.Get(k))";
anywheresoftware.b4a.keywords.Common.LogImpl("723986190",BA.ObjectToString(_m.Get((Object)(_k))),0);
 }
};
 }else if(_snap.getValue() instanceof java.util.List) { 
 //BA.debugLineNum = 355;BA.debugLine="Dim customers As List = snap.Value";
_customers = new anywheresoftware.b4a.objects.collections.List();
_customers.setObject((java.util.List)(_snap.getValue()));
 //BA.debugLineNum = 356;BA.debugLine="Log(\"referenceListSize: \"&customers.Size)";
anywheresoftware.b4a.keywords.Common.LogImpl("723986198","referenceListSize: "+BA.NumberToString(_customers.getSize()),0);
 }else if(_snap.getValue() instanceof String) { 
 //BA.debugLineNum = 359;BA.debugLine="Dim val As String = snap.Value";
_val = BA.ObjectToString(_snap.getValue());
 //BA.debugLineNum = 360;BA.debugLine="Log(\"Value=\"&val)";
anywheresoftware.b4a.keywords.Common.LogImpl("723986202","Value="+_val,0);
 }else {
 //BA.debugLineNum = 362;BA.debugLine="Log(\"Value type unknown: \"& GetType(snap.Value";
anywheresoftware.b4a.keywords.Common.LogImpl("723986204","Value type unknown: "+anywheresoftware.b4a.keywords.Common.GetType(_snap.getValue()),0);
 };
 }else {
 //BA.debugLineNum = 371;BA.debugLine="Log(\"Snapshot is null\")";
anywheresoftware.b4a.keywords.Common.LogImpl("723986213","Snapshot is null",0);
 };
 } 
       catch (Exception e24) {
			processBA.setLastException(e24); //BA.debugLineNum = 378;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("723986220",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return "";
}
public static String  _save_signinmethod() throws Exception{
anywheresoftware.b4a.objects.collections.Map _mapconfig = null;
 //BA.debugLineNum = 395;BA.debugLine="Sub save_signInMethod";
 //BA.debugLineNum = 397;BA.debugLine="Dim MapConfig As Map";
_mapconfig = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 398;BA.debugLine="MapConfig.Initialize";
_mapconfig.Initialize();
 //BA.debugLineNum = 399;BA.debugLine="MapConfig.Clear";
_mapconfig.Clear();
 //BA.debugLineNum = 401;BA.debugLine="MapConfig.Put(\"authSignInMethod\", gs_signInMethod";
_mapconfig.Put((Object)("authSignInMethod"),(Object)(mostCurrent._gs_signinmethod));
 //BA.debugLineNum = 402;BA.debugLine="If gs_phoneNumber <> \"\" Then";
if ((_gs_phonenumber).equals("") == false) { 
 //BA.debugLineNum = 403;BA.debugLine="MapConfig.Put(\"authPhoneNumber\", gs_phoneNumber)";
_mapconfig.Put((Object)("authPhoneNumber"),(Object)(_gs_phonenumber));
 };
 //BA.debugLineNum = 405;BA.debugLine="File.WriteMap(File.DirInternal, \"firebase.ini\", M";
anywheresoftware.b4a.keywords.Common.File.WriteMap(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"firebase.ini",_mapconfig);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 559;BA.debugLine="Sub setPhoneNumber";
 //BA.debugLineNum = 561;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 562;BA.debugLine="Activity.LoadLayout(\"getphonenumber\")";
mostCurrent._activity.LoadLayout("getphonenumber",mostCurrent.activityBA);
 //BA.debugLineNum = 563;BA.debugLine="fet_setphonenumber.Text = \"+\"";
mostCurrent._fet_setphonenumber._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 /*String*/ ("+");
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return "";
}
}

package com.testdb;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class swiftbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.testdb.swiftbutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.testdb.swiftbutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv7 = "";
public Object _vvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
public Object _vvvvvvv4 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public b4a.example.dateutils _vvvvvvv5 = null;
public com.testdb.main _vvvvvvv6 = null;
public com.testdb.starter _vvvvvvv7 = null;
public com.testdb.httputils2service _vvvvvvv0 = null;
public com.testdb.b4xcollections _vvvvvvvv1 = null;
public String  _base_resize(double _width,double _height) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 45;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 46;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvvvvvvvvvvv5.Resize((float) (_width),(float) (_height));
 //BA.debugLineNum = 47;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _vvvvvvvvvvvvv1.GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v.setObject((java.lang.Object)(group2.Get(index2)));
 //BA.debugLineNum = 48;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }
};
 //BA.debugLineNum = 50;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 10;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv0 = new Object();
 //BA.debugLineNum = 11;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 13;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 14;BA.debugLine="Public xLBL As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public clr1, clr2, disabledColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 16;BA.debugLine="Private pressed As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
 //BA.debugLineNum = 17;BA.debugLine="Public Tag As Object";
_vvvvvvv4 = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Private mDisabled As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = false;
 //BA.debugLineNum = 19;BA.debugLine="Public CornersRadius, SideHeight As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 27;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 28;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvv1.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 29;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvv4 = _vvvvvvvvvvvvv1.getTag();
 //BA.debugLineNum = 29;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvv1.setTag(this);
 //BA.debugLineNum = 30;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"p\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvvvvvvvvvv2.CreatePanel(ba,"p");
 //BA.debugLineNum = 31;BA.debugLine="p.Color = xui.Color_Transparent";
_p.setColor(_vvvvvvvvvvvvv2.Color_Transparent);
 //BA.debugLineNum = 32;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"Primary";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvv2.PaintOrColorToColor(_props.Get((Object)("PrimaryColor")));
 //BA.debugLineNum = 33;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"Seconda";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvv2.PaintOrColorToColor(_props.Get((Object)("SecondaryColor")));
 //BA.debugLineNum = 34;BA.debugLine="disabledColor = xui.PaintOrColorToColor(Props.Get";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvv2.PaintOrColorToColor(_props.GetDefault((Object)("DisabledColor"),(Object)(0xff999999)));
 //BA.debugLineNum = 35;BA.debugLine="CornersRadius = DipToCurrent(Props.GetDefault(\"Co";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(15)))));
 //BA.debugLineNum = 36;BA.debugLine="SideHeight = DipToCurrent(Props.GetDefault(\"SideH";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("SideHeight"),(Object)(5)))));
 //BA.debugLineNum = 37;BA.debugLine="xLBL = Lbl";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 38;BA.debugLine="mBase.AddView(xLBL, 0, 0, 0, 0)";
_vvvvvvvvvvvvv1.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 39;BA.debugLine="mBase.AddView(p, 0, 0, 0, 0)";
_vvvvvvvvvvvvv1.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 40;BA.debugLine="xLBL.SetTextAlignment(\"CENTER\", \"CENTER\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 41;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvvvvvvvvvvv5.Initialize(_vvvvvvvvvvvvv1);
 //BA.debugLineNum = 42;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvv1.getHeight());
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv7() throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _c = 0;
 //BA.debugLineNum = 111;BA.debugLine="Private Sub Draw";
 //BA.debugLineNum = 112;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvvvvvvvvvvv5.ClearRect(_vvvvvvvvvvvvvvvvv5.getTargetRect());
 //BA.debugLineNum = 113;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 114;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 115;BA.debugLine="r.Initialize(0, SideHeight, mBase.Width, mBase.He";
_r.Initialize((float) (0),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1),(float) (_vvvvvvvvvvvvv1.getWidth()),(float) (_vvvvvvvvvvvvv1.getHeight()));
 //BA.debugLineNum = 116;BA.debugLine="If pressed = False Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1==__c.False) { 
 //BA.debugLineNum = 117;BA.debugLine="xLBL.Top = 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setTop((int) (0));
 //BA.debugLineNum = 118;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 119;BA.debugLine="cvs.DrawPath(p, clr2, True, 0)";
_vvvvvvvvvvvvvvvvv5.DrawPath(_p,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,__c.True,(float) (0));
 //BA.debugLineNum = 120;BA.debugLine="r.Initialize(0, 0, mBase.Width, mBase.Height - S";
_r.Initialize((float) (0),(float) (0),(float) (_vvvvvvvvvvvvv1.getWidth()),(float) (_vvvvvvvvvvvvv1.getHeight()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1));
 //BA.debugLineNum = 121;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 122;BA.debugLine="cvs.DrawPath(p, clr1, True, 0)";
_vvvvvvvvvvvvvvvvv5.DrawPath(_p,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,__c.True,(float) (0));
 }else {
 //BA.debugLineNum = 124;BA.debugLine="xLBL.Top = SideHeight";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setTop(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 //BA.debugLineNum = 125;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0));
 //BA.debugLineNum = 126;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 127;BA.debugLine="If mDisabled Then c = disabledColor Else c = clr";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7) { 
_c = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;}
else {
_c = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;};
 //BA.debugLineNum = 128;BA.debugLine="cvs.DrawPath(p, c, True, 0)";
_vvvvvvvvvvvvvvvvv5.DrawPath(_p,_c,__c.True,(float) (0));
 };
 //BA.debugLineNum = 131;BA.debugLine="cvs.Invalidate";
_vvvvvvvvvvvvvvvvv5.Invalidate();
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 54;BA.debugLine="Return Not(mDisabled)";
if (true) return __c.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 23;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 24;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvv0 = _callback;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _p_touch(int _action,float _x,float _y) throws Exception{
boolean _inside = false;
 //BA.debugLineNum = 63;BA.debugLine="Private Sub p_Touch (Action As Int, X As Float, Y";
 //BA.debugLineNum = 64;BA.debugLine="If mDisabled Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7) { 
if (true) return "";};
 //BA.debugLineNum = 65;BA.debugLine="Dim Inside As Boolean = x > 0 And x < mBase.Width";
_inside = _x>0 && _x<_vvvvvvvvvvvvv1.getWidth() && _y>0 && _y<_vvvvvvvvvvvvv1.getHeight();
 //BA.debugLineNum = 66;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,_vvvvvvvvvvvvv1.TOUCH_ACTION_DOWN,_vvvvvvvvvvvvv1.TOUCH_ACTION_MOVE,_vvvvvvvvvvvvv1.TOUCH_ACTION_UP)) {
case 0: {
 //BA.debugLineNum = 68;BA.debugLine="SetPressedState(True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(__c.True);
 //BA.debugLineNum = 69;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvv7();
 break; }
case 1: {
 //BA.debugLineNum = 71;BA.debugLine="If pressed <> Inside Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1!=_inside) { 
 //BA.debugLineNum = 72;BA.debugLine="SetPressedState(Inside)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_inside);
 //BA.debugLineNum = 73;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvv7();
 };
 break; }
case 2: {
 //BA.debugLineNum = 76;BA.debugLine="SetPressedState(False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(__c.False);
 //BA.debugLineNum = 77;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 78;BA.debugLine="If Inside Then";
if (_inside) { 
 //BA.debugLineNum = 79;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Click";
__c.CallSubDelayed(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_Click");
 };
 break; }
}
;
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(int _primary,int _secondary) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub SetColors(Primary As Int, Secondary As";
 //BA.debugLineNum = 102;BA.debugLine="clr1 = Primary";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _primary;
 //BA.debugLineNum = 103;BA.debugLine="clr2 = Secondary";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _secondary;
 //BA.debugLineNum = 104;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(boolean _b) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub setEnabled(b As Boolean)";
 //BA.debugLineNum = 58;BA.debugLine="mDisabled = Not(b)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = __c.Not(_b);
 //BA.debugLineNum = 59;BA.debugLine="pressed = mDisabled";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
 //BA.debugLineNum = 60;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(boolean _newstate) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Private Sub SetPressedState(NewState As Boolean)";
 //BA.debugLineNum = 85;BA.debugLine="If pressed = NewState Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1==_newstate) { 
if (true) return "";};
 //BA.debugLineNum = 86;BA.debugLine="If NewState And xui.SubExists(mCallBack, mEventNa";
if (_newstate && _vvvvvvvvvvvvv2.SubExists(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_ButtonDown",(int) (0))) { 
 //BA.debugLineNum = 87;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonD";
__c.CallSubDelayed(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_ButtonDown");
 };
 //BA.debugLineNum = 89;BA.debugLine="If NewState = False And xui.SubExists(mCallBack,";
if (_newstate==__c.False && _vvvvvvvvvvvvv2.SubExists(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_ButtonUp",(int) (0))) { 
 //BA.debugLineNum = 90;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonU";
__c.CallSubDelayed(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_ButtonUp");
 };
 //BA.debugLineNum = 92;BA.debugLine="pressed= NewState";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _newstate;
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub Update";
 //BA.debugLineNum = 108;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

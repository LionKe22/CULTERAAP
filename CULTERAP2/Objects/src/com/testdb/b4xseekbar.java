package com.testdb;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xseekbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.testdb.b4xseekbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.testdb.b4xseekbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv7 = "";
public Object _vvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvvv2 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvvv5 = null;
public Object _vvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvv4 = null;
public int _vvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public boolean _vvvvvvvvvvvvvvv0 = false;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
public int _vvvvvvvv6 = 0;
public b4a.example.dateutils _vvvvvvv5 = null;
public com.testdb.main _vvvvvvv6 = null;
public com.testdb.starter _vvvvvvv7 = null;
public com.testdb.httputils2service _vvvvvvv0 = null;
public com.testdb.b4xcollections _vvvvvvvv1 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 52;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvvvvvvvvvvv5.Resize((float) (_width),(float) (_height));
 //BA.debugLineNum = 53;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
_vvvvvvvvvvvvvvvvvv4.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 54;BA.debugLine="Vertical = mBase.Height > mBase.Width";
_vvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvv1.getHeight()>_vvvvvvvvvvvvv1.getWidth();
 //BA.debugLineNum = 55;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
_vvvvvvvv6 = (int) (__c.Max(_vvvvvvvvvvvvv1.getHeight(),_vvvvvvvvvvvvv1.getWidth())-2*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 56;BA.debugLine="Update";
_vvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 12;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv0 = new Object();
 //BA.debugLineNum = 13;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 15;BA.debugLine="Public Color1, Color2, ThumbColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
 //BA.debugLineNum = 16;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 17;BA.debugLine="Public Tag As Object";
_vvvvvvv4 = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Private TouchPanel As B4XView";
_vvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private mValue As Int";
_vvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public MinValue, MaxValue As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
 //BA.debugLineNum = 21;BA.debugLine="Public Interval As Int = 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int) (1);
 //BA.debugLineNum = 22;BA.debugLine="Private Vertical As Boolean";
_vvvvvvvvvvvvvvv0 = false;
 //BA.debugLineNum = 23;BA.debugLine="Public Size1 = 4dip, Size2 = 2dip, Radius1 = 6dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (4));
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = __c.DipToCurrent((int) (2));
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = __c.DipToCurrent((int) (6));
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = __c.DipToCurrent((int) (12));
 //BA.debugLineNum = 24;BA.debugLine="Private Pressed As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
 //BA.debugLineNum = 25;BA.debugLine="Private size As Int";
_vvvvvvvv6 = 0;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 35;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvv1.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 36;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvv4 = _vvvvvvvvvvvvv1.getTag();
 //BA.debugLineNum = 36;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvv1.setTag(this);
 //BA.debugLineNum = 37;BA.debugLine="Color1 = xui.PaintOrColorToColor(Props.Get(\"Color";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvv2.PaintOrColorToColor(_props.Get((Object)("Color1")));
 //BA.debugLineNum = 38;BA.debugLine="Color2 = xui.PaintOrColorToColor(Props.Get(\"Color";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvvvvvvvvv2.PaintOrColorToColor(_props.Get((Object)("Color2")));
 //BA.debugLineNum = 39;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvv2.PaintOrColorToColor(_props.Get((Object)("ThumbColor")));
 //BA.debugLineNum = 40;BA.debugLine="Interval = Max(1, Props.GetDefault(\"Interval\", 1)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int) (__c.Max(1,(double)(BA.ObjectToNumber(_props.GetDefault((Object)("Interval"),(Object)(1))))));
 //BA.debugLineNum = 41;BA.debugLine="MinValue = Props.Get(\"Min\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
 //BA.debugLineNum = 42;BA.debugLine="MaxValue = Props.Get(\"Max\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
 //BA.debugLineNum = 43;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, Props.Get(\"V";
_vvvvvvvvvvvvv6 = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,(double)(BA.ObjectToNumber(_props.Get((Object)("Value")))))));
 //BA.debugLineNum = 44;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvvvvvvvvvvv5.Initialize(_vvvvvvvvvvvvv1);
 //BA.debugLineNum = 45;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
_vvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvv2.CreatePanel(ba,"TouchPanel");
 //BA.debugLineNum = 46;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
_vvvvvvvvvvvvv1.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvv4.getObject()),(int) (0),(int) (0),_vvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvv1.getHeight());
 //BA.debugLineNum = 47;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then Radius2 = 20dip";
if (_vvvvvvvvvvvvv2.getIsB4A() || _vvvvvvvvvvvvv2.getIsB4i()) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = __c.DipToCurrent((int) (20));};
 //BA.debugLineNum = 48;BA.debugLine="If xui.IsB4A Then Base_Resize(mBase.Width, mBase.";
if (_vvvvvvvvvvvvv2.getIsB4A()) { 
_base_resize(_vvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvv1.getHeight());};
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public int  _getvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Public Sub getValue As Int";
 //BA.debugLineNum = 122;BA.debugLine="Return mValue";
if (true) return _vvvvvvvvvvvvv6;
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 29;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 30;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvv0 = _callback;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvv6(int _v) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Public Sub setValue(v As Int)";
 //BA.debugLineNum = 117;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, v))";
_vvvvvvvvvvvvv6 = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,_v)));
 //BA.debugLineNum = 118;BA.debugLine="Update";
_vvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(int _x,int _y) throws Exception{
int _v = 0;
int _newvalue = 0;
 //BA.debugLineNum = 99;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
 //BA.debugLineNum = 100;BA.debugLine="Dim v As Int";
_v = 0;
 //BA.debugLineNum = 101;BA.debugLine="If Vertical Then";
if (_vvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 102;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
_v = (int) ((_vvvvvvvvvvvvv1.getHeight()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_y)/(double)_vvvvvvvv6*(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2)+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
 }else {
 //BA.debugLineNum = 104;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
_v = (int) ((_x-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)/(double)_vvvvvvvv6*(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2)+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
 };
 //BA.debugLineNum = 106;BA.debugLine="v = Round (v / Interval) * Interval";
_v = (int) (__c.Round(_v/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4)*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 107;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
_newvalue = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,_v)));
 //BA.debugLineNum = 108;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=_vvvvvvvvvvvvv6) { 
 //BA.debugLineNum = 109;BA.debugLine="mValue = NewValue";
_vvvvvvvvvvvvv6 = _newvalue;
 //BA.debugLineNum = 110;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Value";
if (_vvvvvvvvvvvvv2.SubExists(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_ValueChanged",(int) (1))) { 
 //BA.debugLineNum = 111;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Value";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_ValueChanged",(Object)(_vvvvvvvvvvvvv6));
 };
 };
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
 //BA.debugLineNum = 88;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
if (_action==_vvvvvvvvvvvvvvvvvv4.TOUCH_ACTION_DOWN) { 
 //BA.debugLineNum = 89;BA.debugLine="Pressed = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.True;
 //BA.debugLineNum = 90;BA.debugLine="SetValueBasedOnTouch(X, Y)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6((int) (_x),(int) (_y));
 }else if(_action==_vvvvvvvvvvvvvvvvvv4.TOUCH_ACTION_MOVE) { 
 //BA.debugLineNum = 92;BA.debugLine="SetValueBasedOnTouch(X, Y)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6((int) (_x),(int) (_y));
 }else if(_action==_vvvvvvvvvvvvvvvvvv4.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 94;BA.debugLine="Pressed = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.False;
 };
 //BA.debugLineNum = 96;BA.debugLine="Update";
_vvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvv3() throws Exception{
int _s1 = 0;
int _y = 0;
int _x = 0;
 //BA.debugLineNum = 60;BA.debugLine="Public Sub Update";
 //BA.debugLineNum = 62;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvvvvvvvvvvv5.ClearRect(_vvvvvvvvvvvvvvvvv5.getTargetRect());
 //BA.debugLineNum = 63;BA.debugLine="If size > 0 Then";
if (_vvvvvvvv6>0) { 
 //BA.debugLineNum = 64;BA.debugLine="If Vertical = False Then";
if (_vvvvvvvvvvvvvvv0==__c.False) { 
 //BA.debugLineNum = 65;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
_s1 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+(_vvvvvvvvvvvvv6-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2)/(double)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2)*_vvvvvvvv6);
 //BA.debugLineNum = 66;BA.debugLine="Dim y As Int = mBase.Height / 2";
_y = (int) (_vvvvvvvvvvvvv1.getHeight()/(double)2);
 //BA.debugLineNum = 67;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, Color1, Size1)";
_vvvvvvvvvvvvvvvvv5.DrawLine((float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(float) (_y),(float) (_s1),(float) (_y),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
 //BA.debugLineNum = 68;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, C";
_vvvvvvvvvvvvvvvvv5.DrawLine((float) (_s1),(float) (_y),(float) (_vvvvvvvvvvvvv1.getWidth()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(float) (_y),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6));
 //BA.debugLineNum = 69;BA.debugLine="cvs.DrawCircle(s1, y, Radius1, Color1, True, 0)";
_vvvvvvvvvvvvvvvvv5.DrawCircle((float) (_s1),(float) (_y),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(float) (0));
 //BA.debugLineNum = 70;BA.debugLine="If Pressed Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) { 
 //BA.debugLineNum = 71;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
_vvvvvvvvvvvvvvvvv5.DrawCircle((float) (_s1),(float) (_y),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,__c.True,(float) (0));
 };
 }else {
 //BA.debugLineNum = 74;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue -";
_s1 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3-_vvvvvvvvvvvvv6-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2)/(double)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2)*_vvvvvvvv6);
 //BA.debugLineNum = 75;BA.debugLine="Dim x As Int = mBase.Width / 2";
_x = (int) (_vvvvvvvvvvvvv1.getWidth()/(double)2);
 //BA.debugLineNum = 76;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, Color2, Size2)";
_vvvvvvvvvvvvvvvvv5.DrawLine((float) (_x),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),(float) (_x),(float) (_s1),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6));
 //BA.debugLineNum = 77;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
_vvvvvvvvvvvvvvvvv5.DrawLine((float) (_x),(float) (_s1),(float) (_x),(float) (_vvvvvvvvvvvvv1.getHeight()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
 //BA.debugLineNum = 78;BA.debugLine="cvs.DrawCircle(x, s1, Radius1, Color1, True, 0)";
_vvvvvvvvvvvvvvvvv5.DrawCircle((float) (_x),(float) (_s1),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(float) (0));
 //BA.debugLineNum = 79;BA.debugLine="If Pressed Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1) { 
 //BA.debugLineNum = 80;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
_vvvvvvvvvvvvvvvvv5.DrawCircle((float) (_x),(float) (_s1),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,__c.True,(float) (0));
 };
 };
 };
 //BA.debugLineNum = 84;BA.debugLine="cvs.Invalidate";
_vvvvvvvvvvvvvvvvv5.Invalidate();
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

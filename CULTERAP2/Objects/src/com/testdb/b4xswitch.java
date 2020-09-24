package com.testdb;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.testdb.b4xswitch");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.testdb.b4xswitch.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv7 = "";
public Object _vvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvvv2 = null;
public b4a.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public b4a.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public b4a.example.bitmapcreator _vvvvvvvvvvvvvvv5 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public b4a.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public boolean _vvvvvvvvvvvvv6 = false;
public b4a.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public Object _vvvvvvv4 = null;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0f;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
public b4a.example.dateutils _vvvvvvv5 = null;
public com.testdb.main _vvvvvvv6 = null;
public com.testdb.starter _vvvvvvv7 = null;
public com.testdb.httputils2service _vvvvvvv0 = null;
public com.testdb.b4xcollections _vvvvvvvv1 = null;
public String  _base_resize(double _width1,double _height1) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv0 = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Private OnColor, OffColor As BCBrush";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new b4a.example.bcpath._bcbrush();
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 12;BA.debugLine="Private bc As BitmapCreator";
_vvvvvvvvvvvvvvv5 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 13;BA.debugLine="Private Width As Int = 55dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = __c.DipToCurrent((int) (55));
 //BA.debugLineNum = 14;BA.debugLine="Private Height As Int = 31dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = __c.DipToCurrent((int) (31));
 //BA.debugLineNum = 15;BA.debugLine="Private ThumbColor As BCBrush";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 16;BA.debugLine="Private iv As ImageView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private mValue As Boolean";
_vvvvvvvvvvvvv6 = false;
 //BA.debugLineNum = 18;BA.debugLine="Private transparent As BCBrush";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 19;BA.debugLine="Private LoopIndex As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
_vvvvvvv4 = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Private Scale As Float";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0f;
 //BA.debugLineNum = 22;BA.debugLine="Private mEnabled As Boolean = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = __c.True;
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
 //BA.debugLineNum = 31;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 32;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvv1.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 33;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvv4 = _vvvvvvvvvvvvv1.getTag();
 //BA.debugLineNum = 33;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvv1.setTag(this);
 //BA.debugLineNum = 34;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
_vvvvvvvvvvvvv1.SetLayoutAnimated((int) (0),_vvvvvvvvvvvvv1.getLeft(),_vvvvvvvvvvvvv1.getTop(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 35;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
_vvvvvvvvvvvvv1.SetColorAndBorder(_vvvvvvvvvvvvv2.Color_Transparent,(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 36;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"pnl\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _vvvvvvvvvvvvv2.CreatePanel(ba,"pnl");
 //BA.debugLineNum = 37;BA.debugLine="pnl.Color = xui.Color_Transparent";
_pnl.setColor(_vvvvvvvvvvvvv2.Color_Transparent);
 //BA.debugLineNum = 38;BA.debugLine="iv.Initialize(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Initialize(ba,"");
 //BA.debugLineNum = 39;BA.debugLine="mBase.AddView(iv, 0, 0, Width, Height)";
_vvvvvvvvvvvvv1.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 40;BA.debugLine="mBase.AddView(pnl, 0, 0, Width, Height)";
_vvvvvvvvvvvvv1.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 42;BA.debugLine="bc.Initialize(Width, Height)";
_vvvvvvvvvvvvvvv5._initialize(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 43;BA.debugLine="Scale = xui.Scale";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvv2.getScale();
 //BA.debugLineNum = 48;BA.debugLine="OnColor = bc.CreateBrushFromColor(xui.PaintOrColo";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvvvv5._createbrushfromcolor(_vvvvvvvvvvvvv2.PaintOrColorToColor(_props.Get((Object)("OnColor"))));
 //BA.debugLineNum = 49;BA.debugLine="OffColor = bc.CreateBrushFromColor(xui.PaintOrCol";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvv5._createbrushfromcolor(_vvvvvvvvvvvvv2.PaintOrColorToColor(_props.Get((Object)("OffColor"))));
 //BA.debugLineNum = 50;BA.debugLine="ThumbColor = bc.CreateBrushFromColor(xui.PaintOrC";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvvvv5._createbrushfromcolor(_vvvvvvvvvvvvv2.PaintOrColorToColor(_props.Get((Object)("ThumbColor"))));
 //BA.debugLineNum = 51;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvvvvvvvv5._createbrushfromcolor(_vvvvvvvvvvvvv2.Color_Transparent);
 //BA.debugLineNum = 52;BA.debugLine="mEnabled = mBase.Enabled";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvv1.getEnabled();
 //BA.debugLineNum = 53;BA.debugLine="mBase.Enabled = True";
_vvvvvvvvvvvvv1.setEnabled(__c.True);
 //BA.debugLineNum = 54;BA.debugLine="SetValueImpl(Props.Get(\"Value\"), True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(BA.ObjectToBoolean(_props.Get((Object)("Value"))),__c.True);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv7(float _state) throws Exception{
float _r = 0f;
float _cx = 0f;
int _cy = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _smallrect = null;
float _w = 0f;
float _h = 0f;
 //BA.debugLineNum = 115;BA.debugLine="Private Sub Draw (State As Float)";
 //BA.debugLineNum = 116;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
_vvvvvvvvvvvvvvv5._drawrect2(_vvvvvvvvvvvvvvv5._targetrect,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,__c.True,(int) (0));
 //BA.debugLineNum = 117;BA.debugLine="Dim r As Float = Round(bc.mHeight / 2)";
_r = (float) (__c.Round(_vvvvvvvvvvvvvvv5._mheight/(double)2));
 //BA.debugLineNum = 118;BA.debugLine="Dim cx As Float = r - 1 * Scale + (bc.mWidth - 2";
_cx = (float) (_r-1*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+(_vvvvvvvvvvvvvvv5._mwidth-2*_r)*_state);
 //BA.debugLineNum = 119;BA.debugLine="If State = 0 Then";
if (_state==0) { 
 //BA.debugLineNum = 120;BA.debugLine="cx = r";
_cx = _r;
 }else if(_state==1) { 
 //BA.debugLineNum = 122;BA.debugLine="cx = Round(bc.mWidth - 1 * Scale - r)";
_cx = (float) (__c.Round(_vvvvvvvvvvvvvvv5._mwidth-1*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3-_r));
 };
 //BA.debugLineNum = 124;BA.debugLine="Dim cy As Int = bc.mHeight / 2";
_cy = (int) (_vvvvvvvvvvvvvvv5._mheight/(double)2);
 //BA.debugLineNum = 125;BA.debugLine="Dim smallrect As B4XRect";
_smallrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 126;BA.debugLine="Dim w As Float = State * bc.mWidth";
_w = (float) (_state*_vvvvvvvvvvvvvvv5._mwidth);
 //BA.debugLineNum = 127;BA.debugLine="Dim h As Float = State * bc.mHeight";
_h = (float) (_state*_vvvvvvvvvvvvvvv5._mheight);
 //BA.debugLineNum = 128;BA.debugLine="If State < 1 Then bc.DrawRectRounded2(bc.TargetRe";
if (_state<1) { 
_vvvvvvvvvvvvvvv5._drawrectrounded2(_vvvvvvvvvvvvvvv5._targetrect,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.True,(int) (2*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3),(int) (_r));};
 //BA.debugLineNum = 129;BA.debugLine="smallrect.Initialize(bc.mWidth / 2 - w / 2, cy -";
_smallrect.Initialize((float) (_vvvvvvvvvvvvvvv5._mwidth/(double)2-_w/(double)2),(float) (_cy-_h/(double)2),(float) (_vvvvvvvvvvvvvvv5._mwidth/(double)2+_w/(double)2),(float) (_cy+_h/(double)2));
 //BA.debugLineNum = 130;BA.debugLine="If State > 0 Then bc.DrawRectRounded2(smallrect,";
if (_state>0) { 
_vvvvvvvvvvvvvvv5._drawrectrounded2(_smallrect,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,__c.True,(int) (2*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3),(int) (_smallrect.getHeight()/(double)2));};
 //BA.debugLineNum = 131;BA.debugLine="If mEnabled Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) { 
 //BA.debugLineNum = 132;BA.debugLine="bc.DrawCircle2(cx, cy, r - 2 * Scale, ThumbColor";
_vvvvvvvvvvvvvvv5._drawcircle2(_cx,(float) (_cy),(float) (_r-2*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,__c.True,(int) (0));
 };
 //BA.debugLineNum = 134;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
_vvvvvvvvvvvvvvv5._setbitmaptoimageview(_vvvvvvvvvvvvvvv5._getbitmap(),(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject())));
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 112;BA.debugLine="Return mEnabled";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return false;
}
public boolean  _getvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub getValue As Boolean";
 //BA.debugLineNum = 103;BA.debugLine="Return mValue";
if (true) return _vvvvvvvvvvvvv6;
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 26;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 27;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvv0 = _callback;
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _pnl_click() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Private Sub pnl_Click";
 //BA.debugLineNum = 69;BA.debugLine="If mEnabled Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) { 
 //BA.debugLineNum = 70;BA.debugLine="SetValueImpl(Not(mValue), False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(__c.Not(_vvvvvvvvvvvvv6),__c.False);
 //BA.debugLineNum = 71;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ValueC";
__c.CallSubDelayed2(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_ValueChanged",(Object)(_vvvvvvvvvvvvv6));
 };
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(boolean _b) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub setEnabled (b As Boolean)";
 //BA.debugLineNum = 107;BA.debugLine="mEnabled = b";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _b;
 //BA.debugLineNum = 108;BA.debugLine="SetValueImpl(mValue, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_vvvvvvvvvvvvv6,__c.True);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvv6(boolean _b) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub setValue(b As Boolean)";
 //BA.debugLineNum = 98;BA.debugLine="If b = mValue Then Return";
if (_b==_vvvvvvvvvvvvv6) { 
if (true) return "";};
 //BA.debugLineNum = 99;BA.debugLine="SetValueImpl(b, False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_b,__c.False);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(boolean _b,boolean _immediate) throws Exception{
ResumableSub_SetValueImpl rsub = new ResumableSub_SetValueImpl(this,_b,_immediate);
rsub.resume(ba, null);
}
public static class ResumableSub_SetValueImpl extends BA.ResumableSub {
public ResumableSub_SetValueImpl(com.testdb.b4xswitch parent,boolean _b,boolean _immediate) {
this.parent = parent;
this._b = _b;
this._immediate = _immediate;
}
com.testdb.b4xswitch parent;
boolean _b;
boolean _immediate;
int _myindex = 0;
long _start = 0L;
int _duration = 0;
float _state1 = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 76;BA.debugLine="mValue = b";
parent._vvvvvvvvvvvvv6 = _b;
 //BA.debugLineNum = 77;BA.debugLine="LoopIndex = LoopIndex + 1";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+1);
 //BA.debugLineNum = 78;BA.debugLine="If Immediate Then";
if (true) break;

case 1:
//if
this.state = 41;
if (_immediate) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 79;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 4:
//if
this.state = 11;
if (parent._vvvvvvvvvvvvv6) { 
this.state = 6;
;}
else {
this.state = 8;
;}if (true) break;

case 6:
//C
this.state = 11;
parent._vvvvvvvvvvvvvvvv7((float) (1));
if (true) break;

case 8:
//C
this.state = 11;
parent._vvvvvvvvvvvvvvvv7((float) (0));
if (true) break;

case 11:
//C
this.state = 41;
;
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 81;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 82;BA.debugLine="Dim start As Long = DateTime.Now";
_start = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 83;BA.debugLine="Dim duration As Int = 200";
_duration = (int) (200);
 //BA.debugLineNum = 84;BA.debugLine="Do While DateTime.Now < start + duration";
if (true) break;

case 14:
//do while
this.state = 29;
while (parent.__c.DateTime.getNow()<_start+_duration) {
this.state = 16;
if (true) break;
}
if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 85;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
_state1 = (float) ((parent.__c.DateTime.getNow()-_start)/(double)_duration);
 //BA.debugLineNum = 86;BA.debugLine="If mValue = False Then state1 = 1 - state1";
if (true) break;

case 17:
//if
this.state = 22;
if (parent._vvvvvvvvvvvvv6==parent.__c.False) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
_state1 = (float) (1-_state1);
if (true) break;

case 22:
//C
this.state = 23;
;
 //BA.debugLineNum = 87;BA.debugLine="Draw(state1)";
parent._vvvvvvvvvvvvvvvv7(_state1);
 //BA.debugLineNum = 88;BA.debugLine="Sleep(16)";
parent.__c.Sleep(ba,this,(int) (16));
this.state = 42;
return;
case 42:
//C
this.state = 23;
;
 //BA.debugLineNum = 89;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
if (true) break;

case 23:
//if
this.state = 28;
if (_myindex!=parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
this.state = 29;
if (true) break;
if (true) break;

case 28:
//C
this.state = 14;
;
 if (true) break;
;
 //BA.debugLineNum = 91;BA.debugLine="If MyIndex = LoopIndex Then";

case 29:
//if
this.state = 40;
if (_myindex==parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 92;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 32:
//if
this.state = 39;
if (parent._vvvvvvvvvvvvv6) { 
this.state = 34;
;}
else {
this.state = 36;
;}if (true) break;

case 34:
//C
this.state = 39;
parent._vvvvvvvvvvvvvvvv7((float) (1));
if (true) break;

case 36:
//C
this.state = 39;
parent._vvvvvvvvvvvvvvvv7((float) (0));
if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = -1;
;
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

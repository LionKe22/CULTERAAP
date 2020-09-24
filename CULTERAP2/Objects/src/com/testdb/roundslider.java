package com.testdb;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class roundslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.testdb.roundslider");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.testdb.roundslider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv7 = "";
public Object _vvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvvv5 = null;
public int _vvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public Object _vvvvvvv4 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public b4a.example.dateutils _vvvvvvv5 = null;
public com.testdb.main _vvvvvvv6 = null;
public com.testdb.starter _vvvvvvv7 = null;
public com.testdb.httputils2service _vvvvvvv0 = null;
public com.testdb.b4xcollections _vvvvvvvv1 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 85;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvvvvvvvvvvv5.Resize((float) (_width),(float) (_height));
 //BA.debugLineNum = 86;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, Height)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 87;BA.debugLine="If thumb.IsInitialized = False Then CreateThumb";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.IsInitialized()==__c.False) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();};
 //BA.debugLineNum = 88;BA.debugLine="CircleRect.Initialize(ThumbSize + stroke, ThumbSi";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.Initialize((float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2),(float) (_width-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2),(float) (_height-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
 //BA.debugLineNum = 89;BA.debugLine="xlbl.SetLayoutAnimated(0, CircleRect.Left, Circle";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (0),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getLeft()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getTop()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getWidth()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getHeight()));
 //BA.debugLineNum = 90;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv0 = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 11;BA.debugLine="Private mValue As Int = 75";
_vvvvvvvvvvvvv6 = (int) (75);
 //BA.debugLineNum = 12;BA.debugLine="Private mMin, mMax As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 13;BA.debugLine="Private thumb As B4XBitmap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private pnl As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private xlbl As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private CircleRect As B4XRect";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 17;BA.debugLine="Private ValueColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
 //BA.debugLineNum = 18;BA.debugLine="Private stroke As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private ThumbSize As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
_vvvvvvv4 = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Private mThumbBorderColor As Int = 0xFF5B5B5B";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int) (0xff5b5b5b);
 //BA.debugLineNum = 22;BA.debugLine="Private mThumbInnerColor As Int = xui.Color_White";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvv2.Color_White;
 //BA.debugLineNum = 23;BA.debugLine="Private mCircleFillColor As Int = xui.Color_White";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvv2.Color_White;
 //BA.debugLineNum = 24;BA.debugLine="Private mCircleNonValueColor As Int = 0xFFB6B6B6";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (int) (0xffb6b6b6);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
b4a.example.bcpath _p = null;
int _r = 0;
int _g = 0;
int _l = 0;
b4a.example.bitmapcreator _bc = null;
 //BA.debugLineNum = 65;BA.debugLine="Private Sub CreateThumb";
 //BA.debugLineNum = 66;BA.debugLine="Dim p As BCPath";
_p = new b4a.example.bcpath();
 //BA.debugLineNum = 67;BA.debugLine="Dim r As Int = 80dip";
_r = __c.DipToCurrent((int) (80));
 //BA.debugLineNum = 68;BA.debugLine="Dim g As Int = 8dip";
_g = __c.DipToCurrent((int) (8));
 //BA.debugLineNum = 69;BA.debugLine="Dim l As Int = 28dip";
_l = __c.DipToCurrent((int) (28));
 //BA.debugLineNum = 70;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 71;BA.debugLine="bc.Initialize(2 * r + g + 3dip, 2 * r + l + g)";
_bc._initialize(ba,(int) (2*_r+_g+__c.DipToCurrent((int) (3))),(int) (2*_r+_l+_g));
 //BA.debugLineNum = 72;BA.debugLine="p.Initialize(r - l + g, 2 * r - 2dip + g)";
_p._initialize(ba,(float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
 //BA.debugLineNum = 73;BA.debugLine="p.LineTo(r + l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r+_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
 //BA.debugLineNum = 74;BA.debugLine="p.LineTo(r + g, 2 * r + l + g)";
_p._lineto((float) (_r+_g),(float) (2*_r+_l+_g));
 //BA.debugLineNum = 75;BA.debugLine="p.LineTo(r - l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
 //BA.debugLineNum = 76;BA.debugLine="bc.DrawPath(p, mThumbBorderColor, True, 0)";
_bc._drawpath(_p,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,__c.True,(int) (0));
 //BA.debugLineNum = 77;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbInnerColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,__c.True,(int) (0));
 //BA.debugLineNum = 78;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbBorderColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,__c.False,__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 79;BA.debugLine="thumb = bc.Bitmap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _bc._getbitmap();
 //BA.debugLineNum = 80;BA.debugLine="ThumbSize = thumb.Height / 4";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getHeight()/(double)4);
 //BA.debugLineNum = 81;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 34;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvv1.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvv4 = _vvvvvvvvvvvvv1.getTag();
 //BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvv1.setTag(this);
 //BA.debugLineNum = 36;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvvvvvvvvvvv5.Initialize(_vvvvvvvvvvvvv1);
 //BA.debugLineNum = 37;BA.debugLine="mMin = Props.Get(\"Min\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
 //BA.debugLineNum = 38;BA.debugLine="mMax = Props.Get(\"Max\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
 //BA.debugLineNum = 39;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvv2.CreatePanel(ba,"pnl");
 //BA.debugLineNum = 40;BA.debugLine="xlbl = Lbl";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 41;BA.debugLine="mBase.AddView(xlbl, 0, 0, 0, 0)";
_vvvvvvvvvvvvv1.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 42;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
_vvvvvvvvvvvvv1.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 43;BA.debugLine="ValueColor = xui.PaintOrColorToColor(Props.Get(\"V";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvvv2.PaintOrColorToColor(_props.Get((Object)("ValueColor")));
 //BA.debugLineNum = 44;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then";
if (_vvvvvvvvvvvvv2.getIsB4A() || _vvvvvvvvvvvvv2.getIsB4i()) { 
 //BA.debugLineNum = 45;BA.debugLine="stroke = 8dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = __c.DipToCurrent((int) (8));
 }else if(_vvvvvvvvvvvvv2.getIsB4J()) { 
 //BA.debugLineNum = 47;BA.debugLine="stroke = 6dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = __c.DipToCurrent((int) (6));
 };
 //BA.debugLineNum = 49;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvv1.getHeight());
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv7() throws Exception{
int _radius = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _angle = 0;
int _b4jstrokeoffset = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _dest = null;
int _r = 0;
int _cx = 0;
int _cy = 0;
 //BA.debugLineNum = 93;BA.debugLine="Public Sub Draw";
 //BA.debugLineNum = 94;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvvvvvvvvvvv5.ClearRect(_vvvvvvvvvvvvvvvvv5.getTargetRect());
 //BA.debugLineNum = 95;BA.debugLine="Dim radius As Int = CircleRect.Width / 2";
_radius = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getWidth()/(double)2);
 //BA.debugLineNum = 96;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
_vvvvvvvvvvvvvvvvv5.DrawCircle(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getCenterX(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getCenterY(),(float) (_radius),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.False,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
 //BA.debugLineNum = 97;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 98;BA.debugLine="Dim angle As Int = (mValue - mMin) / (mMax - mMin";
_angle = (int) ((_vvvvvvvvvvvvv6-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)/(double)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3)*360);
 //BA.debugLineNum = 99;BA.debugLine="Dim B4JStrokeOffset As Int";
_b4jstrokeoffset = 0;
 //BA.debugLineNum = 100;BA.debugLine="If xui.IsB4J Then B4JStrokeOffset = stroke / 2";
if (_vvvvvvvvvvvvv2.getIsB4J()) { 
_b4jstrokeoffset = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2/(double)2);};
 //BA.debugLineNum = 101;BA.debugLine="p.InitializeArc(CircleRect.CenterX, CircleRect.Ce";
_p.InitializeArc(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getCenterX(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getCenterY(),(float) (_radius+_b4jstrokeoffset),(float) (-90),(float) (_angle));
 //BA.debugLineNum = 102;BA.debugLine="cvs.DrawPath(p, ValueColor, False, stroke)";
_vvvvvvvvvvvvvvvvv5.DrawPath(_p,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,__c.False,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
 //BA.debugLineNum = 103;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
_vvvvvvvvvvvvvvvvv5.DrawCircle(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getCenterX(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getCenterY(),(float) (_radius-_b4jstrokeoffset),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.True,(float) (0));
 //BA.debugLineNum = 104;BA.debugLine="Dim dest As B4XRect";
_dest = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 105;BA.debugLine="Dim r As Int = radius + ThumbSize / 2 + stroke /";
_r = (int) (_radius+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3/(double)2+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2/(double)2);
 //BA.debugLineNum = 106;BA.debugLine="Dim cx As Int = CircleRect.CenterX + r * CosD(ang";
_cx = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getCenterX()+_r*__c.CosD(_angle-90));
 //BA.debugLineNum = 107;BA.debugLine="Dim cy As Int = CircleRect.CenterY + r * SinD(ang";
_cy = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getCenterY()+_r*__c.SinD(_angle-90));
 //BA.debugLineNum = 108;BA.debugLine="dest.Initialize(cx - thumb.Width / 8, cy - ThumbS";
_dest.Initialize((float) (_cx-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()/(double)8),(float) (_cy-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3/(double)2),(float) (_cx+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getWidth()/(double)8),(float) (_cy+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3/(double)2));
 //BA.debugLineNum = 109;BA.debugLine="cvs.DrawBitmapRotated(thumb, dest, angle)";
_vvvvvvvvvvvvvvvvv5.DrawBitmapRotated((android.graphics.Bitmap)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject()),_dest,(float) (_angle));
 //BA.debugLineNum = 110;BA.debugLine="cvs.Invalidate";
_vvvvvvvvvvvvvvvvv5.Invalidate();
 //BA.debugLineNum = 111;BA.debugLine="xlbl.Text = mValue";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setText(BA.ObjectToCharSequence(_vvvvvvvvvvvvv6));
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public int  _getvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Public Sub getValue As Int";
 //BA.debugLineNum = 153;BA.debugLine="Return mValue";
if (true) return _vvvvvvvvvvvvv6;
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 28;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 29;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvv0 = _callback;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _pnl_touch(int _action,float _x,float _y) throws Exception{
int _dx = 0;
int _dy = 0;
float _dist = 0f;
int _angle = 0;
int _newvalue = 0;
 //BA.debugLineNum = 114;BA.debugLine="Private Sub pnl_Touch (Action As Int, X As Float,";
 //BA.debugLineNum = 115;BA.debugLine="If Action = pnl.TOUCH_ACTION_MOVE_NOTOUCH Then Re";
if (_action==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
 //BA.debugLineNum = 116;BA.debugLine="Dim dx As Int = x - CircleRect.CenterX";
_dx = (int) (_x-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getCenterX());
 //BA.debugLineNum = 117;BA.debugLine="Dim dy As Int = y - CircleRect.CenterY";
_dy = (int) (_y-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getCenterY());
 //BA.debugLineNum = 118;BA.debugLine="Dim dist As Float = Sqrt(Power(dx, 2) + Power(dy,";
_dist = (float) (__c.Sqrt(__c.Power(_dx,2)+__c.Power(_dy,2)));
 //BA.debugLineNum = 119;BA.debugLine="If dist > CircleRect.Width / 2 Then";
if (_dist>_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getWidth()/(double)2) { 
 //BA.debugLineNum = 120;BA.debugLine="Dim angle As Int = Round(ATan2D(dy, dx))";
_angle = (int) (__c.Round(__c.ATan2D(_dy,_dx)));
 //BA.debugLineNum = 121;BA.debugLine="angle = angle + 90";
_angle = (int) (_angle+90);
 //BA.debugLineNum = 122;BA.debugLine="angle = (angle + 360) Mod 360";
_angle = (int) ((_angle+360)%360);
 //BA.debugLineNum = 123;BA.debugLine="Dim NewValue As Int = mMin + angle / 360 * (mMax";
_newvalue = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+_angle/(double)360*(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3));
 //BA.debugLineNum = 124;BA.debugLine="NewValue = Max(mMin, Min(mMax, NewValue))";
_newvalue = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_newvalue)));
 //BA.debugLineNum = 125;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=_vvvvvvvvvvvvv6) { 
 //BA.debugLineNum = 126;BA.debugLine="mValue = NewValue";
_vvvvvvvvvvvvv6 = _newvalue;
 //BA.debugLineNum = 127;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ValueChanged";
__c.CallSubNew2(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_ValueChanged",(Object)(_vvvvvvvvvvvvv6));
 };
 //BA.debugLineNum = 129;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvv7();
 };
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(int _nonvaluecolor,int _innercolor) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub SetCircleColor (NonValueColor As Int, I";
 //BA.debugLineNum = 60;BA.debugLine="mCircleNonValueColor = NonValueColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _nonvaluecolor;
 //BA.debugLineNum = 61;BA.debugLine="mCircleFillColor = InnerColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _innercolor;
 //BA.debugLineNum = 62;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(int _bordercolor,int _innercolor) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub SetThumbColor(BorderColor As Int, Inner";
 //BA.debugLineNum = 53;BA.debugLine="mThumbBorderColor = BorderColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _bordercolor;
 //BA.debugLineNum = 54;BA.debugLine="mThumbInnerColor = InnerColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _innercolor;
 //BA.debugLineNum = 55;BA.debugLine="CreateThumb";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
 //BA.debugLineNum = 56;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvv6(int _v) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub setValue (v As Int)";
 //BA.debugLineNum = 148;BA.debugLine="mValue = Max(mMin, Min(mMax, v))";
_vvvvvvvvvvvvv6 = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_v)));
 //BA.debugLineNum = 149;BA.debugLine="Draw";
_vvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

package com.testdb;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xfloattextfield extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.testdb.b4xfloattextfield");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.testdb.b4xfloattextfield.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv7 = "";
public Object _vvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0f;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0f;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public Object _vvvvvvv4 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
public com.testdb.b4xfloattextfield _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.IME _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public b4a.example.dateutils _vvvvvvv5 = null;
public com.testdb.main _vvvvvvv6 = null;
public com.testdb.starter _vvvvvvv7 = null;
public com.testdb.httputils2service _vvvvvvv0 = null;
public com.testdb.b4xcollections _vvvvvvvv1 = null;
public String  _base_resize(double _width,double _height) throws Exception{
int _firstdistance = 0;
 //BA.debugLineNum = 174;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 175;BA.debugLine="mTextField.SetLayoutAnimated(0, 0, 0, Width, Heig";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 176;BA.debugLine="Dim FirstDistance As Int = 2dip";
_firstdistance = __c.DipToCurrent((int) (2));
 //BA.debugLineNum = 177;BA.debugLine="If Multiline And xui.IsB4J Then FirstDistance = 2";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 && _vvvvvvvvvvvvv2.getIsB4J()) { 
_firstdistance = __c.DipToCurrent((int) (22));};
 //BA.debugLineNum = 178;BA.debugLine="If lblV.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.IsInitialized()) { 
 //BA.debugLineNum = 179;BA.debugLine="lblV.SetLayoutAnimated(0, Width - lblV.Width - F";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (0),(int) (_width-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getWidth()-_firstdistance),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getWidth(),(int) (_height));
 //BA.debugLineNum = 180;BA.debugLine="FirstDistance = FirstDistance + lblV.Width + 2di";
_firstdistance = (int) (_firstdistance+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getWidth()+__c.DipToCurrent((int) (2)));
 };
 //BA.debugLineNum = 182;BA.debugLine="If lblClear.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.IsInitialized()) { 
 //BA.debugLineNum = 183;BA.debugLine="lblClear.SetLayoutAnimated(0, Width - lblClear.W";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.SetLayoutAnimated((int) (0),(int) (_width-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getWidth()-_firstdistance),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getWidth(),(int) (_height));
 };
 //BA.debugLineNum = 185;BA.debugLine="UpdateLabel(mTextField.Text, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getText(),__c.True);
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 16;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv0 = new Object();
 //BA.debugLineNum = 17;BA.debugLine="Public mBase As B4XView 'ignore";
_vvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 19;BA.debugLine="Private mTextField As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private Duration As Int = 200";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (int) (200);
 //BA.debugLineNum = 21;BA.debugLine="Public LargeLabelTextSize = 18, SmallLabelTextSiz";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (float) (18);
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (float) (14);
 //BA.debugLineNum = 22;BA.debugLine="Private LargeLabel As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
 //BA.debugLineNum = 23;BA.debugLine="Private MeasuringCanvas As B4XCanvas";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 24;BA.debugLine="Public HintColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
 //BA.debugLineNum = 25;BA.debugLine="Public NonFocusedHintColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 26;BA.debugLine="Private HorizontalPadding As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 27;BA.debugLine="Private HintImageView As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Public HintText As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 29;BA.debugLine="Public HintFont As B4XFont";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 30;BA.debugLine="Private LargeFocused, LargeNotFocused, SmallFocus";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Public Focused As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = false;
 //BA.debugLineNum = 32;BA.debugLine="Public lblClear As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Public lblV As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private mProps As Map";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 35;BA.debugLine="Public Tag As Object";
_vvvvvvv4 = new Object();
 //BA.debugLineNum = 36;BA.debugLine="Private KeyboardType As String 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = "";
 //BA.debugLineNum = 37;BA.debugLine="Private Multiline As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
 //BA.debugLineNum = 38;BA.debugLine="Private mNextTextField As B4XFloatTextField";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new com.testdb.b4xfloattextfield();
 //BA.debugLineNum = 40;BA.debugLine="Private IME As IME";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Private Sub CreateAcceptButton";
 //BA.debugLineNum = 119;BA.debugLine="If mProps.GetDefault(\"ShowAccept\", True) = False";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetDefault((Object)("ShowAccept"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
 //BA.debugLineNum = 120;BA.debugLine="lblV = CreateButton(Chr(0xE5CA))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvvvvvvvvvvvvvvvvvvvvvvv0(BA.ObjectToString(__c.Chr((int) (0xe5ca))));
 //BA.debugLineNum = 121;BA.debugLine="lblV.Tag = \"v\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setTag((Object)("v"));
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _vvvvvvvvvvvv1(anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _c = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
 //BA.debugLineNum = 230;BA.debugLine="Private Sub CreateBitmap(r As B4XRect, Color As In";
 //BA.debugLineNum = 231;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvvvvvvvvvv2.CreatePanel(ba,"");
 //BA.debugLineNum = 232;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Max(1, r.Width + 2di";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (__c.Max(1,_r.getWidth()+__c.DipToCurrent((int) (2)))),(int) (__c.Max(1,_r.getHeight()+__c.DipToCurrent((int) (2)))));
 //BA.debugLineNum = 233;BA.debugLine="Dim c As B4XCanvas";
_c = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 234;BA.debugLine="c.Initialize(p)";
_c.Initialize(_p);
 //BA.debugLineNum = 235;BA.debugLine="Dim BaseLine As Int = p.Height / 2 - r.Height / 2";
_baseline = (int) (_p.getHeight()/(double)2-_r.getHeight()/(double)2-_r.getTop());
 //BA.debugLineNum = 236;BA.debugLine="c.DrawText(HintText, p.Width / 2, BaseLine, Fnt,";
_c.DrawText(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,(float) (_p.getWidth()/(double)2),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 237;BA.debugLine="Dim bmp As B4XBitmap = c.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _c.CreateBitmap();
 //BA.debugLineNum = 238;BA.debugLine="c.Release";
_c.Release();
 //BA.debugLineNum = 239;BA.debugLine="Return bmp";
if (true) return _bmp;
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvv0(String _text) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lc = null;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
 //BA.debugLineNum = 160;BA.debugLine="Private Sub CreateButton (Text As String) As B4XVi";
 //BA.debugLineNum = 161;BA.debugLine="Dim lc As Label";
_lc = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 162;BA.debugLine="lc.Initialize(\"lc\")";
_lc.Initialize(ba,"lc");
 //BA.debugLineNum = 163;BA.debugLine="Dim x As B4XView = lc";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
_x.setObject((java.lang.Object)(_lc.getObject()));
 //BA.debugLineNum = 164;BA.debugLine="x = lc";
_x.setObject((java.lang.Object)(_lc.getObject()));
 //BA.debugLineNum = 165;BA.debugLine="x.Font = xui.CreateMaterialIcons(20)";
_x.setFont(_vvvvvvvvvvvvv2.CreateMaterialIcons((float) (20)));
 //BA.debugLineNum = 166;BA.debugLine="x.Text = Text";
_x.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 167;BA.debugLine="x.TextColor = mTextField.TextColor";
_x.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getTextColor());
 //BA.debugLineNum = 168;BA.debugLine="x.Visible = False";
_x.setVisible(__c.False);
 //BA.debugLineNum = 169;BA.debugLine="x.SetTextAlignment(\"CENTER\", \"CENTER\")";
_x.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 170;BA.debugLine="mBase.AddView(x, 0, 0, 30dip, 30dip)";
_vvvvvvvvvvvvv1.AddView((android.view.View)(_x.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 171;BA.debugLine="Return x";
if (true) return _x;
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Private Sub CreateClearButton";
 //BA.debugLineNum = 111;BA.debugLine="If mProps.GetDefault(\"ShowClear\", True) = False T";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.GetDefault((Object)("ShowClear"),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
 //BA.debugLineNum = 112;BA.debugLine="If lblClear.IsInitialized And lblClear.Parent.IsI";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.IsInitialized() && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getParent().IsInitialized()) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.RemoveViewFromParent();};
 //BA.debugLineNum = 113;BA.debugLine="lblClear = CreateButton(Chr(0xE14C))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvv0(BA.ObjectToString(__c.Chr((int) (0xe14c))));
 //BA.debugLineNum = 114;BA.debugLine="lblClear.Tag = \"clear\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTag((Object)("clear"));
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Private Sub CreateRevealButton";
 //BA.debugLineNum = 126;BA.debugLine="lblClear = CreateButton(Chr(0xE8F4))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvv0(BA.ObjectToString(__c.Chr((int) (0xe8f4))));
 //BA.debugLineNum = 127;BA.debugLine="lblClear.Tag = \"reveal\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTag((Object)("reveal"));
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(boolean _password) throws Exception{
anywheresoftware.b4a.objects.EditTextWrapper _tf = null;
 //BA.debugLineNum = 301;BA.debugLine="Private Sub CreateTextField (Password As Boolean)";
 //BA.debugLineNum = 315;BA.debugLine="Dim tf As EditText";
_tf = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 316;BA.debugLine="tf.Initialize(\"tf\")";
_tf.Initialize(ba,"tf");
 //BA.debugLineNum = 317;BA.debugLine="tf.SingleLine = Not(Multiline)";
_tf.setSingleLine(__c.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
 //BA.debugLineNum = 318;BA.debugLine="tf.PasswordMode = Password";
_tf.setPasswordMode(_password);
 //BA.debugLineNum = 319;BA.debugLine="If Password And KeyboardType <> \"Text\" Then";
if (_password && (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1).equals("Text") == false) { 
 //BA.debugLineNum = 320;BA.debugLine="tf.InputType = Bit.Or(tf.INPUT_TYPE_NUMBERS, 16)";
_tf.setInputType(__c.Bit.Or(_tf.INPUT_TYPE_NUMBERS,(int) (16)));
 }else {
 //BA.debugLineNum = 322;BA.debugLine="Select KeyboardType";
switch (BA.switchObjectToInt(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,"Numbers","Decimal")) {
case 0: {
 //BA.debugLineNum = 324;BA.debugLine="tf.InputType = tf.INPUT_TYPE_NUMBERS";
_tf.setInputType(_tf.INPUT_TYPE_NUMBERS);
 break; }
case 1: {
 //BA.debugLineNum = 326;BA.debugLine="tf.InputType = tf.INPUT_TYPE_DECIMAL_NUMBERS";
_tf.setInputType(_tf.INPUT_TYPE_DECIMAL_NUMBERS);
 break; }
}
;
 };
 //BA.debugLineNum = 329;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf.getObject()));
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(boolean _passwordmode,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1,int _textcolor) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Private Sub CreateTextFieldAll (PasswordMode As Bo";
 //BA.debugLineNum = 103;BA.debugLine="mTextField = CreateTextField (PasswordMode)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(_passwordmode);
 //BA.debugLineNum = 104;BA.debugLine="mTextField.Font = Font1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setFont(_font1);
 //BA.debugLineNum = 105;BA.debugLine="mTextField.TextColor = TextColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setTextColor(_textcolor);
 //BA.debugLineNum = 106;BA.debugLine="setNextField(mNextTextField)";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 107;BA.debugLine="mBase.AddView(mTextField, 0, 0, 0, 0)";
_vvvvvvvvvvvvv1.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _passedlabel = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
boolean _passwordmode = false;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 61;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
 //BA.debugLineNum = 62;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvv1.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 63;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvv4 = _vvvvvvvvvvvvv1.getTag();
 //BA.debugLineNum = 63;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvv1.setTag(this);
 //BA.debugLineNum = 64;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
_vvvvvvvvvvvvv1.SetColorAndBorder(_vvvvvvvvvvvvv2.Color_Transparent,(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 65;BA.debugLine="mProps = Props";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _props;
 //BA.debugLineNum = 66;BA.debugLine="Dim PassedLabel As B4XView = lbl";
_passedlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_passedlabel.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 67;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 68;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 69;BA.debugLine="HintImageView = iv";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setObject((java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 70;BA.debugLine="KeyboardType = Props.GetDefault(\"KeyboardType\", \"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = BA.ObjectToString(_props.GetDefault((Object)("KeyboardType"),(Object)("Text")));
 //BA.debugLineNum = 75;BA.debugLine="HintColor = xui.PaintOrColorToColor(Props.Get(\"Hi";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvv2.PaintOrColorToColor(_props.Get((Object)("HintColor")));
 //BA.debugLineNum = 76;BA.debugLine="NonFocusedHintColor = xui.PaintOrColorToColor(Pro";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvv2.PaintOrColorToColor(_props.Get((Object)("NonFocusedHintColor")));
 //BA.debugLineNum = 78;BA.debugLine="HintText = Props.Get(\"Hint\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = BA.ObjectToString(_props.Get((Object)("Hint")));
 //BA.debugLineNum = 79;BA.debugLine="HintFont = PassedLabel.Font";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _passedlabel.getFont();
 //BA.debugLineNum = 80;BA.debugLine="Dim PasswordMode As Boolean = Props.GetDefault(\"P";
_passwordmode = BA.ObjectToBoolean(_props.GetDefault((Object)("PasswordField"),(Object)(__c.False)));
 //BA.debugLineNum = 81;BA.debugLine="Multiline = Props.GetDefault(\"Multiline\", False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = BA.ObjectToBoolean(_props.GetDefault((Object)("Multiline"),(Object)(__c.False)));
 //BA.debugLineNum = 82;BA.debugLine="If PasswordMode And Multiline Then";
if (_passwordmode && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) { 
 //BA.debugLineNum = 83;BA.debugLine="Multiline = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = __c.False;
 //BA.debugLineNum = 84;BA.debugLine="Log(\"Multiline not supported with password mode.";
__c.LogImpl("912582935","Multiline not supported with password mode.",0);
 };
 //BA.debugLineNum = 86;BA.debugLine="CreateTextFieldAll(PasswordMode, PassedLabel.Font";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_passwordmode,_passedlabel.getFont(),_vvvvvvvvvvvvv2.PaintOrColorToColor((Object)(_lbl.getTextColor())));
 //BA.debugLineNum = 88;BA.debugLine="mBase.AddView(HintImageView, 0, 0, 0, 0)";
_vvvvvvvvvvvvv1.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 89;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvvvvvvvvvvvv2.CreatePanel(ba,"");
 //BA.debugLineNum = 90;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 91;BA.debugLine="MeasuringCanvas.Initialize(p)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.Initialize(_p);
 //BA.debugLineNum = 92;BA.debugLine="Update";
_vvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 93;BA.debugLine="If PasswordMode And Props.GetDefault(\"ShowRevealB";
if (_passwordmode && BA.ObjectToBoolean(_props.GetDefault((Object)("ShowRevealButton"),(Object)(__c.False)))) { 
 //BA.debugLineNum = 94;BA.debugLine="CreateRevealButton";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7();
 }else {
 //BA.debugLineNum = 96;BA.debugLine="CreateClearButton";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
 };
 //BA.debugLineNum = 98;BA.debugLine="CreateAcceptButton";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5();
 //BA.debugLineNum = 99;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvv1.getHeight());
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public com.testdb.b4xfloattextfield  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Public Sub getNextField As B4XFloatTextField";
 //BA.debugLineNum = 269;BA.debugLine="Return mNextTextField";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Public Sub getText As String";
 //BA.debugLineNum = 356;BA.debugLine="Return mTextField.Text";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getText();
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 406;BA.debugLine="Public Sub getTextField As B4XView";
 //BA.debugLineNum = 407;BA.debugLine="Return mTextField";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public boolean  _ime_handleaction() throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Private Sub ime_HandleAction As Boolean";
 //BA.debugLineNum = 288;BA.debugLine="tf_EnterPressed";
_tf_enterpressed();
 //BA.debugLineNum = 289;BA.debugLine="If mNextTextField.IsInitialized Then Return True";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.IsInitialized /*boolean*/ ()) { 
if (true) return __c.True;};
 //BA.debugLineNum = 290;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 44;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 45;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 46;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvv0 = _callback;
 //BA.debugLineNum = 47;BA.debugLine="If xui.IsB4A Then";
if (_vvvvvvvvvvvvv2.getIsB4A()) { 
 //BA.debugLineNum = 48;BA.debugLine="HorizontalPadding = 6dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (6));
 }else {
 //BA.debugLineNum = 50;BA.debugLine="HorizontalPadding = 12dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (12));
 };
 //BA.debugLineNum = 53;BA.debugLine="IME.Initialize(\"ime\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize("ime");
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _lc_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
 //BA.debugLineNum = 370;BA.debugLine="Private Sub lc_Click";
 //BA.debugLineNum = 371;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn.setObject((java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 372;BA.debugLine="Select btn.Tag";
switch (BA.switchObjectToInt(_btn.getTag(),(Object)("clear"),(Object)("reveal"),(Object)("hide"),(Object)("v"))) {
case 0: {
 //BA.debugLineNum = 374;BA.debugLine="setText(\"\")";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3("");
 break; }
case 1: {
 //BA.debugLineNum = 376;BA.debugLine="SwitchFromPasswordToRegular (True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(__c.True);
 break; }
case 2: {
 //BA.debugLineNum = 378;BA.debugLine="SwitchFromPasswordToRegular(False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(__c.False);
 break; }
case 3: {
 //BA.debugLineNum = 380;BA.debugLine="tf_EnterPressed";
_tf_enterpressed();
 //BA.debugLineNum = 381;BA.debugLine="If mNextTextField.IsInitialized = False Or mNex";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.IsInitialized /*boolean*/ ()==__c.False || (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3).equals((com.testdb.b4xfloattextfield)(this))) { 
 //BA.debugLineNum = 383;BA.debugLine="IME.HideKeyboard";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.HideKeyboard(ba);
 };
 break; }
}
;
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 411;BA.debugLine="Public Sub RequestFocusAndShowKeyboard";
 //BA.debugLineNum = 412;BA.debugLine="mTextField.RequestFocus";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.RequestFocus();
 //BA.debugLineNum = 414;BA.debugLine="IME.ShowKeyboard(mTextField)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.ShowKeyboard((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject()));
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(com.testdb.b4xfloattextfield _field) throws Exception{
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
Object _o = null;
 //BA.debugLineNum = 272;BA.debugLine="Public Sub setNextField (Field As B4XFloatTextFiel";
 //BA.debugLineNum = 273;BA.debugLine="If Field.IsInitialized = False Then Return";
if (_field.IsInitialized /*boolean*/ ()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 275;BA.debugLine="If Multiline = False Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2==__c.False) { 
 //BA.debugLineNum = 276;BA.debugLine="If Field <> Me Then";
if ((_field).equals((com.testdb.b4xfloattextfield)(this)) == false) { 
 //BA.debugLineNum = 277;BA.debugLine="IME.AddHandleActionEvent(mTextField)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.AddHandleActionEvent((android.widget.EditText)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject()),ba);
 };
 //BA.debugLineNum = 279;BA.debugLine="Dim et As EditText = mTextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et.setObject((android.widget.EditText)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject()));
 //BA.debugLineNum = 280;BA.debugLine="et.ForceDoneButton = True";
_et.setForceDoneButton(__c.True);
 };
 //BA.debugLineNum = 283;BA.debugLine="Dim o As Object = Field";
_o = (Object)(_field);
 //BA.debugLineNum = 284;BA.debugLine="mNextTextField = o";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (com.testdb.b4xfloattextfield)(_o);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(String _s) throws Exception{
String _old = "";
 //BA.debugLineNum = 359;BA.debugLine="Public Sub setText(s As String)";
 //BA.debugLineNum = 360;BA.debugLine="Dim old As String = mTextField.Text 'ignore";
_old = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getText();
 //BA.debugLineNum = 361;BA.debugLine="mTextField.Text = s";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setText(BA.ObjectToCharSequence(_s));
 //BA.debugLineNum = 363;BA.debugLine="If IsPaused(Me) Then tf_TextChanged(old, s)";
if (__c.IsPaused(ba,this)) { 
_tf_textchanged(_old,_s);};
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(boolean _toregular) throws Exception{
String _text = "";
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1 = null;
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
 //BA.debugLineNum = 130;BA.debugLine="Private Sub SwitchFromPasswordToRegular (ToRegular";
 //BA.debugLineNum = 131;BA.debugLine="Dim text As String = mTextField.Text";
_text = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getText();
 //BA.debugLineNum = 132;BA.debugLine="Dim textcolor As Int = mTextField.TextColor";
_textcolor = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getTextColor();
 //BA.debugLineNum = 133;BA.debugLine="Dim Font1 As B4XFont = mTextField.Font";
_font1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getFont();
 //BA.debugLineNum = 134;BA.debugLine="mTextField.RemoveViewFromParent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.RemoveViewFromParent();
 //BA.debugLineNum = 135;BA.debugLine="CreateTextFieldAll(Not(ToRegular), Font1, textcol";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(__c.Not(_toregular),_font1,_textcolor);
 //BA.debugLineNum = 136;BA.debugLine="mTextField.Text = text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 137;BA.debugLine="If lblClear.IsInitialized Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.IsInitialized()) { 
 //BA.debugLineNum = 138;BA.debugLine="If ToRegular = False Then";
if (_toregular==__c.False) { 
 //BA.debugLineNum = 139;BA.debugLine="lblClear.Text = Chr(0xE8F4)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setText(BA.ObjectToCharSequence(__c.Chr((int) (0xe8f4))));
 //BA.debugLineNum = 140;BA.debugLine="lblClear.Tag = \"reveal\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTag((Object)("reveal"));
 }else {
 //BA.debugLineNum = 142;BA.debugLine="lblClear.Tag = \"hide\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTag((Object)("hide"));
 //BA.debugLineNum = 143;BA.debugLine="lblClear.Text = Chr(0xE8F5)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setText(BA.ObjectToCharSequence(__c.Chr((int) (0xe8f5))));
 };
 //BA.debugLineNum = 145;BA.debugLine="lblClear.BringToFront";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.BringToFront();
 };
 //BA.debugLineNum = 147;BA.debugLine="If lblV.IsInitialized Then lblV.BringToFront";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.IsInitialized()) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.BringToFront();};
 //BA.debugLineNum = 148;BA.debugLine="HintImageView.BringToFront";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.BringToFront();
 //BA.debugLineNum = 149;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvv1.getHeight());
 //BA.debugLineNum = 154;BA.debugLine="Dim et As EditText = mTextField";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et.setObject((android.widget.EditText)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject()));
 //BA.debugLineNum = 155;BA.debugLine="et.SelectionStart = mTextField.Text.Length";
_et.setSelectionStart(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getText().length());
 //BA.debugLineNum = 157;BA.debugLine="mTextField.RequestFocus";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.RequestFocus();
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _tf_action() throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Private Sub tf_Action";
 //BA.debugLineNum = 251;BA.debugLine="If mNextTextField.IsInitialized And mNextTextFiel";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.IsInitialized /*boolean*/ () && (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3).equals((com.testdb.b4xfloattextfield)(this)) == false) { 
 //BA.debugLineNum = 252;BA.debugLine="mNextTextField.TextField.RequestFocus";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3._getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().RequestFocus();
 };
 //BA.debugLineNum = 254;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EnterP";
if (_vvvvvvvvvvvvv2.SubExists(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_EnterPressed",(int) (0))) { 
 //BA.debugLineNum = 255;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_EnterPr";
__c.CallSubDelayed(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_EnterPressed");
 };
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public String  _tf_beginedit() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Private Sub tf_BeginEdit";
 //BA.debugLineNum = 243;BA.debugLine="tf_FocusChanged(True)";
_tf_focuschanged(__c.True);
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return "";
}
public String  _tf_endedit() throws Exception{
 //BA.debugLineNum = 246;BA.debugLine="Private Sub tf_EndEdit";
 //BA.debugLineNum = 247;BA.debugLine="tf_FocusChanged(False)";
_tf_focuschanged(__c.False);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public String  _tf_enterpressed() throws Exception{
 //BA.debugLineNum = 293;BA.debugLine="Private Sub tf_EnterPressed";
 //BA.debugLineNum = 294;BA.debugLine="tf_Action";
_tf_action();
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public String  _tf_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Private Sub tf_FocusChanged (HasFocus As Boolean)";
 //BA.debugLineNum = 213;BA.debugLine="Focused = HasFocus";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _hasfocus;
 //BA.debugLineNum = 214;BA.debugLine="UpdateLabel(mTextField.Text, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getText(),__c.True);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public String  _tf_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 260;BA.debugLine="Private Sub tf_TextChanged (Old As String, New As";
 //BA.debugLineNum = 261;BA.debugLine="UpdateLabel(New, False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_new,__c.False);
 //BA.debugLineNum = 262;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TextCh";
if (_vvvvvvvvvvvvv2.SubExists(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_TextChanged",(int) (2))) { 
 //BA.debugLineNum = 263;BA.debugLine="CallSub3(mCallBack, mEventName & \"_TextChanged\",";
__c.CallSubNew3(ba,_vvvvvvvvvvvv0,_vvvvvvvvvvvv7+"_TextChanged",(Object)(_old),(Object)(_new));
 };
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvv3() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 218;BA.debugLine="Public Sub Update";
 //BA.debugLineNum = 219;BA.debugLine="Dim f As B4XFont =  xui.CreateFont2(HintFont, Lar";
_f = _vvvvvvvvvvvvv2.CreateFont2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 220;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.MeasureText(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_f);
 //BA.debugLineNum = 221;BA.debugLine="LargeFocused = CreateBitmap(r, HintColor, f)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvvvvvvvv1(_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,_f);
 //BA.debugLineNum = 222;BA.debugLine="LargeNotFocused = CreateBitmap(r, NonFocusedHintC";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvvvvvvvv1(_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_f);
 //BA.debugLineNum = 223;BA.debugLine="f = xui.CreateFont2(HintFont, SmallLabelTextSize)";
_f = _vvvvvvvvvvvvv2.CreateFont2(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 224;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.MeasureText(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_f);
 //BA.debugLineNum = 225;BA.debugLine="SmallFocused = CreateBitmap(r, HintColor, f)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvv1(_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,_f);
 //BA.debugLineNum = 226;BA.debugLine="SmallNotFocused = CreateBitmap(r, NonFocusedHintC";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvv1(_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_f);
 //BA.debugLineNum = 227;BA.debugLine="UpdateLabel(mTextField.Text, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getText(),__c.True);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(String _txt,boolean _force) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
boolean _goingtolarge = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
 //BA.debugLineNum = 188;BA.debugLine="Private Sub UpdateLabel (txt As String, force As B";
 //BA.debugLineNum = 189;BA.debugLine="For Each lbl As B4XView In Array As B4XView(lblCl";
{
final anywheresoftware.b4a.objects.B4XViewWrapper[] group1 = new anywheresoftware.b4a.objects.B4XViewWrapper[]{_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lbl = group1[index1];
 //BA.debugLineNum = 190;BA.debugLine="If lbl.IsInitialized Then lbl.Visible = Focused";
if (_lbl.IsInitialized()) { 
_lbl.setVisible(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 && _txt.length()>0);};
 }
};
 //BA.debugLineNum = 193;BA.debugLine="Dim GoingToLarge As Boolean = txt.Length = 0";
_goingtolarge = _txt.length()==0;
 //BA.debugLineNum = 194;BA.debugLine="If GoingToLarge = LargeLabel And force = False Th";
if (_goingtolarge==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 && _force==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 195;BA.debugLine="Dim b As B4XBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 196;BA.debugLine="If Focused Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5) { 
 //BA.debugLineNum = 197;BA.debugLine="If GoingToLarge Then b = LargeFocused Else b = S";
if (_goingtolarge) { 
_b = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;}
else {
_b = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;};
 }else {
 //BA.debugLineNum = 199;BA.debugLine="If GoingToLarge Then b = LargeNotFocused Else b";
if (_goingtolarge) { 
_b = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;}
else {
_b = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;};
 };
 //BA.debugLineNum = 201;BA.debugLine="If b.IsInitialized = False Then Return";
if (_b.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 202;BA.debugLine="HintImageView.SetBitmap(b)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.SetBitmap((android.graphics.Bitmap)(_b.getObject()));
 //BA.debugLineNum = 203;BA.debugLine="If GoingToLarge Then";
if (_goingtolarge) { 
 //BA.debugLineNum = 204;BA.debugLine="HintImageView.SetLayoutAnimated (Duration, Horiz";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.SetLayoutAnimated(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,(int) (_vvvvvvvvvvvvv1.getHeight()/(double)2-_b.getHeight()/(double)2),(int) (_b.getWidth()),(int) (_b.getHeight()));
 //BA.debugLineNum = 205;BA.debugLine="LargeLabel = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.True;
 }else {
 //BA.debugLineNum = 207;BA.debugLine="HintImageView.SetLayoutAnimated(Duration, 2dip,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.SetLayoutAnimated(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)),(int) (_b.getWidth()),(int) (_b.getHeight()));
 //BA.debugLineNum = 208;BA.debugLine="LargeLabel = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = __c.False;
 };
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

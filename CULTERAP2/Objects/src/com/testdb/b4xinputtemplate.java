package com.testdb;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xinputtemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.testdb.b4xinputtemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.testdb.b4xinputtemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvv1 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
public com.testdb.b4xdialog _vvvvvvvvvvvvvvvvvvvvvv3 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _textfield1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.IME _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
public b4a.example.dateutils _vvvvvvv5 = null;
public com.testdb.main _vvvvvvv6 = null;
public com.testdb.starter _vvvvvvv7 = null;
public com.testdb.httputils2service _vvvvvvv0 = null;
public com.testdb.b4xcollections _vvvvvvvv1 = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
_vvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Public Text As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 5;BA.debugLine="Private xDialog As B4XDialog";
_vvvvvvvvvvvvvvvvvvvvvv3 = new com.testdb.b4xdialog();
 //BA.debugLineNum = 6;BA.debugLine="Public RegexPattern As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "";
 //BA.debugLineNum = 7;BA.debugLine="Public TextField1 As B4XView";
_textfield1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Public lblTitle As B4XView";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private IME As IME";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 12;BA.debugLine="Private mAllowDecimals As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = false;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(boolean _allowdecimals,boolean _allownegative) throws Exception{
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
 //BA.debugLineNum = 31;BA.debugLine="Public Sub ConfigureForNumbers (AllowDecimals As B";
 //BA.debugLineNum = 33;BA.debugLine="Dim et As EditText = TextField1";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
_et.setObject((android.widget.EditText)(_textfield1.getObject()));
 //BA.debugLineNum = 34;BA.debugLine="If AllowDecimals Or AllowNegative Then";
if (_allowdecimals || _allownegative) { 
 //BA.debugLineNum = 35;BA.debugLine="et.InputType = et.INPUT_TYPE_DECIMAL_NUMBERS";
_et.setInputType(_et.INPUT_TYPE_DECIMAL_NUMBERS);
 }else {
 //BA.debugLineNum = 37;BA.debugLine="et.InputType = et.INPUT_TYPE_NUMBERS";
_et.setInputType(_et.INPUT_TYPE_NUMBERS);
 };
 //BA.debugLineNum = 50;BA.debugLine="If AllowDecimals And AllowNegative Then";
if (_allowdecimals && _allownegative) { 
 //BA.debugLineNum = 51;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else if(_allowdecimals && _allownegative==__c.False) { 
 //BA.debugLineNum = 53;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else if(_allowdecimals==__c.False && _allownegative==__c.True) { 
 //BA.debugLineNum = 55;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)$\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "^-?(0|[1-9]\\d*)$";
 }else if(_allowdecimals==__c.False && _allownegative==__c.False) { 
 //BA.debugLineNum = 57;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)$\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = "^(0|[1-9]\\d*)$";
 };
 //BA.debugLineNum = 59;BA.debugLine="mAllowDecimals = AllowDecimals";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _allowdecimals;
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(int _result) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Private Sub DialogClosed(Result As Int)";
 //BA.debugLineNum = 125;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (_result==_vvvvvvvvvvvvv2.DialogResponse_Positive) { 
 //BA.debugLineNum = 126;BA.debugLine="Text = TextField1.Text";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _textfield1.getText();
 };
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(com.testdb.b4xdialog _dialog) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
 //BA.debugLineNum = 104;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvv1;
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 16;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
_vvvvvvvvvvvvv1 = _vvvvvvvvvvvvv2.CreatePanel(ba,"mBase");
 //BA.debugLineNum = 17;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 80dip)";
_vvvvvvvvvvvvv1.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (80)));
 //BA.debugLineNum = 18;BA.debugLine="mBase.LoadLayout(\"B4XInputTemplate\")";
_vvvvvvvvvvvvv1.LoadLayout("B4XInputTemplate",ba);
 //BA.debugLineNum = 19;BA.debugLine="TextField1.TextColor = xui.Color_White";
_textfield1.setTextColor(_vvvvvvvvvvvvv2.Color_White);
 //BA.debugLineNum = 21;BA.debugLine="IME.Initialize(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize("");
 //BA.debugLineNum = 22;BA.debugLine="Dim jo As JavaObject = TextField1";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_textfield1.getObject()));
 //BA.debugLineNum = 23;BA.debugLine="jo.RunMethod(\"setImeOptions\", Array(Bit.Or(335544";
_jo.RunMethod("setImeOptions",new Object[]{(Object)(__c.Bit.Or((int) (33554432),(int) (6)))});
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(String _new) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Private Sub IsValid(New As String) As Boolean";
 //BA.debugLineNum = 91;BA.debugLine="Return RegexPattern = \"\" Or Regex.IsMatch(RegexPa";
if (true) return (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0).equals("") || __c.Regex.IsMatch(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_new);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return false;
}
public void  _show(com.testdb.b4xdialog _dialog) throws Exception{
ResumableSub_Show rsub = new ResumableSub_Show(this,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(com.testdb.b4xinputtemplate parent,com.testdb.b4xdialog _dialog) {
this.parent = parent;
this._dialog = _dialog;
}
com.testdb.b4xinputtemplate parent;
com.testdb.b4xdialog _dialog;
anywheresoftware.b4a.objects.EditTextWrapper _tf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 108;BA.debugLine="xDialog = Dialog";
parent._vvvvvvvvvvvvvvvvvvvvvv3 = _dialog;
 //BA.debugLineNum = 109;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
parent._vvvvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*boolean*/  = parent._vvvvvvvvvvvvv2.getIsB4A() || parent._vvvvvvvvvvvvv2.getIsB4i();
 //BA.debugLineNum = 110;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,this,(int) (20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 111;BA.debugLine="TextField1.Text = Text";
parent._textfield1.setText(BA.ObjectToCharSequence(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3));
 //BA.debugLineNum = 112;BA.debugLine="Validate(Text)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 113;BA.debugLine="TextField1.RequestFocus";
parent._textfield1.RequestFocus();
 //BA.debugLineNum = 115;BA.debugLine="Dim tf As EditText = TextField1";
_tf = new anywheresoftware.b4a.objects.EditTextWrapper();
_tf.setObject((android.widget.EditText)(parent._textfield1.getObject()));
 //BA.debugLineNum = 116;BA.debugLine="tf.SelectAll";
_tf.SelectAll();
 //BA.debugLineNum = 117;BA.debugLine="IME.ShowKeyboard(TextField1)";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.ShowKeyboard((android.view.View)(parent._textfield1.getObject()));
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _textfield1_action() throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Private Sub TextField1_Action";
 //BA.debugLineNum = 95;BA.debugLine="TextField1_EnterPressed";
_textfield1_enterpressed();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_enterpressed() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Private Sub TextField1_EnterPressed";
 //BA.debugLineNum = 99;BA.debugLine="If IsValid(TextField1.Text) Then xDialog.Close(xu";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(_textfield1.getText())) { 
_vvvvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*boolean*/ (_vvvvvvvvvvvvv2.DialogResponse_Positive);};
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _textfield1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Private Sub TextField1_TextChanged (Old As String,";
 //BA.debugLineNum = 74;BA.debugLine="Validate (New)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_new);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(String _new) throws Exception{
int _bordercolor = 0;
boolean _enabled = false;
 //BA.debugLineNum = 77;BA.debugLine="Private Sub Validate (New As String)";
 //BA.debugLineNum = 78;BA.debugLine="Dim BorderColor As Int = xui.Color_White";
_bordercolor = _vvvvvvvvvvvvv2.Color_White;
 //BA.debugLineNum = 79;BA.debugLine="Dim enabled As Boolean = True";
_enabled = __c.True;
 //BA.debugLineNum = 80;BA.debugLine="If IsValid(New) = False Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(_new)==__c.False) { 
 //BA.debugLineNum = 81;BA.debugLine="If New.Length > 0 Then";
if (_new.length()>0) { 
 //BA.debugLineNum = 82;BA.debugLine="BorderColor = xui.Color_Red";
_bordercolor = _vvvvvvvvvvvvv2.Color_Red;
 };
 //BA.debugLineNum = 84;BA.debugLine="enabled = False";
_enabled = __c.False;
 };
 //BA.debugLineNum = 86;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
_vvvvvvvvvvvvvvvvvvvvvv3._vvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*String*/ (_vvvvvvvvvvvvv2.DialogResponse_Positive,_enabled);
 //BA.debugLineNum = 87;BA.debugLine="TextField1.SetColorAndBorder(xui.Color_Transparen";
_textfield1.SetColorAndBorder(_vvvvvvvvvvvvv2.Color_Transparent,__c.DipToCurrent((int) (1)),_bordercolor,__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "DIALOGCLOSED"))
	return _dialogclosed(((Number)args[0]).intValue());
if (BA.fastSubCompare(sub, "GETPANEL"))
	return _getpanel((com.testdb.b4xdialog) args[0]);
return BA.SubDelegator.SubNotFound;
}
}

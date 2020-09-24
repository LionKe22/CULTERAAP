package com.testdb;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcombobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.testdb.b4xcombobox");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.testdb.b4xcombobox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvvvvvvvvvvv7 = "";
public Object _vvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvvvvvvvvvvvv2 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public anywheresoftware.b4a.objects.SpinnerWrapper _vvvvvvvvvvvvvvvvvvvvvvv3 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public Object _vvvvvvv4 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvv6 = "";
public b4a.example.dateutils _vvvvvvv5 = null;
public com.testdb.main _vvvvvvv6 = null;
public com.testdb.starter _vvvvvvv7 = null;
public com.testdb.httputils2service _vvvvvvv0 = null;
public com.testdb.b4xcollections _vvvvvvvv1 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 56;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
_vvvvvvvvvvvvv1.GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvv0 = new Object();
 //BA.debugLineNum = 5;BA.debugLine="Public mBase As B4XView";
_vvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI 'ignore";
_vvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 7;BA.debugLine="Private LastSelectedIndex As Int";
_vvvvvvvvvvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 11;BA.debugLine="Public cmbBox As Spinner";
_vvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Public DelayBeforeChangeEvent As Int";
_vvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private DelayIndex As Int";
_vvvvvvvvvvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
_vvvvvvv4 = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Public B4iCancelButton As String = \"Cancel\"";
_vvvvvvvvvvvvvvvvvvvvvvv6 = "Cancel";
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _cmbbox_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Private Sub CmbBox_ItemClick (Position As Int, Val";
 //BA.debugLineNum = 126;BA.debugLine="RaiseEvent";
_vvvvvvvvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
 //BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 33;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvv1.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvv4 = _vvvvvvvvvvvvv1.getTag();
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvvvvvvvvvvv1.setTag(this);
 //BA.debugLineNum = 35;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl.setObject((java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 42;BA.debugLine="cmbBox.Initialize(\"cmbBox\")";
_vvvvvvvvvvvvvvvvvvvvvvv3.Initialize(ba,"cmbBox");
 //BA.debugLineNum = 43;BA.debugLine="cmbBox.TextSize = xlbl.TextSize";
_vvvvvvvvvvvvvvvvvvvvvvv3.setTextSize(_xlbl.getTextSize());
 //BA.debugLineNum = 44;BA.debugLine="mBase.AddView(cmbBox, 0, 0, mBase.Width, mBase.He";
_vvvvvvvvvvvvv1.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvv3.getObject()),(int) (0),(int) (0),_vvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvv1.getHeight());
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvv5(int _index) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub GetItem(Index As Int) As String";
 //BA.debugLineNum = 101;BA.debugLine="Return cmbBox.GetItem(Index)";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvv3.GetItem(_index);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public int  _getvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub getSelectedIndex As Int";
 //BA.debugLineNum = 77;BA.debugLine="Return cmbBox.SelectedIndex";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvv3.getSelectedIndex();
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvv7 = _eventname;
 //BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvv0 = _callback;
 //BA.debugLineNum = 27;BA.debugLine="LastSelectedIndex = -1";
_vvvvvvvvvvvvvvvvvvvvvvv2 = (int) (-1);
 //BA.debugLineNum = 28;BA.debugLine="If xui.IsB4J Then DelayBeforeChangeEvent = 500";
if (_vvvvvvvvvvvvv2.getIsB4J()) { 
_vvvvvvvvvvvvvvvvvvvvvvv4 = (int) (500);};
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
ResumableSub_RaiseEvent rsub = new ResumableSub_RaiseEvent(this);
rsub.resume(ba, null);
}
public static class ResumableSub_RaiseEvent extends BA.ResumableSub {
public ResumableSub_RaiseEvent(com.testdb.b4xcombobox parent) {
this.parent = parent;
}
com.testdb.b4xcombobox parent;
int _index = 0;
int _myindex = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 108;BA.debugLine="Dim index As Int = getSelectedIndex";
_index = parent._getvvvvvvvvvvvvvvvvvvvvvvv1();
 //BA.debugLineNum = 109;BA.debugLine="If LastSelectedIndex = index Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._vvvvvvvvvvvvvvvvvvvvvvv2==_index) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 110;BA.debugLine="If DelayBeforeChangeEvent > 0 Then";
if (true) break;

case 7:
//if
this.state = 16;
if (parent._vvvvvvvvvvvvvvvvvvvvvvv4>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 111;BA.debugLine="DelayIndex = DelayIndex + 1";
parent._vvvvvvvvvvvvvvvvvvvvvvv5 = (int) (parent._vvvvvvvvvvvvvvvvvvvvvvv5+1);
 //BA.debugLineNum = 112;BA.debugLine="Dim MyIndex As Int = DelayIndex";
_myindex = parent._vvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 113;BA.debugLine="Sleep(DelayBeforeChangeEvent)";
parent.__c.Sleep(ba,this,parent._vvvvvvvvvvvvvvvvvvvvvvv4);
this.state = 17;
return;
case 17:
//C
this.state = 10;
;
 //BA.debugLineNum = 114;BA.debugLine="If MyIndex <> DelayIndex Then Return";
if (true) break;

case 10:
//if
this.state = 15;
if (_myindex!=parent._vvvvvvvvvvvvvvvvvvvvvvv5) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 116;BA.debugLine="LastSelectedIndex = index";
parent._vvvvvvvvvvvvvvvvvvvvvvv2 = _index;
 //BA.debugLineNum = 117;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedIndexC";
parent.__c.CallSubNew2(ba,parent._vvvvvvvvvvvv0,parent._vvvvvvvvvvvv7+"_SelectedIndexChanged",(Object)(_index));
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _vvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub SetItems(Items As List)";
 //BA.debugLineNum = 64;BA.debugLine="cmbBox.Clear";
_vvvvvvvvvvvvvvvvvvvvvvv3.Clear();
 //BA.debugLineNum = 65;BA.debugLine="cmbBox.AddAll(Items)";
_vvvvvvvvvvvvvvvvvvvvvvv3.AddAll(_items);
 //BA.debugLineNum = 72;BA.debugLine="If Items.Size > 0 Then setSelectedIndex(0)";
if (_items.getSize()>0) { 
_setvvvvvvvvvvvvvvvvvvvvvvv1((int) (0));};
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvv1(int _i) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub setSelectedIndex(i As Int)";
 //BA.debugLineNum = 84;BA.debugLine="LastSelectedIndex = i";
_vvvvvvvvvvvvvvvvvvvvvvv2 = _i;
 //BA.debugLineNum = 86;BA.debugLine="cmbBox.SelectedIndex = i";
_vvvvvvvvvvvvvvvvvvvvvvv3.setSelectedIndex(_i);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

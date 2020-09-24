package com.testdb;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xorderedmap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.testdb.b4xorderedmap");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.testdb.b4xorderedmap.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvv5 = null;
public b4a.example.dateutils _vvvvvvv5 = null;
public com.testdb.main _vvvvvvv6 = null;
public com.testdb.starter _vvvvvvv7 = null;
public com.testdb.httputils2service _vvvvvvv0 = null;
public com.testdb.b4xcollections _vvvvvvvv1 = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private map As Map";
_vvvvvvvvvvv4 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 3;BA.debugLine="Private list As List";
_vvvvvvvvvvv5 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvv2() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 27;BA.debugLine="list.Clear";
_vvvvvvvvvvv5.Clear();
 //BA.debugLineNum = 28;BA.debugLine="map.Clear";
_vvvvvvvvvvv4.Clear();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvv7(Object _key) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub ContainsKey (Key As Object) As Boolean";
 //BA.debugLineNum = 47;BA.debugLine="Return map.ContainsKey(Key)";
if (true) return _vvvvvvvvvvv4.ContainsKey(_key);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return false;
}
public Object  _vvvvvvvv3(Object _key) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Get (Key As Object) As Object";
 //BA.debugLineNum = 38;BA.debugLine="Return map.Get(Key)";
if (true) return _vvvvvvvvvvv4.Get(_key);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public Object  _vvvvvvvvvv0(Object _key,Object _defaultvalue) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub GetDefault (Key As Object, DefaultValue";
 //BA.debugLineNum = 43;BA.debugLine="Return map.GetDefault(Key, DefaultValue)";
if (true) return _vvvvvvvvvvv4.GetDefault(_key,_defaultvalue);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub getKeys As List";
 //BA.debugLineNum = 33;BA.debugLine="Return list";
if (true) return _vvvvvvvvvvv5;
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public int  _getvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 51;BA.debugLine="Return map.Size";
if (true) return _vvvvvvvvvvv4.getSize();
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 7;BA.debugLine="map.Initialize";
_vvvvvvvvvvv4.Initialize();
 //BA.debugLineNum = 8;BA.debugLine="list.Initialize";
_vvvvvvvvvvv5.Initialize();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvv2(Object _key,Object _value) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Put (Key As Object, Value As Object)";
 //BA.debugLineNum = 13;BA.debugLine="If map.ContainsKey(Key) = False Then";
if (_vvvvvvvvvvv4.ContainsKey(_key)==__c.False) { 
 //BA.debugLineNum = 14;BA.debugLine="list.Add(Key)";
_vvvvvvvvvvv5.Add(_key);
 };
 //BA.debugLineNum = 16;BA.debugLine="map.Put(Key, Value)";
_vvvvvvvvvvv4.Put(_key,_value);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvv0(Object _key) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Remove (Key As Object)";
 //BA.debugLineNum = 21;BA.debugLine="If map.ContainsKey(Key) = False Then Return";
if (_vvvvvvvvvvv4.ContainsKey(_key)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 22;BA.debugLine="list.RemoveAt(list.IndexOf(Key))";
_vvvvvvvvvvv5.RemoveAt(_vvvvvvvvvvv5.IndexOf(_key));
 //BA.debugLineNum = 23;BA.debugLine="map.Remove(Key)";
_vvvvvvvvvvv4.Remove(_key);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}

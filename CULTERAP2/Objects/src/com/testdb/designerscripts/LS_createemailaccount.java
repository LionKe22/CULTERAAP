package com.testdb.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_createemailaccount{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleRate(0.3)"[createemailaccount/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3d);
//BA.debugLineNum = 3;BA.debugLine="AutoScaleAll"[createemailaccount/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="Panel1.Top = 0"[createemailaccount/General script]
views.get("panel1").vw.setTop((int)(0d));
//BA.debugLineNum = 5;BA.debugLine="Panel1.Left = 0"[createemailaccount/General script]
views.get("panel1").vw.setLeft((int)(0d));
//BA.debugLineNum = 6;BA.debugLine="Panel1.Width = 100%x"[createemailaccount/General script]
views.get("panel1").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 7;BA.debugLine="Panel1.Height = 100%y"[createemailaccount/General script]
views.get("panel1").vw.setHeight((int)((100d / 100 * height)));
//BA.debugLineNum = 9;BA.debugLine="PanEmailLogin.Left = (100%x /2)- (PanEmailLogin.Width / 2)"[createemailaccount/General script]
views.get("panemaillogin").vw.setLeft((int)(((100d / 100 * width)/2d)-((views.get("panemaillogin").vw.getWidth())/2d)));
//BA.debugLineNum = 10;BA.debugLine="PanEmailLogin.Top = (100%y /2) - (PanEmailLogin.Height / 2) - 100"[createemailaccount/General script]
views.get("panemaillogin").vw.setTop((int)(((100d / 100 * height)/2d)-((views.get("panemaillogin").vw.getHeight())/2d)-100d));
//BA.debugLineNum = 11;BA.debugLine="ImageView1.Left = (PanEmailLogin.Width - ImageView1.Width)/2"[createemailaccount/General script]
views.get("imageview1").vw.setLeft((int)(((views.get("panemaillogin").vw.getWidth())-(views.get("imageview1").vw.getWidth()))/2d));
//BA.debugLineNum = 13;BA.debugLine="fet_regemail.Top = ImageView1.Top + ImageView1.Height +10"[createemailaccount/General script]
views.get("fet_regemail").vw.setTop((int)((views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())+10d));
//BA.debugLineNum = 14;BA.debugLine="fet_regemail.Left = ImageView1.Width - ImageView1.Width+10"[createemailaccount/General script]
views.get("fet_regemail").vw.setLeft((int)((views.get("imageview1").vw.getWidth())-(views.get("imageview1").vw.getWidth())+10d));
//BA.debugLineNum = 15;BA.debugLine="fet_regemail.Width= PanEmailLogin.Width-20"[createemailaccount/General script]
views.get("fet_regemail").vw.setWidth((int)((views.get("panemaillogin").vw.getWidth())-20d));
//BA.debugLineNum = 17;BA.debugLine="Label2.Top = ImageView1.Top + ImageView1.Height +10"[createemailaccount/General script]
views.get("label2").vw.setTop((int)((views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())+10d));
//BA.debugLineNum = 18;BA.debugLine="Label2.Left = ImageView1.Width - ImageView1.Width"[createemailaccount/General script]
views.get("label2").vw.setLeft((int)((views.get("imageview1").vw.getWidth())-(views.get("imageview1").vw.getWidth())));
//BA.debugLineNum = 19;BA.debugLine="Label2.Width= PanEmailLogin.Width"[createemailaccount/General script]
views.get("label2").vw.setWidth((int)((views.get("panemaillogin").vw.getWidth())));
//BA.debugLineNum = 21;BA.debugLine="fet_regemailpassword.Top = Label2.Top + Label2.Height + 10"[createemailaccount/General script]
views.get("fet_regemailpassword").vw.setTop((int)((views.get("label2").vw.getTop())+(views.get("label2").vw.getHeight())+10d));
//BA.debugLineNum = 22;BA.debugLine="fet_regemailpassword.Left = ImageView1.Width - ImageView1.Width+10"[createemailaccount/General script]
views.get("fet_regemailpassword").vw.setLeft((int)((views.get("imageview1").vw.getWidth())-(views.get("imageview1").vw.getWidth())+10d));
//BA.debugLineNum = 23;BA.debugLine="fet_regemailpassword.Width= PanEmailLogin.Width -20"[createemailaccount/General script]
views.get("fet_regemailpassword").vw.setWidth((int)((views.get("panemaillogin").vw.getWidth())-20d));
//BA.debugLineNum = 25;BA.debugLine="Label3.Top = Label2.Top + Label2.Height + 10"[createemailaccount/General script]
views.get("label3").vw.setTop((int)((views.get("label2").vw.getTop())+(views.get("label2").vw.getHeight())+10d));
//BA.debugLineNum = 26;BA.debugLine="Label3.Left = ImageView1.Width - ImageView1.Width"[createemailaccount/General script]
views.get("label3").vw.setLeft((int)((views.get("imageview1").vw.getWidth())-(views.get("imageview1").vw.getWidth())));
//BA.debugLineNum = 27;BA.debugLine="Label3.Width= PanEmailLogin.Width"[createemailaccount/General script]
views.get("label3").vw.setWidth((int)((views.get("panemaillogin").vw.getWidth())));
//BA.debugLineNum = 29;BA.debugLine="fet_regemailpassword2.Top = Label3.Top + Label3.Height + 10"[createemailaccount/General script]
views.get("fet_regemailpassword2").vw.setTop((int)((views.get("label3").vw.getTop())+(views.get("label3").vw.getHeight())+10d));
//BA.debugLineNum = 30;BA.debugLine="fet_regemailpassword2.Left = ImageView1.Width - ImageView1.Width+10"[createemailaccount/General script]
views.get("fet_regemailpassword2").vw.setLeft((int)((views.get("imageview1").vw.getWidth())-(views.get("imageview1").vw.getWidth())+10d));
//BA.debugLineNum = 31;BA.debugLine="fet_regemailpassword2.Width= PanEmailLogin.Width -20"[createemailaccount/General script]
views.get("fet_regemailpassword2").vw.setWidth((int)((views.get("panemaillogin").vw.getWidth())-20d));
//BA.debugLineNum = 33;BA.debugLine="Label4.Top = Label3.Top + Label3.Height + 10"[createemailaccount/General script]
views.get("label4").vw.setTop((int)((views.get("label3").vw.getTop())+(views.get("label3").vw.getHeight())+10d));
//BA.debugLineNum = 34;BA.debugLine="Label4.Left = ImageView1.Width - ImageView1.Width"[createemailaccount/General script]
views.get("label4").vw.setLeft((int)((views.get("imageview1").vw.getWidth())-(views.get("imageview1").vw.getWidth())));
//BA.debugLineNum = 35;BA.debugLine="Label4.Width= PanEmailLogin.Width"[createemailaccount/General script]
views.get("label4").vw.setWidth((int)((views.get("panemaillogin").vw.getWidth())));

}
}
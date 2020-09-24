package com.testdb.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_emaillogin{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3d);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((100d / 100 * width)));
views.get("panel1").vw.setHeight((int)((100d / 100 * height)));
views.get("panemaillogin").vw.setLeft((int)(((100d / 100 * width)/2d)-((views.get("panemaillogin").vw.getWidth())/2d)));
views.get("panemaillogin").vw.setTop((int)(((100d / 100 * height)/2d)-((views.get("panemaillogin").vw.getHeight())/2d)-100d));
views.get("imageview1").vw.setLeft((int)(((views.get("panemaillogin").vw.getWidth())-(views.get("imageview1").vw.getWidth()))/2d));
views.get("fet_email").vw.setTop((int)((views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())+10d));
views.get("label2").vw.setTop((int)((views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())+10d));
views.get("label2").vw.setLeft((int)((views.get("imageview1").vw.getWidth())-(views.get("imageview1").vw.getWidth())));
views.get("label2").vw.setWidth((int)((views.get("panemaillogin").vw.getWidth())));
views.get("fet_emailpassword").vw.setTop((int)((views.get("fet_email").vw.getTop())+(views.get("fet_email").vw.getHeight())+10d));
views.get("label3").vw.setTop((int)((views.get("fet_email").vw.getTop())+(views.get("fet_email").vw.getHeight())+10d));
views.get("label3").vw.setLeft((int)((views.get("imageview1").vw.getWidth())-(views.get("imageview1").vw.getWidth())));
views.get("label3").vw.setWidth((int)((views.get("panemaillogin").vw.getWidth())));
views.get("b_emailsignin").vw.setTop((int)((views.get("fet_emailpassword").vw.getTop())+(views.get("fet_emailpassword").vw.getHeight())+50d));
views.get("b_emailsignin").vw.setLeft((int)((((views.get("panemaillogin").vw.getWidth())-(views.get("b_emailsignin").vw.getWidth()))/2d)));
views.get("panemaillogin").vw.setHeight((int)((views.get("b_emailsignin").vw.getTop())+(views.get("b_emailsignin").vw.getHeight())+(40d * scale)));
views.get("lblresetpassword").vw.setTop((int)((views.get("panemaillogin").vw.getHeight())-((views.get("lblresetpassword").vw.getHeight())+10d)));
views.get("lblregister").vw.setLeft((int)(0d));
views.get("lblregister").vw.setTop((int)((views.get("panemaillogin").vw.getTop())+(views.get("panemaillogin").vw.getHeight())+20d));
views.get("lblregister").vw.setWidth((int)((100d / 100 * width)));
views.get("lblresetpassword").vw.setTop((int)((views.get("panemaillogin").vw.getHeight())-(views.get("lblresetpassword").vw.getHeight())));

}
}
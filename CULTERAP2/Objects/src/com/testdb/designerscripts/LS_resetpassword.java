package com.testdb.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_resetpassword{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3d);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((100d / 100 * width)));
views.get("panel1").vw.setHeight((int)((100d / 100 * height)));
views.get("panemailreset").vw.setLeft((int)(((100d / 100 * width)/2d)-((views.get("panemailreset").vw.getWidth())/2d)));
views.get("panemailreset").vw.setTop((int)(((100d / 100 * height)/2d)-((views.get("panemailreset").vw.getHeight())/2d)-100d));
views.get("imageview1").vw.setLeft((int)(((views.get("panemailreset").vw.getWidth())-(views.get("imageview1").vw.getWidth()))/2d));
views.get("label2").vw.setTop((int)((views.get("imageview1").vw.getTop())+(views.get("imageview1").vw.getHeight())+160d));
views.get("label2").vw.setLeft((int)((views.get("imageview1").vw.getWidth())-(views.get("imageview1").vw.getWidth())));
views.get("label2").vw.setWidth((int)((views.get("panemailreset").vw.getWidth())));

}
}
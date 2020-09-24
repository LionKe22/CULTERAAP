package com.testdb.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_pantbtn3{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.1d);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((110d / 100 * width)));
views.get("panel1").vw.setHeight((int)((110d / 100 * height)));

}
}
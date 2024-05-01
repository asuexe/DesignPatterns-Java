package com.FWDP;

import java.util.HashMap;

public class ShapeFactory {

   private static final HashMap<String, circle> circleMap = new HashMap<String, circle>();

   public static shape getCircle(String color) {
      circle circle = (circle)circleMap.get(color);

      if(circle == null) {
         circle = new circle(color);
         circleMap.put(color, circle);
         System.out.println("Creating circle of color : " + color);
      }
      return circle;
   }
}
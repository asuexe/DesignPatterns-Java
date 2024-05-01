package com.ADP2;

//Adaptee implementation
class LegacyRectangle implements Legacy {
public void draw(int x, int y, int w, int h) {
   System.out.println("Drawing rectangle with legacy interface: x=" + x + ", y=" + y + ", w=" + w + ", h=" + h);
}
}

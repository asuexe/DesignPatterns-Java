package com.ADP2;

//Adapter class
class RectangleAdapter implements Rectangle {
private Legacy legacyRectangle;

public RectangleAdapter(Legacy legacyRectangle) {
   this.legacyRectangle = legacyRectangle;
}

public void draw(int x1, int y1, int x2, int y2) {
   int x = Math.min(x1, x2);
   int y = Math.min(y1, y2);
   int w = Math.abs(x2 - x1);
   int h = Math.abs(y2 - y1);
   legacyRectangle.draw(x, y, w, h);
}
}


package com.ADP2;
public class Exe {
public static void main(String[] args) {
   Legacy LR = new LegacyRectangle();
   Rectangle rectangle = new RectangleAdapter(LR);
   rectangle.draw(10, 20, 30, 40);
}
}

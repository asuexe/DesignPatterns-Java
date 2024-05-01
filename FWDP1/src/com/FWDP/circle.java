package com.FWDP;

public class circle implements shape {
	 private String color;
	   private int x;
	   private int y;
	   private int r;

	   public circle(String color){
	      this.color = color;		
	   }

	   public void setX(int x) {
	      this.x = x;
	   }

	   public void setY(int y) {
	      this.y = y;
	   }

	   public void setRadius(int radius) {
	      this.r = radius;
	   }

	@Override
		public void draw() {
		 System.out.println("drawing circle of Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + r);
		
	}

	 
}

package com.x;

public class distance {
	int feet;
	int inch;
	distance(int feet , int inch){
		this.feet=feet;
		this.inch=inch;
		
	}
	
	static String mesure(distance d1,distance d2) {
		int carry = (d1.inch+d2.inch)/11;
		int finalfeet = d1.feet+d2.feet+carry;
		int finalinch = (d1.inch+d2.inch)-(11*carry);	
		return finalfeet +"'"+finalinch+"      carry:"+carry;
	}
	public static void main(String args[]) {
		distance d1 = new distance(4,10);
		distance d2 = new distance(6,11);
//		distance d3 = null;
		System.out.println(mesure(d1, d2));
		
	}

}

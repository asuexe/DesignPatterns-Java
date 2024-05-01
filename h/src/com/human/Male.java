package com.human;
class Male implements Human {
	   @Override
	   public void talk() {
	      System.out.println("Male is talking");
	   }
	   @Override
	   public void walk() {
	      System.out.println("Male is walking");
	   }
	}
package com.human;
class HumanFactory {
	   public static Human createHuman(String type) {
	      if (type.equalsIgnoreCase("Male")) {
	         return new Male();
	      } else if (type.equalsIgnoreCase("Female")) {
	         return new Female();
	      }
	      return null;
	   }
	}
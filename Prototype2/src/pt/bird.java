package pt;

abstract class Bird implements Cloneable {
	   protected String name;
	   abstract void fly();
	   public Object clone() {
	      Object clone = null;
	      try {
	         clone = super.clone();
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      return clone;
	   }
	}

	




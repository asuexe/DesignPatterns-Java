package pt;
class Sparrow extends Bird {
	   public Sparrow() {
	      name = "Sparrow";
	   }
	   @Override
	   void fly() {
	      System.out.println(name +" is flying");
	   }
	}
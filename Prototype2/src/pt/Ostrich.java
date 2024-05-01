package pt;
class Ostrich extends Bird {
	   public Ostrich() {
	      name = "Ostrich";
	   }
	   @Override
	   void fly() {
	      System.out.println(name +" is running");
	   }
	}
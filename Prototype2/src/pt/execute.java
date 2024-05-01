package pt;
class execute {
	   public static void main(String[] args) {
	      Sparrow sparrow = new Sparrow();
	      Ostrich ostrich = new Ostrich();
	      Sparrow SC = (Sparrow) sparrow.clone();
	      Ostrich OC = (Ostrich) ostrich.clone();
	      System.out.println(sparrow.name + " & " + SC.name + " are same object: " + (sparrow == SC));
	      System.out.println(ostrich.name + " & " + OC.name + " are same object: " + (ostrich == OC));
	      SC.fly();
	      OC.fly();
	   }
	}

package SDP2;
class Manager {
	   private static Manager i = new Manager();;
	   private Manager() {}
	   private String Student;
	   private int ID;
	   public static Manager getInstance() {
	      return i;
	   }
	   public void message() {
		   System.out.println("Hi I am your manager<3");
	   }
	   public String setName(String Student) {
		   return this.Student=Student;
	   }
	   public String getName() {
		   return this.Student;
	   }
	   public int setID(int ID) {
		   return this.ID=ID;
	   }
	   public int getID() {
		   return this.ID;
	   }
	}

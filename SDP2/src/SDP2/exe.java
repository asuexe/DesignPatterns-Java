package SDP2;

public class exe {
	   public static void main(String[] args) {
	      Manager CSE = Manager.getInstance(); //1st refrance
	      Manager ICT = Manager.getInstance();// refrance
	      String a = CSE.setName("Student1");
	      String b = ICT.setName("Student2");
	      int c = CSE.setID(101);
	      int d = ICT.setID(201);
	      System.out.println(a);
	      System.out.println(b);
	      System.out.println(c);
	      System.out.println(d);
	      System.out.println("CSE Student name is: " + CSE.getName()+"\nStudent ID is: "+ CSE.getID());
	      System.out.println("Address1 is: "+CSE.hashCode());
	      System.out.println("Address2 is: "+ICT.hashCode());
	 }
}

package SDP;
public class Singleton {
	private static Singleton s = new Singleton();
	public int a,b,c,d,e;
	private Singleton() {
		System.out.println("Object created...");
	}
	public static Singleton getInstance() {
		return s;
	}
	public void Message() {
	      System.out.println("Hello World!");
	   }
	public int sum(int a,int b) {
		return a+b;
	}
	public int sum(int c,int d,int e) {
		return c+d+e;
	}
	   public static void main(String[] args) {
	      Singleton s1 = Singleton.getInstance();
	      Singleton s2 = Singleton.getInstance();
	      Singleton s3 = Singleton.getInstance();
	      int f = s2.sum(1,2);
	      int g = s3.sum(1,2,3);
	      System.out.println("Address :- "+s1);
	      System.out.println("Address :- "+s2);
	      System.out.println("Address :- "+s3);
	      s1.Message();
	      System.out.println(f);
	      System.out.println(g);
	   }
}



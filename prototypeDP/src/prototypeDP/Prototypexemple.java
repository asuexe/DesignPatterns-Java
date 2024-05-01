package prototypeDP;

import java.util.List;

public class Prototypexemple {
	public static void main(String[] args) throws CloneNotSupportedException {
		vehicle v = new vehicle();
		v.insertData();
		vehicle a = (vehicle)v.clone();
		List<String> l = a.GetVlist();
		l.add("car 6");
		System.out.println(((vehicle) v).GetVlist());
		System.out.println(l);
		a.GetVlist().remove("car 1");
		System.out.println(((vehicle) v).GetVlist());
		System.out.println(a.GetVlist());
	}

}

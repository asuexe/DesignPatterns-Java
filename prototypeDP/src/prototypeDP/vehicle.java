package prototypeDP;

import java.util.*;

public class vehicle implements Cloneable {
	private List<String> Vlist;
	public vehicle() {
		this.Vlist = new ArrayList<String>(); 
	}
	public vehicle(List<String> list) {
		this.Vlist = list;
	}
	public void insertData() {
		Vlist.add("car 1");
		Vlist.add("car 2");
		Vlist.add("car 3");
		Vlist.add("car 4");
		Vlist.add("car 5");
	}
	public List<String> GetVlist(){
		return this.Vlist;	
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> Tlist = new ArrayList<String>();
		for(String s : this.GetVlist()) {
			Tlist.add(s);	
		}
		return new vehicle(Tlist);
}
}
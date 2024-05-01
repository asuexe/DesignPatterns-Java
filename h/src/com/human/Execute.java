package com.human;

public class Execute {
	public static void main(String[] args) {
		Human m = HumanFactory.createHuman("Male");
		//Human f = HumanFactory.createHuman("Female");
		m.talk();
		m.walk();
		//f.talk();
		//f.walk();
	}
}

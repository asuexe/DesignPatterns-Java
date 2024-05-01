package com.EX7;

public class Exe {

	public static void main(String[] args) {
		Truck T1 = (Truck)TransportFactory.getTruck("123"); 
		T1.setLocation("Alaska");
		T1.getLocation();
		T1.Deliever();

	}

}

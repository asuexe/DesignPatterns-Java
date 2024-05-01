package com.EX7;

import java.util.HashMap;

public class TransportFactory {
	private static final HashMap<String , Truck> List = new HashMap<String ,Truck>();
	public static Truck getTruck(String TID) {
		Truck T1 = List.get(TID);
		if(T1==null) {
			T1 = new Truck(TID);
			List.put(TID, T1);
			System.out.println("Allocating truck with ID "+TID);
		}
		return T1;
			
	}
	

}
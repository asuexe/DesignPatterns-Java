package com.EX7;

public class Truck implements Transport {
	private String TID;
	private String Location;
	
	
	Truck(String TID){
		this.TID=TID;
	}
	public void setLocation(String Location) {
		this.Location=Location;
	}
	public String getLocation() {
		return Location;
	}
	public void ShortestPath() {
		
	}
	
	@Override
	public void Deliever() {
		System.out.println("Truck with id no :"+ TID+ "is Delivering at "+ Location);
		
	}
}

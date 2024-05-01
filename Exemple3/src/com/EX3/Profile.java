package com.EX3;


import java.util.HashMap;

import java.util.Map;

public class Profile implements Instagram {
	
	String Username;
	private Map<String , String> Following;
	public Profile(String Username) {
		this.Username=Username;
		Following = new HashMap<String, String>();
	}
	public void follow(String key ,String User) {
		
		
	}
	@Override
	public void unfollow() {
	
	}

	@Override
	public void message(String User) {
		
	}
	@Override
	public void follow() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void message() {
		// TODO Auto-generated method stub
		
	}
	

}

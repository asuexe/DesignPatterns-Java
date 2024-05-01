package com.EX6;

import java.util.List;

public class Network {
	private List<User> users;
	Network(List<User> users){
		this.users=users;
	}
	public List<User> getUsers(){
		return users;
	}

}

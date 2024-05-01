package com.EX6;

import java.util.ArrayList;
import java.util.List;

public class NetworkBuilder {
	private List<User> users;
	NetworkBuilder(){
		this.users = new ArrayList<User>();
	}
	public NetworkBuilder getUser(User user) {
		users.add(user);
		return this;
	}
	public Network Build() {
		return new Network(users);
	}
	

}

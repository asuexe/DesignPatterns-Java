package com.EX6;

import java.util.ArrayList;

import com.EX6.User.Builder;

public class Exe {

	public static void main(String[] args) {
		User U1 = new Builder("Vivek", "VIvek123", "Email1")
				.FullName("Full Name 1")
				.post(new ArrayList<>())
				.Followers(new ArrayList<>())
				.following(new ArrayList<>())
				.build();
		System.out.println(U1);
	}

}

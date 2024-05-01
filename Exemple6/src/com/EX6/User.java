package com.EX6;

import java.util.List;



public class User { 
	private String Username;
	private String Password;
	private String Email;
	private String FullName;
	private List<Post> Posts;
	private List<User> Followers;
	private List<User> Following;
	
	User(String Username,String Password,String Email,String FullName,List<Post> Posts,List<User> Followers,List<User> Following){
		this.Username=Username;
		this.Password=Password;
		this.Email=Email;
		this.FullName=FullName;
		this.Posts=Posts;
		this.Followers=Followers;
		this.Following=Following;	
	}
	public String getUsername() {
		return Username;
	}
	public String getPassword() {
		return Password;
	}
	public String getEmail() {
		return Email;
	}
	public String getFullName() {
		return FullName;
	}
	public List<Post> getPosts() {
		return Posts;
	}
	public List<User> getFollowers(){
		return Followers;
	}
	public List<User> getFollowing(){
		return Following;
	}
	public String toString() {
		return "Profile:"
				+ "\nUsername: "+Username
				+ "\nPassword: "+Password
				+ "\nEmail :"+Email;
	}
	 public static class Builder {
	        
	        private String username;
	        private String password;
	        private String email;
	        private String fullName;
	        private List<Post> posts;
	        private List<User> followers;
	        private List<User> following;
	        
	        public Builder(String username, String password, String email) {
	            this.username = username;
	            this.password = password;
	            this.email = email;
	        }
	        public Builder FullName(String FullName) {
	        	this.fullName=FullName;
	        	return this;
	        }
	        public Builder post(List<Post> posts) {
	        	this.posts=posts;
	        	return this;
	        }
	        public Builder Followers(List<User> followers) {
	        	this.followers=followers;
	        	return this;
	        }
	        public Builder following(List<User> following) {
	            this.following = following;
	            return this;
	        }
	        
	        public User build() {
	            return new User(username, password, email, fullName, posts, followers, following);
	        }
	  }
}

package com.EX6;

public class Post {
	private String content;
	private String Author;
	
	Post(String content,String Author){
		this.Author=Author;
		this.content=content;
	}
	public String getAuthor() {
		return Author;
	}
	public String getcontent() {
		return content;
	}

}

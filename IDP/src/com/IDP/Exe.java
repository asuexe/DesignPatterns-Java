package com.IDP;

public class Exe {
	
	   public static void main(String[] args) {
	      NameRepository a = new NameRepository();

	      for(Iterator i = a.getIterator(); i.hasNext();){
	         String name = (String)i.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
	}
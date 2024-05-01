package com.IDP;

public class NameRepository implements Container {
	   public String names[] = {"xyz" , "ABC"};

	   @Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int i;

	      @Override
	      public boolean hasNext() {
	      
	         if(i< names.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[i++];
	         }
	         return null;
	      }		
	   }
	}
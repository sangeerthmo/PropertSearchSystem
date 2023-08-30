package com.amdocs.PropertySearchSystem.Exceptions;

public class IdNotFoundException extends Exception {
	
	
	   	static String notFound = "Id not present";
	    public IdNotFoundException(){
	        super(notFound);
	    }

	

}

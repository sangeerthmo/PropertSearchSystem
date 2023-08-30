package com.amdocs.PropertySearchSystem.main;

import java.util.Scanner;

public class MainUserClass {
	
public int list() {
		
	 {
		 System.out.println("Enter the choice \n");
		System.out.println("1. Add new Property");
		System.out.println("2. Delete Property");
		System.out.println("3. Update Property");
		System.out.println("4. Find by City");
		System.out.println("5. View All");
		System.out.println("6. Find by Cost");
		System.out.println("7. Find no.of rooms and city");
		System.out.println("8. Exit");
		
		Scanner sc = new Scanner(System.in);
		int ret=0;
		try{ret = sc.nextInt();}
		catch(Exception c) {
			System.out.println("Invalid Option");
		}
		
		return ret;
	}
	
}

}

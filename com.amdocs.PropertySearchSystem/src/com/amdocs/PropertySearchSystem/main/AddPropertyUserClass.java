package com.amdocs.PropertySearchSystem.main;

import java.util.Scanner;

import com.amdocs.PropertySearchSystem.Objects.Owner;
import com.amdocs.PropertySearchSystem.Objects.Property;
import com.amdocs.PropertySearchSystem.Objects.Property.*;

public class AddPropertyUserClass {
	
public Property add() {
	
		
		
		Scanner sc = new Scanner(System.in);
		Property new_prop = new Property();
		
		System.out.println("Enter the propertyId\n");
		int id = sc.nextInt();
		new_prop.setPropertId(id);
		
		System.out.println("Enter the no of rooms\n");
		String rooms = sc.next();
		new_prop.setNoOfRooms(rooms);
		
		System.out.println("Enter the area in sqft\n");
		double area = sc.nextDouble();
		new_prop.setAreaInSqft(area);
		
		System.out.println("Enter the floorno\n");
		int floorno = sc.nextInt();
		new_prop.setFloorNo(floorno);
		
		System.out.println("Enter the City\n");
		String city = sc.next();
		new_prop.setCity(city);
		
		System.out.println("Enter the State");
		String state = sc.next();
		new_prop.setState(state);
		
		System.out.println("Enter the cost");
		double cost = sc.nextDouble();
		new_prop.setCost(cost);
		
		System.out.println("Enter the ownerName");
		String ownername = sc.next();
		new_prop.setOwnerName(ownername);
		
		System.out.println("Enter the owner contact no");
		String contno = sc.next();
		new_prop.setOwnerContactNo(contno);
		
		return new_prop;
		
		
		
	}

}

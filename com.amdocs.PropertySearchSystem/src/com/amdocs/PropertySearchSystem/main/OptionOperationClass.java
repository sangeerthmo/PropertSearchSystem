package com.amdocs.PropertySearchSystem.main;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.amdocs.PropertySearchSystem.DOA.*;
import com.amdocs.PropertySearchSystem.Exceptions.IdNotFoundException;
import com.amdocs.PropertySearchSystem.Objects.Property;
import com.amdocs.PropertySearchSystem.sort.MyCostSort;
import com.amdocs.PropertySearchSystem.sort.MyCostSortRev;


public class OptionOperationClass {
	
	public void specific_function (int selected_option)  {
		
		switch (selected_option) {
		
		case 1:
			
			AddPropertyUserClass obj1 = new AddPropertyUserClass();
			Property new_property = obj1.add();       // creating property from user
			
			AddPropertyClass DOA_add = new AddPropertyClass();
			int i1 = DOA_add.addProperty(new_property);      // adding to DB
			
			
			System.out.println(i1 + "   added...!");
			break;
			
		case 2 :
			
			System.out.println("Enter the id of the property  :  ");
			Scanner sc1 = new Scanner(System.in);
			int id1 = sc1.nextInt();
			
			DeletePropertyClass DOA_delete = new DeletePropertyClass();
			int i2 = DOA_delete.deleteProperty(id1);      // removing from DB
			
			System.out.println(i2 + "   deleted....!");
			break;
			
		case 3 :
			
			System.out.println("Enter the id of the property  :  ");
			Scanner sc2 = new Scanner(System.in);
			int id2 = sc2.nextInt();
			System.out.println("Enter the updated cost  :  ");
			double cost = sc2.nextDouble();
			
			UpdatePropertyClass DOA_update = new UpdatePropertyClass();
			boolean ret3 = DOA_update.updateProperty(cost,id2);       //updating the DB
			
			if(ret3 == true) {
				System.out.println("Updated.....!");
			}
			else {
				System.out.println("Not updated...!");
			}
			break;
			
		case 4 :
			
			
			  System.out.println("Enter the city   :  ");
			  Scanner sc4 = new Scanner(System.in);
			  String city = sc4.nextLine();
			  
			  SearchByCityClass DOA_searchcity = new SearchByCityClass();
			  ResultSet rs1 = DOA_searchcity.searchByCity(city);   //getting result set
			  
			  ResultToArrayList w = new ResultToArrayList();
			  ArrayList<Property> list = w.result_to_array(rs1);    //getting arraylist
			  w.showlist(list);                                      // showing arraylist
			  break;
			
		case 5 :
			
			ShowAllPropertiesClass DOA_showall = new ShowAllPropertiesClass();
			ResultSet rs2 = DOA_showall.showAllProperties();
			
			ResultToArrayList w2 = new ResultToArrayList();
			  ArrayList<Property> list2 = w2.result_to_array(rs2);    //getting arraylist
			  w2.showlist(list2); 
			
			break;
			
		case 6 :
			
			System.out.println("Enter the minimum cost :  \n");
			Scanner sc5 = new Scanner(System.in);
			double min = sc5.nextDouble();
			System.out.println("Enter the maximum cost  :  \n");
			double max = sc5.nextDouble();
			System.out.println("Enter the order  :  \n");
			System.out.println("1.  Low to High");
			System.out.println("2.  High to Low");
			int p = sc5.nextInt();			
			
			
			SearchByCostClass DOA_cost = new SearchByCostClass();
			ResultSet rs3 = DOA_cost.searchByCost(min,max);
			
			ResultToArrayList w3 = new ResultToArrayList();
			  List list3 = w3.result_to_array(rs3);    //getting arraylist
			  if(p == 1) {
				  Collections.sort(list3, new MyCostSort());
				  w3.showlist2(list3);
			  }
			  else if(p == 2) {
				  Collections.sort(list3, new MyCostSortRev());
				  w3.showlist2(list3);
			  }
			   
			break;
			
		case 7:
			
			System.out.println("Enter the no of rooms:  \n");
			Scanner sc6 = new Scanner(System.in);
			String rooms = sc6.nextLine();
			System.out.println("Enter the city:  \n");
			String city1 = sc6.nextLine();
			
			
			SearchByRoomsAndCityClass DOA_roomcity = new SearchByRoomsAndCityClass();
			ResultSet rs4 = DOA_roomcity.searchByRoomAndCity(rooms,city1);
			
			ResultToArrayList w4 = new ResultToArrayList();
			  ArrayList<Property> list4 = w4.result_to_array(rs4);    //getting arraylist
			
			  w4.showlist(list4); 
			
			break;
			
		case 8 :
			System.out.println("Thankyou.......!");
			break;
			
		default :
			System.out.println("Enter a valid option");
			
		}
		
	}

}

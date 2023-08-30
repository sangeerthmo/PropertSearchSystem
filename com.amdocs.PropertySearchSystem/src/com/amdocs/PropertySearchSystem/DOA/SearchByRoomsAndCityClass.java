package com.amdocs.PropertySearchSystem.DOA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchByRoomsAndCityClass {
	
	ConnectionClass db = new ConnectionClass();
	Connection c = db.getConnection();
	
	public ResultSet searchByRoomAndCity(String room ,String city) {
		
		ResultSet rs = null;
		try {
			
			//no_of_rooms , Area_In_Sqft , floorno , city, state,cost_in_rs,ownername,owner_contact_no
			String query = "select * from propertytable where no_of_rooms =  ? AND city = ?";
			PreparedStatement pst = c.prepareStatement(query);
			pst.setString(1, room);
			pst.setString(2, city);
			
			
			rs = pst.executeQuery();
		
		}
		catch(Exception w) {
			System.out.println("ERROr in seachbyroomand city...!");;
		}
		
		return rs;
		
	}

}

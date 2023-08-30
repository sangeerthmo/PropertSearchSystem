package com.amdocs.PropertySearchSystem.DOA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShowAllPropertiesClass {
	
	ConnectionClass db = new ConnectionClass();
	Connection c = db.getConnection();
	
	public ResultSet showAllProperties() {
		
		ResultSet rs = null;
		try {
			
			//no_of_rooms , Area_In_Sqft , floorno , city, state,cost_in_rs,ownername,owner_contact_no
			String query = "select * from propertytable ";
			PreparedStatement pst = c.prepareStatement(query);
			
			rs = pst.executeQuery();
		
		}
		catch(Exception w) {
			System.out.println("ERROr in seach all...!");;
		}
		
		return rs;
		
	}


}

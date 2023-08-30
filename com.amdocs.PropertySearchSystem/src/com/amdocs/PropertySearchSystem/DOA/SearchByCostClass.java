package com.amdocs.PropertySearchSystem.DOA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchByCostClass {
	
	ConnectionClass db = new ConnectionClass();
	Connection c = db.getConnection();
	
	public ResultSet searchByCost(double min ,double max) {
		
		ResultSet rs = null;
		try {
			
			//no_of_rooms , Area_In_Sqft , floorno , city, state,cost_in_rs,ownername,owner_contact_no
			String query = "select * from propertytable where cost_in_rs > ? AND cost_in_rs < ?";
			PreparedStatement pst = c.prepareStatement(query);
			pst.setDouble(1, min);
			pst.setDouble(2, max);
			
			
			rs = pst.executeQuery();
		
		}
		catch(Exception w) {
			System.out.println("ERROr in seachbycost...!");;
		}
		
		return rs;
		
	}

}

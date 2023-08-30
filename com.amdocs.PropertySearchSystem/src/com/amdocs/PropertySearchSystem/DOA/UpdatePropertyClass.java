package com.amdocs.PropertySearchSystem.DOA;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdatePropertyClass {
	
	public boolean updateProperty(double cost,int id) {
		
		ConnectionClass db = new ConnectionClass();
		Connection c = db.getConnection();
		int count = 0;
		
		try {
			
			/*
			 * Statement st = c.createStatement(); count =
			 * st.executeUpdate("update p23 set Cost =" + cost+"where propertyid = "+id);
			 */
			
			  PreparedStatement pst = c.prepareStatement("update propertytable set cost_in_rs = ? where propertyid = ?;");
			 
			 // System.out.println("Hi...!");
			  pst.setDouble(1, cost);
			  pst.setInt(2, id);
			  count = pst.executeUpdate();
			 
		}
		catch(Exception r) {
			System.out.println("Error in updatePropertyClass....!");
		}
		
		if(count > 0) {
			return true;
		}
		else {
			return false;
		}
		
		}

}

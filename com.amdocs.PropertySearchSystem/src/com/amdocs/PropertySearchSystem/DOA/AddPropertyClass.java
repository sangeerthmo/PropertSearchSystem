package com.amdocs.PropertySearchSystem.DOA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.amdocs.PropertySearchSystem.Objects.Property;

public class AddPropertyClass {
	
public int addProperty(Property new_property) {
		
		ConnectionClass db = new ConnectionClass();
		Connection c = db.getConnection();
		int count = 0;
		//System.out.println(new_property.getPropertId());
		try {
			PreparedStatement pst = c.prepareStatement("insert into propertytable values(?,?,?,?,?,?,?,?,?);");
			
			pst.setInt(1,new_property.getPropertId());
			pst.setString(2,new_property.getNoOfRooms());
			pst.setDouble(3,new_property.getAreaInSqft());
			pst.setInt(4,new_property.getFloorNo());
			pst.setString(5,new_property.getCity());
			pst.setString(6,new_property.getState());
			pst.setDouble(7, new_property.getCost());
			pst.setString(8, new_property.getOwnerName());
			pst.setString(9, new_property.getOwnerContactNo());
			count = pst.executeUpdate();
			
			
		}
		catch (Exception r) {
			System.out.println("Error in addPropertyClass");		
			}
		
		return count;
		
	}

}

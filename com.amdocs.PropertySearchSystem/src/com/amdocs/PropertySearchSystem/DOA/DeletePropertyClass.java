package com.amdocs.PropertySearchSystem.DOA;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.amdocs.PropertySearchSystem.Exceptions.IdNotFoundException;

public class DeletePropertyClass {
	
	ConnectionClass db = new ConnectionClass();
	Connection c = db.getConnection();
	
	public int deleteProperty(int id) {
		int count = 0;
		try {
			PreparedStatement pst = c.prepareStatement("delete from propertytable where propertyid=?;");
			
			pst.setInt(1,id);
			count = pst.executeUpdate();
			
		}
		catch(Exception e) {
			//throw new IdNotFoundException();
			System.out.println("Error in  deletePropertyClass");
		}
		return count;
	}

}

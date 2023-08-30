package com.amdocs.PropertySearchSystem.main;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.amdocs.PropertySearchSystem.Objects.Property;

public class ResultToArrayList {
	
	public ArrayList<Property> result_to_array(ResultSet rs) {
		
		ArrayList<Property> ret = new ArrayList<Property>();
		
		try {
		
		while(rs.next()) {
			
			Property p = new Property(rs.getInt(1) , rs.getString(2) , rs.getDouble(3),rs.getInt(4),rs.getString(5),rs.getString(6) , rs.getDouble(7) , rs.getString(8) , rs.getString(9));
			ret.add(p);
		}
		}
		catch(Exception d) {
			System.out.println("HAi....Error...!");
		}
		
		return ret;
		
	}
	
	public void showlist(ArrayList list) {
		
		Iterator itr = list.iterator();
		Property temp = new Property();
		System.out.println("id   Rooms   Area   Floor   city   State   Cost   Owner    Ownernumber\n");
		while(itr.hasNext()) {
			temp = (Property)itr.next();
			temp.showcontents();
			
		}
		
	
	}

		public void showlist2(List list) {
			Iterator itr = list.iterator();
			Property temp = new Property();
			System.out.println("id Rooms  Area  Floor  city        State      Cost      Owner     Ownernumber\n");
			while(itr.hasNext()) {
				temp = (Property)itr.next();
				temp.showcontents();
		}
		}

}

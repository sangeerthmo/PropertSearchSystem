package com.amdocs.PropertySearchSystem.sort;

import java.util.Comparator;

import com.amdocs.PropertySearchSystem.Objects.Property;

public class MyCostSortRev implements Comparator<Property>{
	
	
	public int compare(Property p1 , Property p2) {
		return (int)(p2.getCost() - p1.getCost());
	}
	
	

}

package com.amdocs.PropertySearchSystem.sort;
import java.util.Comparator;

import com.amdocs.PropertySearchSystem.Objects.*;

public class MyCostSort implements Comparator<Property>{
	
	
	public int compare(Property p1 , Property p2) {
		return (int)(p1.getCost() - p2.getCost());
	}
	
	

}

package com.amdocs.PropertySearchSystem.Objects;

public class Property {
	
	private int propertId;
	private String noOfRooms;
	private double areaInSqft;
	private int floorNo;
	private String city;
	private String state;
	private double cost;
	private String ownerName;
	private String ownerContactNo;
	
	public Property() {
		
	}
	
	
	public Property(int int1, String string, double double1, int int2, String string2, String string3, double double2,
			String string4, String string5) {
		this.propertId = int1;
		this.noOfRooms = string;
		this.areaInSqft = double1;
		this.floorNo = int2;
		this.city = string2;
		this.state = string3;
		this.cost = double2;
		this.ownerName = string4;
		this.ownerContactNo = string5;
		
	}
	public int getPropertId() {
		return propertId;
	}
	public void setPropertId(int propertId) {
		this.propertId = propertId;
	}
	public String getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(String noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	public double getAreaInSqft() {
		return areaInSqft;
	}
	public void setAreaInSqft(double areaInSqft) {
		this.areaInSqft = areaInSqft;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerContactNo() {
		return ownerContactNo;
	}
	public void setOwnerContactNo(String ownerContactNo) {
		this.ownerContactNo = ownerContactNo;
	}
	
	public void showcontents() {
		
		
		
		System.out.println( propertId +"   " + noOfRooms + "   " + areaInSqft+"   "+ floorNo +"    "+city+"    "+state+"   " + cost + "   " + ownerName + "   " + ownerContactNo +"\n");
	}
	
	
	
	

}

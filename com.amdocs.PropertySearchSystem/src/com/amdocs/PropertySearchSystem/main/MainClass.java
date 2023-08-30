package com.amdocs.PropertySearchSystem.main;


public class MainClass {

	public static void main(String[] args) {
	System.out.println("........WELCOME!!!!....... \n");
	
	
	MainUserClass option = new MainUserClass();
	OptionOperationClass operation = new OptionOperationClass();
	
	int selectedOption=0;
	while(true) {
		selectedOption= option.list();
	operation.specific_function(selectedOption);
	if(selectedOption == 8) {
		break;
	}
	
	}
	
	
	
	
	
	}

}

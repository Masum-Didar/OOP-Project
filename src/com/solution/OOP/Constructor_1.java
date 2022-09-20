package com.solution.OOP;

public class Constructor_1 {
	String myName;
	String myDegination;
	int myID;
	
	public Constructor_1(String name, String degination, int id) {
		System.out.println("This is constructor using paramiters");
		System.out.println("...............................................................................");
		System.out.println("Employee Details");
		myName = name;
		myDegination = degination;
		myID = id;
		System.out.println("ID: "+id);
		System.out.println(myName);
		System.out.println(myDegination);
	}
	public static void main(String[] args) {
		
		/*Constructor_1 obj = */ new Constructor_1("Abu Masum Didar", "Executive(IT)", 8);
	
	}

}

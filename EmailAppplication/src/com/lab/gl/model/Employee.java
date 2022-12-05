package com.lab.gl.model;

import java.util.Scanner;

public class Employee {
	//firstname
	//lastname
	//email
	//password
	//departments
	
	private String firstName,lastName,email,password,department;
	
	Scanner userInput1 = new Scanner(System.in);
	public Employee(String fName, String lName) {
		
		
		
//		this.firstName=firstName;
//		this.lastName=lastName;
		System.out.println("Enter the FirstName");
		String fname = userInput1.nextLine();
		this.firstName=fname;
		System.out.println("Enter the LastName");
		String lname = userInput1.nextLine();
		this.lastName=lname;
	
	//userInput1.close();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}

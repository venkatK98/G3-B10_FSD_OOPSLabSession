package com.lab.gl.appMain;

import java.util.Scanner;

import com.lab.gl.credentials.ICredentials;
import com.lab.gl.model.Employee;
import com.lab.gl.services.CredentialService;


public class AppMain {
public static void main(String[] args) {


	
//	String Name= userInput.nextLine();
	
	
	Employee demoemployee = new Employee(null,null);
	
	ICredentials credentailservice = new CredentialService();
	
	
	
	
	System.out.println("Choose the Department");
	
	System.out.println("1. Tech");
	System.out.println("2. Admin");
	System.out.println("3. HR");
	System.out.println("4. Legal");
	
	System.out.println("\nSelect an Option");
	
	//UserInput Options
	Scanner userInput = new Scanner(System.in);
	
	int option = userInput.nextInt();
	
	
	
	String generatedEmail = null;
	String generatedPassword = null;
	
	switch(option) {
		case 1: {
			generatedEmail = credentailservice.generateMailID(demoemployee.getFirstName().toLowerCase(), demoemployee.getLastName().toLowerCase(),"tech");
			generatedPassword= credentailservice.generatePassword();
			break;
			
		}
		case 2: {
			generatedEmail = credentailservice.generateMailID(demoemployee.getFirstName().toLowerCase(), demoemployee.getLastName().toLowerCase(),"admin");
			generatedPassword= credentailservice.generatePassword();
			break;
			
		}
		case 3: {
			generatedEmail = credentailservice.generateMailID(demoemployee.getFirstName().toLowerCase(), demoemployee.getLastName().toLowerCase(),"hr");
			generatedPassword= credentailservice.generatePassword();
			break;
			
		}
		case 4: {
			generatedEmail = credentailservice.generateMailID(demoemployee.getFirstName().toLowerCase(), demoemployee.getLastName().toLowerCase(),"legal");
			generatedPassword= credentailservice.generatePassword();
			break;
			
		}
		default:{
			System.out.println("Invalid Option");
		}
		
	}
	demoemployee.setEmail(generatedEmail);
	demoemployee.setPassword(generatedPassword);
	credentailservice.displayCredentials(demoemployee);
	userInput.close();
}

}

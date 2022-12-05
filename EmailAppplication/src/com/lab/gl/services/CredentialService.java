package com.lab.gl.services;

import java.util.Random;

import com.lab.gl.credentials.ICredentials;
import com.lab.gl.model.Employee;

public class CredentialService implements ICredentials{


	@Override
	public String generateMailID(String firstName, String lastName, String department) {
		String mailID = firstName+lastName+"@"+department+".gl.com";
		
		//johnAndrew@Tech.gl.com
		return mailID;
	}

	@Override
	public String generatePassword() {
//		int a = (int) Math.random();

		
		String Cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Lower = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String specialcharacter = "!@#$%^&*()";
			
			String allValues = Cap+Lower+num+specialcharacter;
			
			Random randomobj= new Random();
			String password="";
			
			for (int i=0; i<8; i++) {
				int boundvalue = allValues.length();
				int randomIndex = randomobj.nextInt(boundvalue);
				char randomchar = allValues.charAt(randomIndex);
				password += String.valueOf(randomchar);
			}
		return password;
	}

	@Override
	public void displayCredentials(Employee employee) {
		// Display, Email, Password
		// Welcome Message
		System.out.println("\nDear "+employee.getFirstName()+ " your generated credentials are as follows");
		System.out.println("Email ID: "+ employee.getEmail());
		System.out.println("Your Password is: "+ employee.getPassword());
		
	}

}

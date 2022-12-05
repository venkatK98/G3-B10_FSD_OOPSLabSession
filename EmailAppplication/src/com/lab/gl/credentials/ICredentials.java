package com.lab.gl.credentials;

import com.lab.gl.model.Employee;

public interface ICredentials {
	 //generateMailId
	public String generateMailID(String firstName,String lastName,String department);
	//generatePassword
	public String generatePassword();
	//DisplayCredentials
	public void displayCredentials(Employee employee);
}

package com.vinaykolusu.springSample.gitSpringDI;

import com.vinaykolusu.springSample.gitSpringDI.dao.EmployeeGenerator;

public class OutputHelper {

	EmployeeGenerator employeeGenerator;
	
	public void getEmployeeDetails(){
		
		employeeGenerator.getEmployeeDetails();
		
	}
	
	
	//DI via setter method
	public void setEmployeeGenerator(EmployeeGenerator employeeGenerator){
		
		this.employeeGenerator = employeeGenerator;
	}
	
	
}

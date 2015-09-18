package com.vinaykolusu.springSample.gitSpringDI.impl;

import org.apache.log4j.Logger;

import com.vinaykolusu.springSample.gitSpringDI.dao.EmployeeGenerator;

public class ManagerGeneratorImpl implements EmployeeGenerator {

	private static final Logger logger = Logger.getLogger(ManagerGeneratorImpl.class);
	
	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		
		logger.info("This is Manager Object Class");
	}
	
	

}

package com.vinaykolusu.springSample.gitSpringJavaConfig.impl;

import org.apache.log4j.Logger;

import com.vinaykolusu.springSample.gitSpringJavaConfig.dao.EmployeeBean;

public class EmployeeBeanImpl implements EmployeeBean {

	private static final Logger logger = Logger.getLogger(EmployeeBeanImpl.class);
	
	
	public void printEmployeeDetails(String eName){
		logger.info("Entry :: printEmployeeDetails");
		
		logger.info("Employee Name is " + eName);
		
		logger.info("Exit :: printEmployeeDetails");
	}
	
}

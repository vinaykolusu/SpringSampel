package com.vinaykolusu.springSample.gitSpringCI.impl;

import org.apache.log4j.Logger;

import com.vinaykolusu.springSample.gitSpringCI.dao.ObjectGenerator;

public class EmployeeObjectGenerator implements ObjectGenerator {

	@SuppressWarnings("deprecation")
	private static final Logger logger = (Logger) Logger.getInstance(EmployeeObjectGenerator.class);
	
	public void getObject() {
		// TODO Auto-generated method stub
		
		logger.info("This is getObject of EmployyeeObjectGenerator");
		
	}

}

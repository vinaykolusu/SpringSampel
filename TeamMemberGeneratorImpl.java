package com.vinaykolusu.springSample.gitSpringDI.impl;

import org.apache.log4j.Logger;

import com.vinaykolusu.springSample.gitSpringDI.dao.EmployeeGenerator;

public class TeamMemberGeneratorImpl implements EmployeeGenerator {

	private static final Logger logger = Logger.getLogger(TeamMemberGeneratorImpl.class);
	
	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		
		  logger.info("This is an  TeamMember class");
		
	}

}

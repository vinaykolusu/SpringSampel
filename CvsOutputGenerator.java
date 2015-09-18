package com.vinaykolusu.springSample.gitSpringCoupling;

import org.apache.log4j.Logger;

public class CvsOutputGenerator implements IOutputGenerator{

	private static final Logger logger = Logger.getLogger(CvsOutputGenerator.class); 
	
	public void generateOutput(){
		logger.info("Entry :: generateOutput");
		
			logger.info("Yahoo inside CvsOutputGeneraotr.generateOutput");
		
		logger.info("Exit :: generateOutput");
	}
	
	
}

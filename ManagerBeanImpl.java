package com.vinaykolusu.springSample.gitSpringJavaConfig.impl;

import org.apache.log4j.Logger;

import com.vinaykolusu.springSample.gitSpringJavaConfig.dao.ManagerBean;

public class ManagerBeanImpl implements ManagerBean{
	
	private static final Logger logger = Logger.getLogger(ManagerBeanImpl.class);

	
	
	public void getManager() {
		// TODO Auto-generated method stub
		logger.info("Entry :: getManager");
		
			logger.info("Manager Name is Vinay Kolusu");
		
		logger.info("Exit :: getManager");
		
	}
	
	

}

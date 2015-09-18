package com.vinaykolusu.springSample.gitSpringJavaConfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vinaykolusu.springSample.gitSpringJavaConfig.dao.ManagerBean;
import com.vinaykolusu.springSample.gitSpringJavaConfig.impl.ManagerBeanImpl;


@Configuration
public class ManagerConfig {

		@Bean(name="managerBean")
		public ManagerBean getManagerName(){
			
			return new ManagerBeanImpl();
		}
	
	
}

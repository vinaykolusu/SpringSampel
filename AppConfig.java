package com.vinaykolusu.springSample.gitSpringJavaConfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.vinaykolusu.springSample.gitSpringJavaConfig.dao.EmployeeBean;
import com.vinaykolusu.springSample.gitSpringJavaConfig.impl.EmployeeBeanImpl;

@Configuration
@Import(ManagerConfig.class) 
public class AppConfig {

	@Bean(name="employeeBean")
	public EmployeeBean getEmployeeBeanImpl(){
		
		return new EmployeeBeanImpl();
		
	}
	
	
}

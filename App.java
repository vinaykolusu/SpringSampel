package com.vinaykolusu.springSample.gitSpringDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
			
			OutputHelper out = (OutputHelper) context.getBean("OutputHelper");
		
			out.getEmployeeDetails();
			
	}

}

package com.vinaykolusu.springSample.gitSpringCI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectGeneratorApp {

	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-CIConfig.xml");
		
		ObjectHelper objHelper = (ObjectHelper) context.getBean("objGenerator");
		
		objHelper.getObject();
		
	}
	
	
}

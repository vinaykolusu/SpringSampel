package com.vinaykolusu.springSample.gitSpringCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vinaykolusu.springSample.gitSpringCollections.dao.Customer;

public class CollectionApp {
	
	
	public static void main(String [] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-CollectionsConfig.xml");
	
		Customer cust = (Customer) context.getBean("CustomerBean");
		
		System.out.println(cust);
		
	}

}

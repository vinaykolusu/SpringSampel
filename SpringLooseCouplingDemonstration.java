package com.vinaykolusu.springSample.gitSpringCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLooseCouplingDemonstration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*IOutputGenerator output = new CvsOutputGenerator();
		
		output.generateOutput();*/
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Common.xml");
		
		OutputHelper out = (OutputHelper) context.getBean("outputHelper");
		out.generateOutput();
		
	}

}

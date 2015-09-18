package com.vinaykolusu.springSample.gitSpringCoupling;

import org.apache.log4j.Logger;

public class OutputHelper {

	private static final Logger logger = Logger.getLogger(OutputHelper.class);
	IOutputGenerator outputGenerator;
	
	public void generateOutput(){
		outputGenerator.generateOutput();
	}

	
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		
		this.outputGenerator = outputGenerator;
	}

}

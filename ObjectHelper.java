package com.vinaykolusu.springSample.gitSpringCI;

import com.vinaykolusu.springSample.gitSpringCI.dao.ObjectGenerator;

public class ObjectHelper {
	
	ObjectGenerator objGenerator;
	
	
	public void getObject(){
		
		objGenerator.getObject();
	}
	
	//DI via Constructor
	
	public ObjectHelper(ObjectGenerator objGenerator){
		
		this.objGenerator = objGenerator;
		
	}
	

}

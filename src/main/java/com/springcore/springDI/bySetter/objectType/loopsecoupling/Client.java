package com.springcore.springDI.bySetter.objectType.loopsecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml"); 
	    Student stu = context.getBean("student", Student.class); 
	    stu.cheating();
	    
	   
	    
		
	}

}

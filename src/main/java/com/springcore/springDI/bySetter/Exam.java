package com.springcore.springDI.bySetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		/*
		 *  Student st = new Student(); st.setId(101);
		 *  st.setStudentName("Rahul C");
		 *  st.displayStudentInfo();
		 */
		
		
		  ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml"); 
		  Student stu = context.getBean("student", Student.class); 
		  stu.displayStudentInfo();
		  
		  Student stu2 = context.getBean("student2", Student.class);
		  stu2.displayStudentInfo();
		  
	}

}

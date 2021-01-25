package com.springDI.byConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		/*
		 *  Student stu = new Student(1, "Rahul"); 
		 *  stu.displayStudentInfo();
		 */
		
		  ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		  Student stu = context.getBean("student", Student.class); 
		  stu.displayStudentInfo();
		  
		  Student stu2 = context.getBean("student2", Student.class);
		  stu2.displayStudentInfo();
		  
		  Student stu3 = context.getBean("student3", Student.class);
		  stu3.displayStudentInfo();
		 
	}

}

package com.springDI.byConstructor;

public class Exam {
	
	public static void main(String[] args) {
		
		Student stu = new Student(1, "Rahul");
		stu.displayStudentInfo();
		
		
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("beans2.xml"); Student stu =
		 * context.getBean("student", Student.class); stu.displayStudentInfo();
		 * 
		 * Student stu2 = context.getBean("student2", Student.class);
		 * stu2.displayStudentInfo();
		 */
	}

}

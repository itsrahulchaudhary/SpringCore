package com.springcore.springDI.bySetter.objectType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class Client {
	
	public static void main(String[] args) {
		
     /*
		MathCheat mathCheat = new MathCheat();
		Student student = new Student();
		student.setMathCheat(mathCheat);
		student.setId(101);
		student.cheating();
	 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml"); 
	    Student stu = context.getBean("student", Student.class); 
	    stu.cheating();
	    
	    AnotherStudent anotherStd = context.getBean("anotherStudent", AnotherStudent.class); 
	    anotherStd.cheating();
	    
		
	}

}

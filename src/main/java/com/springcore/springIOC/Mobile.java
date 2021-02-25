package com.springcore.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
	/*	
		Airtel airtel = new Airtel();
		airtel.calling();
		airtel.data();
		
		Vodafone vodafone = new Vodafone();
		vodafone.calling();
		vodafone.data();
	*/
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config Loaded.");
		Airtel air =(Airtel)context.getBean("airtel");
		air.calling();
		air.data();
		System.out.println("---------------------------------------");
		Vodafone voda = context.getBean("vodafone", Vodafone.class);
		voda.calling();
		voda.data();
		System.out.println("---------------------------------------");
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
		
	}

}

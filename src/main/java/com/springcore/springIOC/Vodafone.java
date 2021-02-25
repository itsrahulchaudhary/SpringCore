package com.springcore.springIOC;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling via Vodafone Sim");
		
	}

	@Override
	public void data() {
		System.out.println("Data via Vodafone Sim");

		
	}
	

}

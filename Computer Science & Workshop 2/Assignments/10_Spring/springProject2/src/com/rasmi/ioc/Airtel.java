package com.rasmi.ioc;

public class Airtel implements Sim {
	@Override
	public void calling()
	{
		System.out.println("calling usin airtel");
		
	}
	@Override
	public void data()
	{
		System.out.println("data vusing airtel");
	}
	

}

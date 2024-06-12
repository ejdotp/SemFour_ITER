package com.rasmi.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mobile {

	
	public static void main(String args[])
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("config is loaded");
		Sim sim=(Sim)context.getBean("sim");
		sim.calling();
		sim.data();
	}
}

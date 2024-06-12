package com.rasmi.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("config is loaded");
		//Student s=context.getBean("stud1",Student.class);
		//System.out.println("Name= "+s.getStudName());

	}

}

package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1 {
	public static void main(String[] args) {
		System.out.println("-----Spring Container is not Ready------");
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("jlcindia.xml");
		System.out.println("-----Spring Container is Ready------");
		Hello h = (Hello) ctx.getBean("hello");
		h.show();
	}
}

package com.ram.enableScheduling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AppTest {
	public static void main(String[] args)  {
        AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
        
       // ApplicationContext ap =new ClassPathXmlApplicationContext("com/ram/enableScheduling/AppConfig.class");

	}
}
package com.learning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {


		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		
		System.out.println(theCoach==alphaCoach);
		
		System.out.println(theCoach);
		
		System.out.println(alphaCoach);
		//call methods on the bean
//		System.out.println(theCoach.getDailyWorkout());
//		
//		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		

	}

}

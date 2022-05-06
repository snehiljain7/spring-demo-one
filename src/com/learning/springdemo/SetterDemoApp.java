package com.learning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
				//load spring configuration file
				ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
					
				//retrieve bean from spring container
				CricketCoach theCoach1 = context1.getBean("myCricketCoach", CricketCoach.class);
					
				//call methods on the bean
				System.out.println(theCoach1.getDailyWorkout());
						
				System.out.println(theCoach1.getDailyFortune());
				
				//call methods to get literal values
				System.out.println(theCoach1.getEmailAddress());
				System.out.println(theCoach1.getTeam());
				
						
				//close the context
				context1.close();
		
	}

}

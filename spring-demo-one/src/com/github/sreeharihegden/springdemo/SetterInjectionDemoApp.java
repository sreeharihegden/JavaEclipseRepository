package com.github.sreeharihegden.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemoApp {

	public static void main(String[] args) {
		
		// Load the Spring config file.
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from Spring container.
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);		
		
		// Call methods on the bean.
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Call new methods to get the Literal Values Injected.
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		// Close the context.
		context.close();
	}
}

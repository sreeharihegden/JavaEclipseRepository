package com.github.sreeharihegden.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load the Spring Configuration File. 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); // This XML file can have any name.
		
		// Retrieve Bean from Spring Container aka Application Context.
		// Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach theCoach = context.getBean("myTrackCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		// Call the new method added using Dependency Injection.
		System.out.println(theCoach.getDailyFortune());

		// Close the Context.
		context.close(); // clean up.
	}

}

package com.github.sreeharihegden.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load the Spring Configuration File. 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml"); // This XML file can have any name.
		
		// Retrieve Bean from Spring Container aka Application Context.
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// Close the Context.
		context.close(); // clean up.
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		try {
        
			for (int i = 0; i < 5000; i++) {
               
                // it will sleep the main thread for 1 sec
                // ,each time the for loop runs
                Thread.sleep(5000);
               
                // printing the value of the variable
            	System.out.println("Hello World"+i);
            }
        }
        catch (Exception e) {
           
            // catching the exception
            System.out.println(e);
        }
	}

}

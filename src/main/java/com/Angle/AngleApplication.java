package com.Angle;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AngleApplication {
	
	static Logger log=Logger.getLogger(AngleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AngleApplication.class, args);
		
		PropertyConfigurator.configure("angle.properties");
		log.info("Application Started");
	}

}

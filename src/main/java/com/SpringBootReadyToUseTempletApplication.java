package com;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootReadyToUseTempletApplication {
private static final Logger logger=LogManager.getLogger(SpringBootReadyToUseTempletApplication.class);
	public static void main(String[] args) {
		logger.warn("Entering the main application ");
		SpringApplication.run(SpringBootReadyToUseTempletApplication.class, args);
		logger.info("Exist from main application ");
	}

}

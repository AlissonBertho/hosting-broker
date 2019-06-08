package com.cvctest.backend.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Alisson
 *
 */
@SpringBootApplication(scanBasePackages = {"com.cvctest.backend"})
public class Application {

	public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }
}

package com.yy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.yy")
public class AppRun {

	 public static void main(String[] args) throws Exception {
	        SpringApplication.run(AppRun.class, args);
	    }
}

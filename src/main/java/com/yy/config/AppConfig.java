package com.yy.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public CommandLineRunner commandLineRunner(){
		return  new CommandLineRunner(){

			@Override
			public void run(String... args) throws Exception {
				System.out.println("---welcome to this project---");
				
			}
			
		};
	}
}

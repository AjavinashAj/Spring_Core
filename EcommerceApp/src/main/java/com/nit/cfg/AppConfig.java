package com.nit.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.nit"})
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig::constructor");
	}
	

}

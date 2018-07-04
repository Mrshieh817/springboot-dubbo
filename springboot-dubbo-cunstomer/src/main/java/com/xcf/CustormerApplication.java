package com.xcf;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
@SpringBootApplication
@ComponentScan(value = "com.xcf")
@ImportResource(value = {"classpath:Custormer.xml"})
public class CustormerApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CustormerApplication.class, args);
	}
}

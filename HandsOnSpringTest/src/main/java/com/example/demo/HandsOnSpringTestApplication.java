package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import com.example.demo.data.DataLayer;

import org.springframework.context.annotation.ComponentScan;



@Configuration
@ComponentScan(basePackages = { "com.example.demo" })
class SpringContext{
}

public class HandsOnSpringTestApplication {

	
	private static DataLayer dtLyr;
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(
		        SpringContext.class);
		
		dtLyr=context.getBean(DataLayer.class);
		String strDtfrmt = dtLyr.formatDate("yyyy-MM-dd HH:mm:ss", "GMT+04:30");
		System.out.println("Date Format is :"+strDtfrmt);
	}
}

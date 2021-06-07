package com.mycom.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mycom.springdemo.serviceimpl.MyServiceImplOne;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringdemoApplication.class, args);
		
		MyServiceImplOne instaceOne=ctx.getBean(MyServiceImplOne.class);
		MyServiceImplOne instaceTwo=ctx.getBean(MyServiceImplOne.class);
		
		System.out.println(instaceOne);
		System.out.println(instaceTwo);
	}
}

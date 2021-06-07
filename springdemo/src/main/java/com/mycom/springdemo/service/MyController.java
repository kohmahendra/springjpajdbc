package com.mycom.springdemo.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	Logger logger =LoggerFactory.getLogger(this.getClass());
		@Autowired
		public MyService myServiceImplOne;
	
	@PostConstruct
	public void anyName()
	{
		logger.info("I am called after all dependant beans are loaded");
	}
	
	@PreDestroy
	public void anyName2()
	{
		logger.info("I am called when server stops"); 
	}
	
	
}

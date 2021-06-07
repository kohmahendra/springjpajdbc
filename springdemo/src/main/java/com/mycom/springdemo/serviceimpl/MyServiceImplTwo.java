package com.mycom.springdemo.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.mycom.springdemo.service.MyService;
@Component
public class MyServiceImplTwo implements MyService {
	
	Logger logger =LoggerFactory.getLogger(this.getClass());
	
	public MyServiceImplTwo() {
		logger.info("constructor MyServiceImplTwo");
	}
	@Override
	public int myMethod() {
		logger.info("in MyServiceImplTwo");
		return 2;
	}
}

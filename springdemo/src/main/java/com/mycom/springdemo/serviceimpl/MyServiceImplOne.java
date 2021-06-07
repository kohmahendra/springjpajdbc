package com.mycom.springdemo.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mycom.springdemo.service.MyService;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MyServiceImplOne implements MyService {
	
	public MyServiceImplOne() {
		logger.info("constructor MyServiceImplOne");
	}

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public int myMethod() {
		logger.info("in MyServiceImplOne");
		return 1;
	}
}

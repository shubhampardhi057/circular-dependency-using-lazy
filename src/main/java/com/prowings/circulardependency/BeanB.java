package com.prowings.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
	
	private BeanA beanA;

	@Autowired
	public BeanB(@Lazy BeanA beanA) {
		super();
		this.beanA = beanA;
	}
	
	
	public void doSomething() {
		
		System.out.println("Method of BeanA !!!");
	}

}

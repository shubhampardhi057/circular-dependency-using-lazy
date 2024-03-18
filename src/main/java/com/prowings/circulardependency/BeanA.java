package com.prowings.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
	
	private BeanB beanB;

	@Autowired
	public BeanA(@Lazy BeanB beanB) {
		super();
		this.beanB = beanB;
	}
	

	public void doSomething() {
		
		System.out.println("Method of BeanA !!!");
	}

}

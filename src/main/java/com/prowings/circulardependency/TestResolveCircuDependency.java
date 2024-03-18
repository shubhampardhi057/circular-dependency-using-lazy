package com.prowings.circulardependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestResolveCircuDependency {
	
	public static void main(String[] args) {
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		BeanA a = cxt.getBean(BeanA.class);
		
		System.out.println(a);
		
		a.doSomething();
		
		BeanB b = cxt.getBean(BeanB.class);
		
		System.out.println(b);
		
		b.doSomething();
		
		
	}

}

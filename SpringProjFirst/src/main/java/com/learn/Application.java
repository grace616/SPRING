package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.model.User;

public class Application {
	
	public static void main(String[] args) {
		
		
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
		User bean = ctx.getBean("user",User.class);
		System.out.println(bean);
		
		
		User bean1 = ctx.getBean("user1",User.class);
		System.out.println(bean1);
	}

}

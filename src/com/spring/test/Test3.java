package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity.Demo4;

/**
 * ½Ó¿Ú×¢Èë
 * @author Administrator
 *
 */
public class Test3 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo4 demo = ctx.getBean("demoFour1",Demo4.class);
		demo.getUsb().start();
		System.out.println("==========================");
		demo.work();
	}
	
}

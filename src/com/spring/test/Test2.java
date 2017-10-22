package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity.Demo3;

/**
 * 构造方法注入
 * @author Administrator
 *
 */
public class Test2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo3 demo = ctx.getBean("demoThree1",Demo3.class);
		demo.info();
		System.out.println("===============================");
		demo = ctx.getBean("demoThree2",Demo3.class);
		demo.info2();
	}
	
}

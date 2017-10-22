package com.spring.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity2.Hello;

public class Test {

	public static void main(String[] args) {
		//����xml
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ͨ��ioc��ת ������ȡHello����
		Hello hello = ctx.getBean("hello",Hello.class);
		System.out.println(hello.getName());
	}
	
}

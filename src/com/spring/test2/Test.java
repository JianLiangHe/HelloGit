package com.spring.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity2.Hello;

public class Test {

	public static void main(String[] args) {
		//解析xml
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过ioc反转 被动获取Hello对象
		Hello hello = ctx.getBean("hello",Hello.class);
		System.out.println(hello.getName());
	}
	
}

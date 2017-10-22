package com.spring.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.UserService;


/**
 * 对象注入练习
 * @author Administrator
 *
 */
public class Test2 {

	public static void main(String[] args) {
		//解析xml
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service = ctx.getBean("userService",UserService.class);
		service.getUser();
	}
	
}

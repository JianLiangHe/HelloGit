package com.spring.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity.Demo1;

/**
 * 
 * @author Administrator
 *
 */
public class Test1 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ªÒ»°JavaBean
		Demo1 demo = ctx.getBean("demo1",Demo1.class);
		System.out.println(demo.getName()+","+demo.getAge());
		
		System.out.println("================================");
		
		demo = ctx.getBean("demo2",Demo1.class);
		System.out.println(demo.getName()+","+demo.getAge());
		System.out.println(Arrays.toString(demo.getHobbys()));
		System.out.println(Arrays.toString(demo.getBooks().toArray()));
		
		System.out.println("================================");
		
		demo = ctx.getBean("demo3",Demo1.class);
		System.out.println(demo.getName());
		System.out.println(demo.getDemo2().getMoney());
	}
	
}

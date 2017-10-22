package com.spring.entity;

/**
 * 构造方法注入类
 * @author Administrator
 *
 */
public class Demo3 {
	
	private String name;
	private int age;
	
	public Demo3() {
		super();
	}

	public Demo3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void info(){
		System.out.println("姓名:"+this.name+",年龄:"+this.age);
	}
	
	public void info2(){
		System.out.println("姓名:"+this.name+",年龄:"+this.age);
	}
	
}

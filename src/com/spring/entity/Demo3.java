package com.spring.entity;

/**
 * ���췽��ע����
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
		System.out.println("����:"+this.name+",����:"+this.age);
	}
	
	public void info2(){
		System.out.println("����:"+this.name+",����:"+this.age);
	}
	
}

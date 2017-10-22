package com.spring.entity;

import java.util.List;

/**
 * Setter 方法注入
 * @author Administrator
 *
 */
public class Demo1 {
	
	//简单属性
	private String name = "张三";
	private int age = 23;
	//复杂属性
	private String[] hobbys;
	private List books;
	//实体属性
	private Demo2 demo2;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getHobbys() {
		return hobbys;
	}
	public void setHobbys(String[] hobbys) {
		this.hobbys = hobbys;
	}
	public List getBooks() {
		return books;
	}
	public void setBooks(List books) {
		this.books = books;
	}
	public Demo2 getDemo2() {
		return demo2;
	}
	public void setDemo2(Demo2 demo2) {
		this.demo2 = demo2;
	}
	
}

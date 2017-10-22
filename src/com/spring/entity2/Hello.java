package com.spring.entity2;

public class Hello {
	private String name = "уехЩ";

	public Hello() {
		System.out.println("hello "+name);
	}

	public Hello(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

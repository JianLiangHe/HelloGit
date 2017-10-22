package com.spring.entity;

/**
 * 注入接口
 * @author Administrator
 *
 */
public class Demo4 {
	private String name;
	private Usb usb;
	
	public void work(){
		System.out.print(name+"的");
		usb.start();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Usb getUsb() {
		return usb;
	}
	public void setUsb(Usb usb) {
		this.usb = usb;
	}
}

package com.spring.entity;

/**
 * ע��ӿ�
 * @author Administrator
 *
 */
public class Demo4 {
	private String name;
	private Usb usb;
	
	public void work(){
		System.out.print(name+"��");
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

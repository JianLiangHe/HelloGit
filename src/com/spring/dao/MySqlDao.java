package com.spring.dao;


public class MySqlDao implements UserDao {

	@Override
	public void getUser() {
		System.out.println("MySql数据库连接获取信息...");
	}

}

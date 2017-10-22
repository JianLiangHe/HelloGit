package com.spring.dao;

public class OracleDao implements UserDao {

	@Override
	public void getUser() {
		System.out.println("Oracle数据库连接获取信息...");
	}

}

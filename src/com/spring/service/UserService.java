package com.spring.service;

import com.spring.dao.UserDao;

/**
 * 用户的服务层
 * @author Administrator
 *
 */
public class UserService {

	private UserDao userDao;
	
	//获取数据库信息
	public void getUser(){
		userDao.getUser();
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}

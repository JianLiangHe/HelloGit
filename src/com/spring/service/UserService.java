package com.spring.service;

import com.spring.dao.UserDao;

/**
 * �û��ķ����
 * @author Administrator
 *
 */
public class UserService {

	private UserDao userDao;
	
	//��ȡ���ݿ���Ϣ
	public void getUser(){
		userDao.getUser();
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}

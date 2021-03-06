package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public void insertUser(UserVO user) {

	}

	@Override
	public List<UserVO> getUserList() {

		return null;
	}

	@Override
	public void deleteUser(String id) {

	}

	@Override
	public UserVO read(String id) {
		return this.userDao.read(id);
	}

	@Override
	public void updateUser(UserVO user) {

	}

}

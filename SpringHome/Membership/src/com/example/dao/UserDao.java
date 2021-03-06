package com.example.dao;

import java.util.List;
import com.example.vo.UserVO;

// model
public interface UserDao {
	// create
	void insertUser(UserVO user);
	
	// read all
	//List<UserVO> getUserList();
	List<UserVO> readAll();
	
	// delete
	void deleteUser(String id);
	
	// read 
	//UserVO getUser(String id);
	UserVO read(String id);
	
	// update
	void updateUser(UserVO user);

	

	
}

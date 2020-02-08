package com.example.service;

import java.util.List;
import com.example.vo.UserVO;

public interface UserService {
	// create
	void insertUser(UserVO user);
	
	// read all
	List<UserVO> getUserList();
	
	// delete
	void deleteUser(String id);
	
	// read 
	//UserVO getUser(String id);
	UserVO read(String id);
	
	// update
	void updateUser(UserVO user);

	

}

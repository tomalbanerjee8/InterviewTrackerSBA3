package com.wellsfargo.sba3.it.service;

import java.util.List;

import com.wellsfargo.sba3.it.exception.InterviewTrackerException;
import com.wellsfargo.sba3.it.model.UserModel;

public interface UserService {

	UserModel add(UserModel user) throws InterviewTrackerException;
	
	boolean deleteUser(int userId) throws InterviewTrackerException;
	
	UserModel getUser(int userId);
	
	List<UserModel> getAllUsers();

}

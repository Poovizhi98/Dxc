package com.dxc.pms.dao;

import java.util.List;


import com.dxc.pms.model.User;

public interface UserDao {
	public boolean addUser(User user);
	public User getUser(int userId);
	public boolean deleteUser(int userId);
	public boolean updateUser(User user);
	public boolean isUserExists(int userId);
	public List<User> getAllUsers();
	public List<User> searchUserbyName(String userName);
	public int login(String email);
	public boolean isEmailExists(String email);
	

}

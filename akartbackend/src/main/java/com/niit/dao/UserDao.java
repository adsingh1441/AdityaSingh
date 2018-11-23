package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface UserDao {
	public boolean add(User userId);
	public boolean delete(User userId);
	public boolean update(User userId);
	public List<User> listUser();
	public User getUser(int userId);

}

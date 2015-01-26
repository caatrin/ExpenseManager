package com.expensemanager.service;

import com.expensemanager.domain.User;

public interface UserService {
	public void addUser(User user);
	public User isValid(User user);
}

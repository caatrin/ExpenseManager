package com.expensemanager.service;

import com.expensemanager.domain.User;

public interface UserService {
	public void addUser(User user);
	public boolean isValid(User user);
	public User getCurrentUser();
}

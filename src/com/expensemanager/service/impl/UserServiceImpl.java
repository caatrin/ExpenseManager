package com.expensemanager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expensemanager.domain.User;
import com.expensemanager.repository.UserRepository;
import com.expensemanager.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}


	@Override
	public User isValid(User user) {
		User actualUser = userRepository.getUserByEmail(user.getEmail());
		
		return actualUser;
	}
	

}

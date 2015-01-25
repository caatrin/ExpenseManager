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
	private User user;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}


	@Override
	public boolean isValid(User user) {
		user = userRepository.getUserByEmail(user.getEmail());
		if(user !=null){
			if(user.getPassword().equals(user.getPassword())){
				return true;
			}
		}
		return false;
	}


	@Override
	public User getCurrentUser() {
		return user;
	}
	
	

}

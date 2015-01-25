package com.expensemanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.expensemanager.domain.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	@Query("SELECT c FROM User c")
	public List<User> getAllUsers();
	
	public User getUserByEmail(String email);
}

package com.expensemanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.expensemanager.domain.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long>{
	@Query("SELECT t FROM Transaction t WHERE t.user.userId = :id")
	public List<Transaction> getAllTransactions(@Param("id") Long id);
	
	
}

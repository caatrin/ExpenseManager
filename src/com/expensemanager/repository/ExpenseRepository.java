package com.expensemanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.expensemanager.domain.Expense;
@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>{

	@Query("SELECT e FROM Expense e WHERE e.user.userId = :id")
	public List<Expense> findAllExpenses(@Param("id") Long id);
}

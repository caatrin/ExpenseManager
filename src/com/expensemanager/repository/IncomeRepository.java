package com.expensemanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.expensemanager.domain.Income;

@Repository
public interface IncomeRepository extends CrudRepository<Income, Long> {
	@Query("SELECT i FROM Income i WHERE i.user.userId = :id")
	public List<Income> findAllIncomes(@Param("id")Long id);
   
}

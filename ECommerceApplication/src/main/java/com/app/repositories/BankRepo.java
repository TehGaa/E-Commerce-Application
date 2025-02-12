package com.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entites.Bank;

@Repository
public interface BankRepo extends JpaRepository<Bank, Long> {

	List<Bank> findAll();

	@Query("SELECT b FROM Bank b WHERE b.bankName = UPPER(?1)")
	Bank findByBankName(String bankName);
}

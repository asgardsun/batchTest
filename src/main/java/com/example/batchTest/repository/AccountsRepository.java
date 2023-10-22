package com.example.batchTest.repository;

import com.example.batchTest.domain.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository  extends JpaRepository<Accounts, Integer> {
}
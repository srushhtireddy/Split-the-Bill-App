package com.splitbill.splitbill.repository;

import com.splitbill.splitbill.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
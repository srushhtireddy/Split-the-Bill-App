package com.splitbill.splitbill.service;

import com.splitbill.splitbill.model.*;
import com.splitbill.splitbill.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SplitRepository splitRepository;

    public Expense addExpense(Expense expense, List<Long> userIds) {

        // ✅ STEP 1: Save expense first
        Expense savedExpense = expenseRepository.save(expense);

        // ✅ STEP 2: Get users
        List<User> users = userRepository.findAllById(userIds);

        // safety check
        if (users.isEmpty()) {
            throw new RuntimeException("No users found");
        }

        // ✅ STEP 3: Calculate split
        double splitAmount = expense.getAmount() / users.size();

        // ✅ STEP 4: Create splits
        for (User user : users) {
            Split split = new Split();
            split.setExpense(savedExpense);
            split.setUser(user);

            split.setAmount(splitAmount);
            split.setAmountOwed(splitAmount); // ⭐ IMPORTANT FIX

            splitRepository.save(split);
        }

        return savedExpense;
    }
}
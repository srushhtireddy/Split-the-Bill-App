package com.splitbill.splitbill.controller;

import com.splitbill.splitbill.dto.ExpenseRequest;
import com.splitbill.splitbill.model.Expense;
import com.splitbill.splitbill.model.User;
import com.splitbill.splitbill.service.ExpenseService;
import com.splitbill.splitbill.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public Expense addExpense(@RequestBody ExpenseRequest request) {

        Expense expense = new Expense();
        expense.setDescription(request.getDescription());
        expense.setAmount(request.getAmount());

        User paidByUser = userRepository.findById(request.getPaidBy())
                .orElseThrow(() -> new RuntimeException("User not found"));

        expense.setPaidBy(paidByUser);

        return expenseService.addExpense(expense, request.getUserIds());
    }
}
package com.splitbill.splitbill.dto;

import lombok.Data;
import java.util.List;

@Data
public class ExpenseRequest {

    private String description;
    private double amount;
    private Long paidBy;
    private List<Long> userIds;
}
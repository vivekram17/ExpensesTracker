package com.expensetracker.service;

import com.expensetracker.model.Expense;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {

    private final List<Expense> expenses = new ArrayList<>();
    private int nextId = 1;

    // Get all expenses
    public List<Expense> getAllExpenses() {
        return expenses;
    }

    // Add new expense
    public void addExpense(Expense expense) {
        expense.setId(nextId++);      // assign unique ID
        expenses.add(expense);        // save to in-memory list
        System.out.println("Added: " + expense.getAmount() + " " + expense.getCategory());
    }

    // Get expense by ID (for edit)
    public Expense getExpenseById(int id) {
        return expenses.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Update existing expense
    public void updateExpense(Expense expense) {
        Expense e = getExpenseById(expense.getId());
        if (e != null) {
            e.setAmount(expense.getAmount());
            e.setDate(expense.getDate());
            e.setCategory(expense.getCategory());
            e.setNote(expense.getNote());
        }
    }

    // Delete expense
    public void deleteExpense(int id) {
        expenses.removeIf(e -> e.getId() == id);
    }
}


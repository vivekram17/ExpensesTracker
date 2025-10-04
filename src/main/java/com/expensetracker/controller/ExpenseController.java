package com.expensetracker.controller;

import com.expensetracker.model.Expense;
import com.expensetracker.service.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    // Show all expenses + empty form for Add
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("expenses", expenseService.getAllExpenses());
        model.addAttribute("expense", new Expense());
        model.addAttribute("edit", false);
        return "index"; // ✅ returns template name, not Map
    }


    // Add new expense
    @PostMapping("/add")
    public String addExpense(@ModelAttribute Expense expense) {
        expenseService.addExpense(expense);
        return "redirect:/"; // redirect resets form and reloads table
    }

    // Delete expense
    @GetMapping("/delete/{id}")
    public String deleteExpense(@PathVariable int id) {
        expenseService.deleteExpense(id);
        return "redirect:/";
    }

    // Load expense into form for editing
    @GetMapping("/edit/{id}")
    public String editExpense(@PathVariable int id, Model model) {
        Expense expense = expenseService.getExpenseById(id);
        model.addAttribute("expense", expense);
        model.addAttribute("expenses", expenseService.getAllExpenses());
        model.addAttribute("edit", true); // Update mode
        return "index";
    }

    // Update expense
    @PostMapping("/update")
    public String updateExpense(@ModelAttribute Expense expense) {
        expenseService.updateExpense(expense);
        return "redirect:/"; // redirect reloads table and resets form
    }
}
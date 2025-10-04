package com.expensetracker.model;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private double amount;
    private LocalDate date;
    private String category;
    private String note;


    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }


    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }


    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }


    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }


    public String getNote() { return note; }
    public void setNote(String note) { this.note = note; }
}

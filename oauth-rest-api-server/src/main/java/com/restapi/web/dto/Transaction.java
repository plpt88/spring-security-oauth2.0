package com.restapi.web.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private BigDecimal amount;
    private String currency;
    private String status;
    private String description;
    private String notes;
    private String date;

    public Transaction() {
        super();
    }

    public Transaction(final long id, final String transaction_id) {
        super();

        this.id = id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }
}
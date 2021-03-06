package com.restapi.web.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String amount;
    private String fee_amount;
    private String currency;
    private Integer funding_method_id;
    private String status;
    private String description;
    private String notes;
    private String date;

    public Transaction() {
        super();
    }

    public Transaction(final long id) {
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

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
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

    public void setFee_amount(String fee_amount) {
        this.fee_amount = fee_amount;
    }

    public String getFee_amount() {
        return fee_amount;
    }

    public void setFunding_method_id(Integer funding_method_id) {
        this.funding_method_id = funding_method_id;
    }

    public Integer getFunding_method_id() {
        return funding_method_id;
    }
}
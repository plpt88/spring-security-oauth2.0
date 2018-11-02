package com.restapi.web.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Transfer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long unique_id;
    private String transaction_id;
    private String usage;
    private BigDecimal amount;
    private String currency;
    private String source_wallet_id;
    private String return_success_url;
    private String return_failure_url;
    private String status;
    private String date;

    public Transfer() {
        super();
    }

    public Transfer(final long unique_id, final String transaction_id) {
        super();

        this.unique_id = unique_id;
        this.transaction_id = transaction_id;
    }

    public void setUnique_id(final long unique_id) {
        this.unique_id = unique_id;
    }

    public long getUnique_id() {
        return unique_id;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(final String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getUsage() {
        return usage;
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

    public void setSource_wallet_id(String source_wallet_id) {
        this.source_wallet_id = source_wallet_id;
    }

    public String getSource_wallet_id() {
        return source_wallet_id;
    }

    public void setReturn_success_url(String return_success_url) {
        this.return_success_url = return_success_url;
    }

    public String getReturn_success_url() {
        return return_success_url;
    }

    public void setReturn_failure_url(String return_failure_url) {
        this.return_failure_url = return_failure_url;
    }

    public String getReturn_failure_url() {
        return return_failure_url;
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
}
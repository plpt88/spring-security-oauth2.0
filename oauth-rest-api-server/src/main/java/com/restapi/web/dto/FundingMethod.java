package com.restapi.web.dto;

import javax.persistence.*;

@Entity
public class FundingMethod {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private String type;
    private String status;

    @Embedded
    private FundingMethodDetails details;

    public FundingMethod() {
        super();
    }

    public FundingMethod(final long unique_id, final String transaction_id) {
        super();

        this.id = unique_id;
        this.name = transaction_id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setDetails(FundingMethodDetails details) {
        this.details = details;
    }

    public FundingMethodDetails getDetails() {
        return details;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
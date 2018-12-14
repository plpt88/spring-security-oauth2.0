package com.restapi.web.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fixed_amount;
    private String percentage;
    private String category;

    public Fee() {
        super();
    }

    public Fee(final String fixed_amount, final String percentage, final String category) {
        super();

        this.fixed_amount = fixed_amount;
        this.percentage = percentage;
        this.category = category;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setFixed_amount(String fixed_amount) {
        this.fixed_amount = fixed_amount;
    }

    public String getFixed_amount() {
        return fixed_amount;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}

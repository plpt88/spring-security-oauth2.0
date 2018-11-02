package com.restapi.web.dto;

public class FundingMethodDetails {
    private String bin;
    private String tail;
    private String expiration_date;

    public FundingMethodDetails() {
        super();
    }

    public FundingMethodDetails(final String bin, final String tail, final String expiration_date) {
        super();

        this.bin = bin;
        this.tail = tail;
        this.expiration_date = expiration_date;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBin() {
        return bin;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getTail() {
        return tail;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getExpiration_date() {
        return expiration_date;
    }
}
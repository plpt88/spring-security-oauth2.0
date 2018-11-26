package com.restapi.web.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String email;
    private String encoded_password;
    private String balance;
    private String currency;
    private String firstname;
    private String lastname;
    private String phone;
    private String birth_country;
    private String birth_date;
    private String address1;
    private String address2;
    private String billing_country;
    private String billing_city;
    private String billing_zipcode;


    public User() {
        super();
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEncoded_password(String encoded_password) {
        this.encoded_password = encoded_password;
    }

    public String getEncoded_password() {
        return encoded_password;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getBalance() {
        return balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setBirth_country(String birth_country) {
        this.birth_country = birth_country;
    }

    public String getBirth_country() {
        return birth_country;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress2() {
        return address2;
    }

    public void setBilling_country(String billing_country) {
        this.billing_country = billing_country;
    }

    public String getBilling_country() {
        return billing_country;
    }

    public void setBilling_city(String billing_city) {
        this.billing_city = billing_city;
    }

    public String getBilling_city() {
        return billing_city;
    }

    public void setBilling_zipcode(String billing_zipcode) {
        this.billing_zipcode = billing_zipcode;
    }

    public String getBilling_zipcode() {
        return billing_zipcode;
    }
}

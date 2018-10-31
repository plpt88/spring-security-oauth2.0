package com.oauth.web.controller;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.oauth.web.dto.Transaction;

@Controller
public class TransactionsController {

    public TransactionsController() {
        super();
    }

    // API - read
    @PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/transactions/{id}")
    @ResponseBody
    public Transaction findById(@PathVariable final long id) {
        return new Transaction(Long.parseLong(randomNumeric(2)), randomAlphabetic(4));
    }

    // API - write
    @PreAuthorize("#oauth2.hasScope('write') and hasRole('ROLE_ADMIN')")
    @RequestMapping(method = RequestMethod.POST, value = "/transactions")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Transaction create(@RequestBody final Transaction transaction) {
        transaction.setId(Long.parseLong(randomNumeric(2)));
        return transaction;
    }

}

package com.restapi.web.controller;

import com.restapi.web.dto.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

@Controller
public class UserController {

    public UserController() {
        super();
    }

    // API - read
    @PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/user")
    @ResponseBody
    public User getUserInfo() {
        User user = new User();
        user.setId(Long.parseLong(randomNumeric(10)));
        user.setEmail("mobileuser@ezeewallet.com");
        user.setBalance(new BigDecimal(50.00));
        user.setCurrency("EUR");

        return user;
    }
}

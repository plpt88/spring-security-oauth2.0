package com.restapi.web.controller;

import com.restapi.web.dto.Fee;
import com.restapi.web.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

@Controller
public class FeesController {

    @Autowired
    // Which is auto-generated by Spring, we will use it to handle the data
    private FeeRepository feeRepository;

    public FeesController() {
        super();
    }

    // API - read
    @PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/fees")
    @ResponseBody
    public Map<String, List<Fee>> getFee() {
        Map<String, List<Fee>> map = new HashMap<>();
        List<Fee> fundingMethods = (List<Fee>) feeRepository.findAll();
        map.put("funding_methods", fundingMethods);
        return map;
    }

    // API - write
    @PreAuthorize("#oauth2.hasScope('write')")
    @RequestMapping(method = RequestMethod.POST, value = "/fees")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Fee addFee(@RequestParam String fixed_amount, @RequestParam String percentage, @RequestParam String category) {
        Fee fee = new Fee();

        fee.setId(Long.parseLong(randomNumeric(2)));
        fee.setFixed_amount(fixed_amount);
        fee.setPercentage(percentage);
        fee.setCategory(category);

        feeRepository.save(fee);

        return fee;
    }
}

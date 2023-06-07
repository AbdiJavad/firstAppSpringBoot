package com.javad.firstappspringboot.controller;

import com.javad.firstappspringboot.model.Customer;
import com.javad.firstappspringboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController{
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public Customer findCustumer() {
        return customerService.findCustomer();
    }

}


package com.javad.firstappspringboot.service;

import com.javad.firstappspringboot.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public Customer findCustomer() {
        Customer customer = new Customer();
        customer.setFirstname("Ali");
        customer.setId(12);
        customer.setLastname("Sadeghi");
        customer.setAge(23);
        customer.setPhone(915523130);
        return customer;

    }

}

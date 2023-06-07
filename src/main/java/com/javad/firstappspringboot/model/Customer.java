package com.javad.firstappspringboot.model;

import lombok.Data;

@Data
public class Customer {
    private int id;
    private String firstname;
    private String Lastname;
    private int age;
    private long phone;
}

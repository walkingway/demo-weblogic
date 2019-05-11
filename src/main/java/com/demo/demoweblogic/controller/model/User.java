package com.demo.demoweblogic.controller.model;

public class User {
    private String customerId;

    public User(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }
}

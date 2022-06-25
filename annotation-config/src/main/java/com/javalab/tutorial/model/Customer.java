package com.javalab.tutorial.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Customer.class);

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void postConstruct(){
        LOGGER.info("Customer#postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        LOGGER.info("Customer#preDestroy");
    }
}

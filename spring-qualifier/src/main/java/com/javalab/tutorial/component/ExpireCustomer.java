package com.javalab.tutorial.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ExpireCustomer implements Customer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExpireCustomer.class);

    @Override
    public String getCustomerName() {
        LOGGER.info("ExpireCustomer#welcome");
        return "ExpireCustomer";
    }
}

package com.javalab.tutorial.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ActiveCustomer implements Customer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ActiveCustomer.class);

    @Override
    public String getCustomerName() {
        LOGGER.info("ActiveCustomer#getCustomerName");
        return "ActiveCustomer";
    }
}

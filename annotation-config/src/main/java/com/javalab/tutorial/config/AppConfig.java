package com.javalab.tutorial.config;

import com.javalab.tutorial.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.javalab.tutorial"})
public class AppConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppConfig.class);

    @Bean
    public Customer getCustomer() {

        LOGGER.info("AppConfig#getCustomer");

        Customer customer = new Customer();
        customer.setId(7L);
        customer.setName("Ali");
        return customer;
    }
}

package com.javalab.tutorial;

import com.javalab.tutorial.config.AppConfig;
import com.javalab.tutorial.model.Customer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ApplicationTest {

    private static Logger LOGGER = LoggerFactory.getLogger(ApplicationTest.class);
    static ConfigurableApplicationContext context;

    @BeforeAll
    public static void setup() {
        LOGGER.info("ApplicationTest#setup");
        LOGGER.info("Setting test environment");

        context = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void whenCustomerObjectCreatedBySpringContext_thenCustomerObjectMustBeCreatedCorrectly() {
        Customer customer = context.getBean("getCustomer", Customer.class);
        Assertions.assertThat(customer).isNotNull();
        Assertions.assertThat(customer.getId()).isEqualTo(7);
        Assertions.assertThat(customer.getName()).isEqualTo("Ali");
    }

    @AfterAll
    public static void cleanup() {
        LOGGER.info("ApplicationTest#cleanup");
        LOGGER.info("Cleaning test environment");

        context.close();
    }
}
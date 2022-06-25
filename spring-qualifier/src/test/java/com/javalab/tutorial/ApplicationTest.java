package com.javalab.tutorial;

import com.javalab.tutorial.component.Customer;
import com.javalab.tutorial.config.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
public class ApplicationTest {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationTest.class);

    @Autowired
    @Qualifier("activeCustomer")
    Customer customer;

    @Test
    public void whenUsingQualifier_thenAutowiredBeanShouldWorksCorrectly() {
        LOGGER.info("ApplicationTest#whenUsingQualifier_thenAutowiredBeanShouldWorksCorrectly");
        Assertions.assertThat(customer.getCustomerName()).isEqualTo("ActiveCustomer");
    }
}

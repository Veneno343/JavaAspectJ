package com.kurvasoft.config;

import com.kurvasoft.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.kurvasoft")
public class AspectConfig {

    @Bean
    public CustomerService customerService() {
        return new CustomerService();
    }

}

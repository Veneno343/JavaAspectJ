package com.kurvasoft;

import com.kurvasoft.config.AspectConfig;
import com.kurvasoft.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AspectConfig.class);
        context.refresh();
     
        CustomerService customerService = context.getBean(CustomerService.class);
        customerService.addName("Jonathan");
        customerService.getName();
        customerService.addBalance(1500000);
        customerService.getBalance();


    }
}

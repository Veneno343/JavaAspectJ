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

<<<<<<< HEAD
        
        CustomerService customerService = context.getBean(CustomerService.class);
        customerService.add(5, 34);
        customerService.setName("Jonathan");
        customerService.getName();
=======
        CustomerService customerService = context.getBean(CustomerService.class);
        customerService.add(5, 34);
>>>>>>> 0c7a517b06a76daf836b3d5dfad8fd5a453f8f6f
    }
}

package com.kurvasoft.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

<<<<<<< HEAD
    private String name;
    
    /**
     * Summary of 2 numbers and give the result
     * @param a
     * @param b
     * @return 
     */
=======
>>>>>>> 0c7a517b06a76daf836b3d5dfad8fd5a453f8f6f
    public Integer add(int a, int b) {

        int result = a + b;
        System.out.println(a + " + " + b + " = " +result);
        return result;
    }
<<<<<<< HEAD
    
    /**
     * Set the super var : Name with new value
     * @param name 
     */
    
    public void setName(String name) {
        System.out.println("Name is set with value : " + name);
        this.name = name;
    }
    
    /**
     * Return the last var : Name value
     * @return
     */
    
    public String getName() {
        System.out.println("Name is returned with value : " + name);
        return name;
    }
=======
>>>>>>> 0c7a517b06a76daf836b3d5dfad8fd5a453f8f6f
}

package com.kurvasoft.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private String name;
    
    /**
     * Summary of 2 numbers and give the result
     * @param a
     * @param b
     * @return 
     */
    public Integer add(int a, int b) {

        int result = a + b;
        System.out.println(a + " + " + b + " = " +result);
        return result;
    }
    
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
}

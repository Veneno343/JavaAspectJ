package com.kurvasoft.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public Integer add(int a, int b) {

        int result = a + b;
        System.out.println(a + " + " + b + " = " +result);
        return result;
    }
}

package com.kurvasoft.service;

import com.kurvasoft.annotations.Transactions;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private String name;
    private double balance;
    private double withdraw;
    private double deposit;
    
    /**
     * Set new name for account
     * @param name
     */
    public void addName(String name) {
        this.name = name;
        System.out.println("--- Your new name is : " + name + " and succesfully updated to your account");
    }
    
    /**
     * Send money amount to the user balance
     * @param amount 
     */
    @Transactions
    public void addBalance(double amount) {
        this.balance = this.balance + amount;
        System.out.println("--- You have been added : " + amount + " to your account");
    }
    
    /**
     * Withdraw money from user account
     * Remove balance as many as withdraw amount
     * @param amount 
     */
    @Transactions
    public void withdrawBalance(double amount) {
        this.balance = this.balance - amount;
        System.out.println("--- You have taken : " + amount + " from your account");
    }
    
    /**
     * Deposit account balance for invest
     * Balance removed as many as deposited money
     * @param amount 
     */
    @Transactions
    public void depositBalance(double amount) {
        this.balance = this.balance - amount;
        this.deposit = amount;
        System.out.println("--- You added : " + amount + " to your deposit account");
    }
    
    
    /**
     * Return current name of user
     * @return 
     */
    public String getName() {
        System.out.println("--- Your current account name is : " + name);
        return name;
    }
    
    /**
     * Return current balance of user
     * @return 
     */
    public double getBalance() {
        System.out.println("--- Your current balance is : " + balance);
        return balance;
    }
    
}

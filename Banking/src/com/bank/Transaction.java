package com.bank;

import java.util.*;
public class Transaction {
    private int accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    Scanner s = new Scanner(System.in);    

    public void setAccountData(){
        System.out.println("Enter a new account number:");
        this.accountNumber=s.nextInt();
        System.out.println("Enter Deposit at account opening:");
        this.balance=s.nextFloat();
        s.nextLine();
        System.out.println("Enter Customer Name:");
        this.customerName=s.nextLine();
        System.out.println("Enter Email ID:");
        this.email=s.nextLine();
        System.out.println("Enter Phone Number:");
        this.phoneNumber=s.nextLine();
    }
    public void getAccountData() {
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance        : Rs"+balance);
        System.out.println("Customer Name  : "+customerName);
        System.out.println("Email ID       : "+email);
        System.out.println("Phone Number   : "+phoneNumber);
    }
    public void credit(float rs){
        balance+=rs;
        System.out.println("Deposit of RS"+rs+". New Balance: Rs"+balance);
    }
    public void debit(float rs) {
        balance -= rs;
        System.out.println("Deposit of RS"+rs+". New Balance: Rs"+balance);
    }
}

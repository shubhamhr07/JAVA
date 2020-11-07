package com.bank;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String eMail;
    public VipCustomer(){
        this("Default",10000,"Default");
        System.out.println("Empty Constructor");
    }
    public VipCustomer(String name,int creditLimit){
        this(name,creditLimit,"Default");
        System.out.println("2 Parameters Defined");
    }
    public VipCustomer(String name,int creditLimit ,String eMail){
        this.name=name;
        this.creditLimit=creditLimit;
        this.eMail=eMail;
        System.out.println("3 Parameters defined");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEail() {
        return eMail;
    }
}

package com.bank;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Transaction t1 = new Transaction();
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("1.Create New Account\t2. Old Account Details\t3. Credit\n4. Debit\t5. VIP\t6. Exit\nEnter your choice ");
            int ch=s.nextInt();
            if(ch==1)
                t1.setAccountData();
            else if(ch==2)
                t1.getAccountData();
            else if(ch==3) {
                System.out.println("Enter the amount you want to Credit");
                int crs = s.nextInt();
                t1.credit(crs);
            }
            else if(ch==4) {
                System.out.println("Enter the amount you want to Debit");
                int drs = s.nextInt();
                t1.debit(drs);
            }
            else if (ch==5){
                while(true) {
                    System.out.println("1. no Parameters\t2. 2 Parameters\t3. 3 Parameters\t4. Exit");
                    int n = s.nextInt();
                    if (n==1){
                        VipCustomer vip1 = new VipCustomer();
                        System.out.println("name         = " + vip1.name);
                        System.out.println("Credit Limit = " + vip1.creditLimit);
                        System.out.println("E-mail       = " + vip1.eMail);
                    }
                    else if(n==2){
                        VipCustomer vip1 = new VipCustomer("shubham",50000);
                        System.out.println("name         = " + vip1.name);
                        System.out.println("Credit Limit = " + vip1.creditLimit);
                        System.out.println("E-mail       = " + vip1.eMail);
                    }
                    else if(n==3) {
                        VipCustomer vip1 = new VipCustomer("shubham", 50000, "Shubhamhr07@gmail.com");
                        System.out.println("name         = " + vip1.name);
                        System.out.println("Credit Limit = " + vip1.creditLimit);
                        System.out.println("E-mail       = " + vip1.eMail);
                    }
                    else{
                        System.exit(0);
                    }
                }
            }
            else
                System.exit(0);
        }
    }
}

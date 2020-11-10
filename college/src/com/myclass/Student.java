package com.myclass;

import java.util.Scanner;

public class Student {
    Scanner s = new Scanner(System.in);
    public int rollNo;
    public String name;
    public String course;

    public void newData(){
        System.out.println("Enter Roll number");
        rollNo = s.nextInt();
        s.nextLine();
        System.out.println("Enter Name");
        name = s.nextLine();
        System.out.println("Enter Course");
        course = s.nextLine();
    }
    public void display() {
        System.out.println("Roll No. :" + rollNo);
        System.out.println("Name     :" + name);
        System.out.println("Course   :" + course);
    }
}

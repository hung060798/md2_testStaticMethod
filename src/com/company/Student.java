package com.company;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    //constructor to initialize the variable
    Student(int r, String n){
        this.rollno = r;
        this.name =n;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }

}

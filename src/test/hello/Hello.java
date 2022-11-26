package test.hello;


import  com.test.demo.Test.*;
import com.test.demo.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

import static test.hello.Demo.*;
class Student {
    public String name;
    private int roll_No;
    public String getName() { return name; }
    public void setName(String demo) {
        name = demo;
    }
    public int getRoll_no() { return roll_No; }
    public void setRoll_no(int roll_no)
    {
        this.roll_No = roll_no;
    }
}
public class Hello{
    public static void main(String[] args) {
        double no = 1.5;
        System.out.println(Math.floor(no));
        System.out.println(Math.ceil(no));


    }
}


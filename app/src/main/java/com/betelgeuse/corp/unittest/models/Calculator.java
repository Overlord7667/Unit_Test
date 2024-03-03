package com.betelgeuse.corp.unittest.models;

public class Calculator {
    int a;
    int b;


    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {

    }

    public int add(){
        return a + b;
    }

    public int subtract(){
        return a - b;
    }

    public int multiply(){
        return a * b;
    }

    public int divide(){
        return a / b;
    }
}

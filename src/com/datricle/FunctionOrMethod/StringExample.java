package com.datricle.FunctionOrMethod;

public class StringExample {
    public static void main(String[] args) {
        //System.out.println(name());
        System.out.println(myName("Deep"));
    }

    static String myName(String name){
        return name;
    }

    static String name() {
        return "Deepanshu Sehgal";
    }
}

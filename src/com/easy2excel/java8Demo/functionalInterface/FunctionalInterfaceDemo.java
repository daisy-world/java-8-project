package com.easy2excel.java8Demo.functionalInterface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void showMessage();

    default  void defaultMethodDemo(){
        System.out.println("it is a default method");
    }

    static void staticMethodDemo(){
        System.out.println("it is a static method");
    }
}

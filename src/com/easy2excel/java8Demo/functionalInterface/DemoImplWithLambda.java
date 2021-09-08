package com.easy2excel.java8Demo.functionalInterface;

public class DemoImplWithLambda {

    public static void main(String[] args) {

        FunctionalInterfaceDemo demo = () ->System.out.println("this is a implementation of showMessage() method using lambda");
        demo.showMessage();
    }

}

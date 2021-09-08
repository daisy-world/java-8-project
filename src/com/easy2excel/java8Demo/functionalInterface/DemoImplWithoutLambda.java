package com.easy2excel.java8Demo.functionalInterface;

public class DemoImplWithoutLambda implements  FunctionalInterfaceDemo{
    @Override
    public void showMessage() {
        System.out.println("this is a implementation of showMessage() method");
    }

    public static void main(String[] args) {

        DemoImplWithoutLambda demo = new DemoImplWithoutLambda();
        demo.showMessage();
    }
}

package com.easy2excel.java8Demo.functionalInterface;

import java.util.function.Consumer;

public class ConsumerExample1 {
    public static void main(String[] args) {

        Consumer<Integer> c = num-> System.out.println("number is " + num);
        c.accept(10);
    }
}

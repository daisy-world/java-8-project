package com.easy2excel.java8Demo.functionalInterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> s = ()->Math.random();
        System.out.println("value is...." +s.get());
    }
}

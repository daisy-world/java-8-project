package com.easy2excel.java8Demo.functionalInterface;

import java.util.function.Function;

public class FunctionExample1 {
    public static void main(String[] args) {
        Function<String,Integer> f = name->name.length();
        Integer length = f.apply("Lipsa");
        System.out.println("length of the name is ... " + length);
    }
}

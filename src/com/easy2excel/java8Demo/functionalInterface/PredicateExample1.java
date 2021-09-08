package com.easy2excel.java8Demo.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String[] args) {

        Predicate<Integer> p= i->i>18;
        if(p.test(10)){
            System.out.println("age is greater than 18..");
        }

    }
}

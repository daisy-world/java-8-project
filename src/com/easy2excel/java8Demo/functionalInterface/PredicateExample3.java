package com.easy2excel.java8Demo.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        predicateDemo(21,age->age>18);

    }

     /*predicate inside a function or method */
    public static void predicateDemo(Integer number, Predicate<Integer> p){

        if(p.test(number)){
            System.out.println("eligible for voting...");
        }

    }
}

package com.easy2excel.java8Demo.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {

       /*Predicate chaining*/
        Predicate<String> p1 = name->name.contains("L");
        Predicate<String> p2 = name->name.length()>5;

        if(p1.or(p2).test("Lipsa")){
            System.out.println("condition satisfied");
        }else{
            System.out.println("condition not satisfied");
        }

    }
}

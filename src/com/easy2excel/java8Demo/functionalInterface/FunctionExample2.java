package com.easy2excel.java8Demo.functionalInterface;

import java.util.function.Function;

public class FunctionExample2 {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = x->x*2;
       Integer result =  f1.apply(10);
        System.out.println("result is ..."  + result);
    }
}

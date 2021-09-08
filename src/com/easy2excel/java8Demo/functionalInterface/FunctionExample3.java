package com.easy2excel.java8Demo.functionalInterface;

import java.util.function.Function;

public class FunctionExample3 {
    public static void main(String[] args) {
        /*function chaining*/
        Function<String,Integer> f = name->name.length(); //5
        Function<Integer,Integer> f1 = x->x*2;  //10
      Integer result =   f.andThen(f1).apply("Lipsa");
        System.out.println("result is ..."  + result);

    }
}

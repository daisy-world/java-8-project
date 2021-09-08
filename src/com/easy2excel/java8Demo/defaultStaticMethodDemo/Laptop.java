package com.easy2excel.java8Demo.defaultStaticMethodDemo;

public interface Laptop {

    default void doVideoCall (){
        System.out.println("default video call facility inside laptop");
    }
}

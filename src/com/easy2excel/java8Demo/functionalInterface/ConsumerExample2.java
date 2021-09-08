package com.easy2excel.java8Demo.functionalInterface;

import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {

        Employee emp = new Employee();
        Consumer<Employee> c = e->e.setName("Lipsa");
        c.accept(emp);
        System.out.println("employee name... " + emp.getName());
    }
}

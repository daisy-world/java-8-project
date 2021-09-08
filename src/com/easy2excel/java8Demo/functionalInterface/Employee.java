package com.easy2excel.java8Demo.functionalInterface;

public class Employee {

    private String name;

    private String email;

    private int age;

    private float salary;


    public Employee() {

    }

    public Employee(String name, String email, int age, float salary) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
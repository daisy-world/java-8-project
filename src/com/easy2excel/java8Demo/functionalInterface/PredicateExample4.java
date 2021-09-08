package com.easy2excel.java8Demo.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample4 {
    public static void main(String[] args) {

        /*Predicate in Collection */
        List<Employee> empList = getEmpList();
        Predicate<Employee> p = emp->emp.getAge()>25;
        Predicate<Employee> p1=emp->emp.getSalary()>25000;

        for (Employee emp:empList ) {
           if(p.and(p1).test(emp)){
               System.out.println("employee name ........ "  + emp.getName() );
           }

        }


    }

    public static List<Employee> getEmpList() {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Lipsa", "lipsa@gmail.com", 25, 25000));
        employeeList.add(new Employee("Daisy", "daisy@gmail.com", 28, 30000));
        employeeList.add(new Employee("Supriya", "supriya@gmail.com", 30, 50000));
        employeeList.add(new Employee("Krishna", "krish@gmail.com", 22, 15000));
        return employeeList;
    }

}

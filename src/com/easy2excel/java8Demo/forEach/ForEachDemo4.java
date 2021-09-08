package com.easy2excel.java8Demo.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo4 {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();
        userList.add(new User(100L,"Lipsa","lipsa@gmail.com"));
        userList.add(new User(101L,"Daisy","daisy@gmail.com"));
        userList.add(new User(102L,"Supriya","supriya@gmail.com"));

        userList.stream().forEach(user->{
            System.out.println(user.getEmail());
            System.out.println(user.getName());
            System.out.println("===================");
        });

    }


}

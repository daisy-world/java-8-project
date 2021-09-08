package com.easy2excel.java8Demo.forEach;

import java.util.HashSet;
import java.util.Set;

public class ForEachDemo2 {
	
	public static void main(String[] args) {

		Set<User> set = new HashSet<>();

		set.add(new User(100L,"Lipsa","lipsa@gmail.com"));
		set.add(new User(101L,"Daisy","daisy@gmail.com"));
		set.add(new User(102L,"Supriya","supriya@gmail.com"));

		// before java 8
		for (User user : set) {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println("===================");
		}

		// using forEach() Method
		System.out.println("using forEach() method...");

		set.forEach(user->{
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println("===================");
		});
		
	}


}

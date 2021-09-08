package com.easy2excel.java8Demo.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo1 {
	
	
	public static void main(String[] args) {

		List<User> userList = new ArrayList<User>();

		userList.add(new User(100L,"Lipsa","lipsa@gmail.com"));
		userList.add(new User(101L,"Daisy","daisy@gmail.com"));
		userList.add(new User(102L,"Supriya","supriya@gmail.com"));

		// before java 8
		for (User user : userList) {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println("===================");
		}

		// by using forEach()
		System.out.println("using forEach() method...");
		userList.forEach(user -> {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println("===================");
		});

		
	}
	
	
	
	


}

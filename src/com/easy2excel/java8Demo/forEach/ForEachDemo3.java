package com.easy2excel.java8Demo.forEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ForEachDemo3 {
	
	public static void main(String[] args) {

		Map<Integer ,User> map = new HashMap<Integer ,User>();
		map.put(1, new User(100L,"Lipsa","lipsa@gmail.com"));
		map.put(2, new User(101L,"Daisy","daisy@gmail.com"));
		map.put(3, new User(102L,"Supriya","supriya@gmail.com"));

	// before java 8
		for (Map.Entry<Integer,User> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("===================");
		}

		System.out.println("using forEach() method..");

		map.forEach((key,value)->{
			System.out.println(key);
			System.out.println(value);

		});
		
	}
	


}

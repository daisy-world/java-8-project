package com.easy2excel.java8Demo.optionalClass;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) throws Exception {

        String email =null;
        // create an empty optional
        Optional<String> emptyOptionalEmail = Optional.empty();
       // System.out.println(emptyOptionalEmail);
        // create an optional with non-null value
       // Optional<String> nonNullOptionalEmail = Optional.of(email);
        //System.out.println(nonNullOptionalEmail);

        Optional<String> optionalEmail2 = Optional.ofNullable(email);
       // System.out.println(optionalEmail2);
        // create an optional with value may  present or may not present

        // isPresent() method to check the presence of value
        if (optionalEmail2.isPresent()){
           // System.out.println("value is prsent");
        }

        // ifPresent() method to check the presence of value

        optionalEmail2.ifPresent(value-> System.out.println("value is present.."));

        // get() method to retrieve the value
        if (optionalEmail2.isPresent()) {
          //  System.out.println(optionalEmail2.get());
        }

      //  System.out.println(optionalEmail2.orElse("default email is  abc@gmail.com" ));

      //  System.out.println(optionalEmail2.orElseGet(()->"default email is  abc@gmail.com"));

        System.out.println(optionalEmail2.orElseThrow(()-> new Exception("email is not present")));

    }
}

package com.easy2excel.java8Demo.defaultStaticMethodDemo;

public interface Mobile {
    void doVoiceCall();

    default void doVideoCall (){
        System.out.println("default video call facility inside mobile");
    }

    static void sendSms(){
        System.out.println("send sms facility available inside mobile");
    }



}

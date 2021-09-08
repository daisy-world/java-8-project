package com.easy2excel.java8Demo.defaultStaticMethodDemo;

public class Nokia implements Mobile,Laptop{

    @Override
    public void doVoiceCall() {
        System.out.println("voice call implementation inside Nokia ");
    }

    @Override
    public void doVideoCall(){
        //System.out.println("video call facility inside Nokia");
        //Mobile.super.doVideoCall();
        Laptop.super.doVideoCall();

    }


}

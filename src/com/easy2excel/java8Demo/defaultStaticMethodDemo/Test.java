package com.easy2excel.java8Demo.defaultStaticMethodDemo;

public class Test {
    public static void main(String[] args) {

        Mobile m = new Nokia();
        m.doVoiceCall();
        m.doVideoCall();

        Mobile.sendSms();
    }

}

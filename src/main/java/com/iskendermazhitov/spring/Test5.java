package com.iskendermazhitov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.voice();
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.voice();
        context.close();
        myDog.destroy();
        yourDog.destroy();
    }
}

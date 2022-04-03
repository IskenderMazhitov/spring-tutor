package com.iskendermazhitov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog myDog = context.getBean("dog", Dog.class);
//        Person person = context.getBean("personBean", Person.class);
//        System.out.println(person.getPet() == myDog);
        Person person = context.getBean("personBean", Person.class);
//        person.pet.destroy();
        context.close();
        myDog.destroy();
    }
}

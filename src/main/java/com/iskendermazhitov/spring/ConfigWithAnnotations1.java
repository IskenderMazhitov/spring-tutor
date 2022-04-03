package com.iskendermazhitov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.voice();
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        Person baistan = context.getBean("personBean", Person.class);



        context.close();

    }
}

package com.iskendermazhitov.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MaConf.class);
//        context.getBean()
        Person person = context.getBean("personBean", Person.class);

    }
}

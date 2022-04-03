package com.iskendermazhitov.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("catBean")
//@Scope("prototype")
public class Cat implements Pet{
    public Cat(){
        System.out.println("Cat bean is created");
    }
    @Override
    public void voice(){
        System.out.println("Meow-Meow");
    }
}

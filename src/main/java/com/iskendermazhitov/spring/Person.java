package com.iskendermazhitov.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("personBean")
//@Scope("prototype")
public class Person {


//    @Autowired
//    @Qualifier(value = "catBean")
    public Pet pet;
    @Value("isken")
    private String name;
    @Value("19")
    private int age;

//    public Person(){
//        System.out.println("Person bean is created");
//    }
    @Autowired

    public Person(@Qualifier("dog")Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){return this.name;}
    public int getAge(){return this.age;}

//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet){
        System.out.println("Class person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet! I'm " + this.name + " " + this.age);
        pet.voice();
    }
    public Pet getPet(){
        return this.pet;
    }


/*
Pet pet = new Dog(); - downcasting
Dog dog = new Pet(); - upcasting
 */



}

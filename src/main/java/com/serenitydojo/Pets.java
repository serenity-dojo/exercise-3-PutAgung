package com.serenitydojo;

public class Pets {
    private final String name;
     public String getName(){
         return name;
     }

     private final int age;
     public int getAge(){
         return age;
     }
    public Pets (String name,int age){
        this.name=name;
        this.age=age;
    }
}

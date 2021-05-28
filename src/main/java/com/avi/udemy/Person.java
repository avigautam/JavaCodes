package com.avi.udemy;

public class Person {
    public String name;
    public void Person() {
        name = "James";
    }
    public static void main(String [] args) {
        Person person = new Person();
        Person obj = person;
        System.out.println(obj.name);
        Runnable r = () -> {
            int i = 0;
            if(i != 1){

            }
        };
    }

}

package com.avi.oopsbasic;

public class OopsbasicTestClass {

    public static void main(String[] args) {
        User user1 = new User();

        // Dot Operator
        user1.setFname("Mohit");
        user1.setLname("Gautam");

        print(user1);

    }


    public static void print(User user){
        System.out.println("First Name: " + user.getFname() + " Last name: " + user.getLname());
    }
}

package com.avi.java11;

interface Dances {
    String swingArms();
    void swingLegs();
}
interface EatsFish {
    CharSequence swingArms();
    void swingLegs();
}

public class MethodConflictCaseInInterface implements Dances, EatsFish {
    public String swingArms() {
        return "swing!";
    }
    public void swingLegs(){
        System.out.println("SwingLegs");
    }

    public static void main(String[] args) {
        Number tickets = 5;
        Dances d = null;
        if (d instanceof Rope){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
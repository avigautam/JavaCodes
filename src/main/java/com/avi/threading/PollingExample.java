package com.avi.threading;

public class PollingExample {
    public static int counter = 0;
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                PollingExample.counter++;
            }
        }).start();
        while (PollingExample.counter <100){
            System.out.println("Not Reached");
        }
        System.out.println("Reached");
    }
}

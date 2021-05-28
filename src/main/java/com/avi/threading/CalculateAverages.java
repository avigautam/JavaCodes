package com.avi.threading;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CalculateAverages implements Runnable{

    private int[] marks;
    private double average;

    public CalculateAverages( int[] marks) {
        this.marks = marks;
    }

    @Override
    public void run() {
        System.out.println("Thread name: "+Thread.currentThread().getName());
        average = Arrays.stream(marks).average().getAsDouble();
    }

    public double getAverage(){
        return average;
    }
}

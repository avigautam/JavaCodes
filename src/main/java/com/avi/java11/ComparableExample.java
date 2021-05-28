package com.avi.java11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableExample implements Comparable<ComparableExample>{
    private String name;

    public ComparableExample(String name){
        this.name = name;
    }

    @Override
    public int compareTo(ComparableExample o){
        return name.compareTo(o.name);
    }
    @Override
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        var list = new ArrayList<ComparableExample>();
        list.add(new ComparableExample("Xavier"));
        list.add(new ComparableExample("James"));
        list.add(new ComparableExample("Jason"));
        Collections.sort(list);
        System.out.println(list);
    }

}

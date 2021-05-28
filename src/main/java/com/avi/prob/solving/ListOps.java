package com.avi.prob.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOps {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4);
        List<Integer> li1 = Arrays.asList(1,2,3,4);
        List<Integer> lb =  li.stream().filter( d -> li1.stream().filter( e -> d > e ).count() >0 ).collect(Collectors.toList());

        lb.stream().forEach(System.out::println);








        //li.add(1,5);
        //System.out.println(li.stream().peek(System.out::println));

        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Mango");
        list.add("Pears");
        list.add(0,"Papaya");
        list.remove(0);

        list.forEach(System.out::println);
    }

    public static void noReturn(){
        System.out.println("No return");
        return;
    }
}

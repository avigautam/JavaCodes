package com.avi.threading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;

public class MainTest {
    public static void main(String[] args) {

        int [] a = new int[]{1,2,3,4,5};
        CalculateAverages averages = new CalculateAverages(a);
        averages.run();
        System.out.println("Average:" + averages.getAverage());
        Thread t1 = new Thread(averages);
        t1.start();
        t1.setName("t1");

        long sum = Arrays.stream(a).mapToLong(i -> (long) i).sum();
        List<Long> ll = new ArrayList<>();
        ll.add(12l);
        ll.add(12l);
        System.out.println(ll.stream().mapToLong(i -> i).sum());


        int[] aa = new int[] {4,2,3,4};
        List<Integer> li = new ArrayList<>();
        li.add(3);
        li.add(3);
        li.add(4);
        li.add(5);li.add(5);li.add(5);
        //Arrays.stream(aa).collect(groupingBy(i -> i, counting())));

        //System.out.println(li.stream().collect(groupingBy(i -> i, collectingAndThen(counting(), Long::intValue))));



    }
}

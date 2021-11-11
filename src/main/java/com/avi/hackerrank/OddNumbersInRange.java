package com.avi.hackerrank;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class OddNumbersInRange {
    public static void main(String[] args) {
        Integer i = new Integer(128);
        int in = 10;
        System.out.println(i.byteValue());
        Integer im = Integer.valueOf(in);
        System.out.println(im.byteValue());

        byte a =1, b=2, c=0 ;
        b =+ 8;
        byte d = (byte)(a + b);

        int e = 0b101;
        e =(e)^2;
        //int
        System.out.println(e);
        System.out.println(b^7);

    }

    public static List<Integer> oddNumbers(int l, int r) {

       /* Map<String, List<Integer>> li = IntStream.range(l, r+1).map(Integer::intValue).collect( partitioningBy(i-> (i%2 != 0)));, mapping(Integer::intValue, toList())));
        *//*IntStream.range(l, r+1).filter(i -> (i%2 != 0)).collect( groupingBy( ))*//*
*/
        return null;
    }
}

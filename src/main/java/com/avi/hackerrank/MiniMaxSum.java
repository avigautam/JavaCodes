package com.avi.hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;

public class MiniMaxSum {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 6);
        miniMaxSum(l);

    }
    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
        System.out.print(arr.stream().limit(4).mapToLong(Integer::longValue).sum());
        System.out.print(" " +arr.stream().skip(1).mapToLong(Integer::longValue).sum());

    }
}

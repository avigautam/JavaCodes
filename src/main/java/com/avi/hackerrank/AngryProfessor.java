package com.avi.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class AngryProfessor {
    public static void main(String[] args) {
        List<Integer> stu = Arrays.asList(-1, -3, 4, 2);
        System.out.println(angryProfessor(3, stu));

    }

    public static String angryProfessor(int k, List<Integer> a) {
        int cnt = (int)a.stream().filter(i1 -> i1 <=0).count();
        //System.out.println(cnt);
        return cnt>= k ? "NO" : "YES";
                /*.collect(counting(),
                                collectingAndThen(toList(), Long::intValue ) , Collectors::toList);*/

                        //collectingAndThen(mapping(intFun, counting())), Collectors::toList);

    }
}

package com.avi.java11;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Chapter6LambdasAndFunctionalInterfaces {
    int age;
    public static void main(String[] args) {
        System.out.println("=========== Ques1 ===========");
            Chapter6LambdasAndFunctionalInterfaces p1 = new Chapter6LambdasAndFunctionalInterfaces();
            p1.age = 1;
            check(p1, p -> p.age < 5);
        System.out.println("=========== Ques2 ===========");
            //Var can be used in lambda expression
            BiPredicate<String, String> pred = ( var s1, var s2) ->{
                return false;
            };

        System.out.println("=========== Ques3 ===========");
            Set<String> set = Set.of("mickey", "minnie");
            List<String> list = new ArrayList<>(set);

            set.forEach(s -> System.out.println(s));
            list.forEach(s -> System.out.println(s));

        System.out.println("=========== Ques4 ===========");
        int length = 3;

            for (int i = 0; i<3; i++) {
                if (i%2 == 0) {
                    Supplier<Integer> supplier = () -> length; // A
                    System.out.println(supplier.get());        // B
                } else {
                    int j = i;                                 // here j in local variable and hence allowed in lambda
                    Supplier<Integer> supplier = () -> j;      // C
                    System.out.println(supplier.get());        // D
                }
            }

        System.out.println("=========== Ques5 ===========");
        List<Character> chars = Arrays.asList('A','B');
            char end = 'z';
            //chars = null;
            chars.removeIf(c -> {
                char start = 'a'; return start <= c && c <= end; });
        System.out.println("=========== Ques6 ===========");
            final ArrayList<String> values = new ArrayList<>();
            values.add("A");
            values.add("A");
            values.add("A");
            values.add("A");
            values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");values.add("A");
            values.add("A");

        System.out.println("=========== Ques7 ===========");
        System.out.println("=========== Ques8 ===========");
        System.out.println("=========== Ques9 ===========");
        System.out.println("=========== Ques10 ===========");
        System.out.println("=========== Ques11 ===========");
        System.out.println("=========== Ques12 ===========");
        System.out.println("=========== Ques13 ===========");
        System.out.println("=========== Ques14 ===========");
        System.out.println("=========== Ques15 ===========");
    }
    public void method() {
        x((var x) -> {}, (var x, var y) -> 0);
    }
    public void x(Consumer<String> x, Comparator<Boolean> y) {
    }

      private static void check(Chapter6LambdasAndFunctionalInterfaces panda, Predicate<Chapter6LambdasAndFunctionalInterfaces> pred) {
        String result = pred.test(panda) ? "match" : "not match";
        System.out.println(result);
        }
}

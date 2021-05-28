package com.avi.java11;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Chapter15FunctionalProgramming {
    public static void main(String[] args) {
        System.out.println("=========== Ques1 ===========");
            var stream12 = Stream.iterate("", (s) -> s + "1");
            System.out.println(stream12.limit(4).map(x -> x + "2").collect(Collectors.toList()));
        System.out.println("=========== Ques2 ===========");
            Predicate<String> predicate = s -> s.startsWith("g");
            var stream1 = Stream.generate(() -> "growl!");
            var stream2 = Stream.generate(() -> "growl!");
            var b1 = stream1.limit(1).anyMatch(predicate);
            var b2 = stream2.limit(1).allMatch(predicate);
            System.out.println(b1 + " " + b2);
        System.out.println("=========== Ques3 ===========");
            Predicate<String> predicate1 = s -> s.length()> 3;
            var stream = Stream.iterate("-",
                    s -> ! s.isEmpty(), (s) -> s + s);
            //var b11 = stream.noneMatch(predicate1);
            //var b21 = stream.anyMatch(predicate1);
            //System.out.println(b11 + " " + b21);

        System.out.println("=========== Ques4 ===========");
        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int)x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
            System.out.println(result);

        double result1 = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
            System.out.println(result1);

        double result2 = LongStream.of(6L, 8L, 10L)
                .mapToInt(x ->  (int)x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
            System.out.println(result2);

        Map<Object, Set<Integer>> map1 = LongStream.of(6L, 8L, 10L)
                .mapToInt(x ->  (int)x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()));
            map1.keySet().forEach(System.out::println);
            map1.values().forEach(System.out::println);
        System.out.println("=========== Ques5 ===========");
            var copy = new ArrayList<String>();
            copy.add("James");
            copy.add("Jill");
            copy.add("Jason");
            //Descending sorting
            Collections.sort(copy, (a, b) -> b.compareTo(a));
            copy.forEach(System.out::println);

            //Descending sorting
            copy.stream().sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("=========== Ques6 ===========");
            var is = IntStream.empty();
            //OptionalDouble a = is.average(); -> average() returns OptionalDouble
            //OptionalInt a = is.findAny();
            //int a = is.sum();
        System.out.println("=========== Ques7 ===========");
            List<Integer> x11 = IntStream.range(1, 6)
                    .mapToObj(i -> i)
                    .collect(Collectors.toList());
            x11.forEach(System.out::println);
            System.out.println("======next=====");
            IntStream.range(1, 6)
                    .forEach(System.out::println);
            System.out.println("======next=====");
            IntStream.range(1, 6)
                    .mapToObj(i -> i)
                    .forEach(System.out::println);
        System.out.println("=========== Ques8 ===========");
            var s = DoubleStream.of(1.2, 2.4);
            s.peek(System.out::println).filter(x1 -> x1> 2).count();

        System.out.println("=========== Ques9 ===========");
            var streaml = LongStream.of(1, 2, 3);
            var opt = streaml.map(n -> n * 10)
                .filter(n -> n < 5).findFirst();
            if (opt.isPresent())
            System.out.println(opt.getAsLong());
            opt.ifPresent(System.out::println);

        System.out.println("=========== Ques10 ===========");
            List<Integer> x1 = List.of(1, 2, 3);
            List<Integer> x2 = List.of(4, 5, 6);
            List<Integer> x3 = List.of();
            Stream.of(x1, x2, x3)
                    .flatMap(x -> x.stream()).map(x -> x + 1)
                    .forEach(System.out::print);
        System.out.println();
        System.out.println("=========== Ques11 ===========");
            Predicate<String> empty = String::isEmpty;
            Predicate<String> notEmpty = empty.negate();
        var result12 = Stream.generate(() -> "")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k -> k))
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(notEmpty));
        System.out.println(result12);

        System.out.println("=========== Ques12 ===========");
        IntConsumer ic = System.out::println;
        DoubleConsumer id = System.out::println;
        LongConsumer il = System.out::println;
        //BooleanConsumer ib = System.out::println;
        //IntSupplier; LongSupplier; DoubleSupplier; BooleanSupplier;
        System.out.println("=========== Ques13 ===========");
        System.out.println("=========== Ques14 ===========");
        System.out.println("=========== Ques15 ===========");
        System.out.println("=========== Ques16 ===========");
        System.out.println("=========== Ques17 ===========");
        System.out.println("=========== Ques18 ===========");
        System.out.println("=========== Ques19 ===========");
    }
}

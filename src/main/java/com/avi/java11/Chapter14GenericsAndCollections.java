package com.avi.java11;

import java.util.*;

public class Chapter14GenericsAndCollections {
    public static void main(String[] args) {
        System.out.println("=========== Ques0 ===========");
        /*List<?> q = List.of("mouse", "parrot");
        var v = List.of("mouse", "parrot");

        //q.removeIf(String::isEmpty);
        //q.removeIf(s -> s.length() == 4);
        v.removeIf(String::isEmpty);
        v.removeIf(s -> s.length() == 4);*/
        System.out.println("=========== Ques1 ===========");
        var greetings = new LinkedList<String>();
        greetings.offer("hello");
        greetings.offer("hi");
        greetings.offer("ola");
        greetings.pop();
        greetings.peek();
        while (greetings.peek() != null)
            System.out.print(greetings.pop());
        System.out.println();
        System.out.println("=========== Ques2 ===========");
        //HashSet<Number> hs = new HashSet<Integer>();
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        //List<> list = new ArrayList<String>();
        //List<Object> values = new HashSet<Object>();
       // List<Object> objects = new ArrayList<? extends Object>();
        Map<String, ? extends Number> hm = new HashMap<String, Integer>();
        System.out.println("=========== Ques3 ===========");
        var numbers = new HashSet<Number>();
        numbers.add(Integer.valueOf(86));
        numbers.add(75);
        numbers.add(Integer.valueOf(86));
        numbers.add(null);
        numbers.add(309L);
        Iterator iter = numbers.iterator();
        while (iter.hasNext())
            System.out.print(iter.next());
        System.out.println();
        System.out.println("=========== Ques4 ===========");
        //List<?> list = new HashSet <String>();
        System.out.println("=========== Ques5 ===========");

        Comparator<Integer> c1 = (o1, o2) -> o2 - o1;
        Comparator<Integer> c2 = Comparator.naturalOrder();
        Comparator<Integer> c3 = Comparator.reverseOrder();

        var list1 = Arrays.asList(5, 4, 7, 2);
        Collections.sort(list1,c3);
        list1.stream().forEach(System.out::println);
        System.out.println(Collections.binarySearch(list1, 2));
        System.out.println("=========== Ques6 ===========");
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q);

        System.out.println("=========== Ques7 ===========");

        var map = Map.of(1,2, 3, 6);
        var list = List.copyOf(map.entrySet());

        List<Integer> one = List.of(8, 16, 2);
        var copy = List.copyOf(one);
        var copyOfCopy = List.copyOf(copy);
        var thirdCopy = new ArrayList<>(copyOfCopy);

        //list.replaceAll(x -> x * 2);
        //one.replaceAll(x -> x * 2); //UnsupportedOperationException
        //thirdCopy.replaceAll(x -> x * 2); //UnsupportedOperationException

        System.out.println(thirdCopy);

        System.out.println("=========== Ques8 ===========");

        class W {}
        class X extends W {}
        class Y extends X {}
        class Z<Y> {
            W w1 = new W();
            W w2 = new X();
            //W w3 = new Y(); -> parameter can't be instantiated directly as used in generics
            //Y y1 = new W();
            //Y y2 = new X();
            //Y y1 = new Y();
        }
        System.out.println("=========== Ques9 ===========");
        var map1 = new HashMap<Integer, Integer>(10);
        for (int i = 1; i <= 10; i++) {
            map1.put(i, i * i);
        }
        System.out.println(map1.get(4));

        System.out.println("=========== Ques10 ===========");
        Map<String, Double> map12 = new HashMap<>();
        map12.put("pi", 3.14159);
        //map12.put("e", 2L);
        map12.put("log(1)", new Double(0.0));
        //map12.put('x', new Double(123.4));
    }

   /* public class Hello<T> {
        T t;
        public Hello(T t) { this.t = t; }
        public String toString() { return t.toString(); }
        private <T> void println(T message) {
            System.out.print(t + "-" + message);
        }
        public static void main(String[] args) {
            new Hello<String>("hi").println(1);
            new Hello("hola").println(true);
        } }*/
}

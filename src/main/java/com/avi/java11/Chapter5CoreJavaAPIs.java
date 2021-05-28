package com.avi.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chapter5CoreJavaAPIs {
    public static void main(String[] args) {
        System.out.println("=========== Ques1 ===========");

            int numFish = 4;
            String fishType = "tuna";
            //String anotherFish = numFish + 1; //Exception here
            //System.out.println(anotherFish + " " + fishType);
            System.out.println(numFish + " " + 1);

        System.out.println("=========== Ques2 ===========");
            var s = "Hello";
            var t = new String(s);
            if ("Hello".equals(s)) System.out.println("one");
            if (t == s) System.out.println("two");
            if (t.intern() == s) System.out.println("three");
            if ("Hello" == s) System.out.println("four");
            if ("Hello".intern() == t) System.out.println("five");
        System.out.println("=========== Ques3 ===========");
            StringBuilder sb = new StringBuilder();
            sb.append("aaa").insert(1, "bb").insert(4, "ccc");
            System.out.println(sb);
        System.out.println("=========== Ques4 ===========");
            String roar1 = "roar";
            StringBuilder roar2 = new StringBuilder("roar");
            new Chapter5CoreJavaAPIs().roar(roar1, roar2);
            System.out.println(roar1 + " " + roar2);
        System.out.println("=========== Ques5 ===========");
            String numbers = "012345678";
            System.out.println(numbers.substring(1, 3));
            System.out.println(numbers.substring(7, 7));
            System.out.println(numbers.substring(7));
        System.out.println("=========== Ques6 ===========");
            //style
            String s1 = "purr";
            String s2 = "";

            s1.toUpperCase();
            s1.trim();
            s1.substring(1, 3);
            s1 += "two";

            s2 += 2;
            s2 += 'c';
            s2 += false;

            if ( s2 == "2cfalse") System.out.println("==");
            if ( s2.equals("2cfalse")) System.out.println("equals");
            System.out.println(s1.length());

        System.out.println("=========== Ques7 ===========");
            //StringBuilder b = "rumble";
            StringBuilder b = new StringBuilder("rumble");
            b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
            System.out.println(b);
        System.out.println("=========== Ques8 ===========");
            StringBuilder numbers1 = new StringBuilder("0123456789");
            numbers1.delete(2,  8);
            numbers1.append("-").insert(2, "+");
            System.out.println(numbers1);
        System.out.println("=========== Ques9 ===========");
            List<Integer> list = Arrays.asList(10, 4, -1, 5);
            int[] array = { 6, -4, 12, 0, -10 };
            Collections.sort(list);

            Integer converted[] = list.toArray(new Integer[4]);
            System.out.println(converted[0]);
            System.out.println(Arrays.binarySearch(array, 12));
        System.out.println("=========== Ques10 ===========");
            List<String> gorillas = new ArrayList<>();
            for(var koko : gorillas)
                System.out.println(koko);

            var monkeys = new ArrayList<>();
            for(var albert : monkeys)
                System.out.println(albert);

            List chimpanzees = new ArrayList<Integer>();
            for(var ham : chimpanzees)
                System.out.println(ham);

        System.out.println("=========== Ques11 ===========");
        System.out.println("=========== Ques12 ===========");
        System.out.println("=========== Ques13 ===========");
        System.out.println("=========== Ques14 ===========");
        System.out.println("=========== Ques15 ===========");
        System.out.println("=========== Ques16 ===========");
        System.out.println("=========== Ques17 ===========");
        System.out.println("=========== Ques18 ===========");
        System.out.println("=========== Ques19 ===========");


    }


    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!");
        roar2.append("!!!");
    }
}

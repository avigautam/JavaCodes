package com.avi.hackerrank;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AppendandDelete {

    public static void main(String[] args) {
        System.out.println(appendAndDelete("ab", "ab", 4));
    }
    public static String appendAndDelete(String s, String t, int k) {
        //int diff = Arrays.mismatch(s.toCharArray(), t.toCharArray());
        //String
        //if(s.equals(t)) return "Yes";
        //int i = 0;
        int minLength = Math.min(s.length(), t.length());
        //System.out.println(minLength);
        int sameChar =  (int)IntStream.range(0, minLength).takeWhile(i -> s.charAt(i) == t.charAt(i)).count() ;
        //System.out.println(sameChar);
        int minOps = s.length() + t.length() - (2* sameChar);
        return ( k == minOps ) ? "Yes" : (k > minOps && (k - minOps)%2 == 0 ||  k>= (s.length() + t.length())) ? "Yes" : "No";
        /*
        AtomicInteger atm = new AtomicInteger(0);
        Stream.of(s1, t1).filter( i -> atm.get() < minLength).map((s11, t11) -> s11[i]== t11[i]).count();

        String[] first = {"Banana", "Papaya"}, second = {"Banana", "Apple"};

        String[] joined = Stream.of(first, second)
                .flatMap(Stream::of)        // or, use `Arrays::stream`
                .toArray(String[]::new);

        Arrays.stream(joined).forEach(System.out::println);
        int diff = Arrays.mismatch(s1, t1);
        */




    }
}

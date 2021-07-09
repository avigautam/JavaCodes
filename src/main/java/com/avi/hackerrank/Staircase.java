package com.avi.hackerrank;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Staircase {
    public static void main(String[] args) {
        staircase(6);
    }

    public static void staircase(int n) {

      /*  for (int i = 5; i < 0; i--) {

        }*/


        //System.out.printf("% 4d", 8);
        //System.out.printf("%20s\n", "cf");
        StringBuilder sb = new StringBuilder();
        IntStream.rangeClosed(1,n).forEach(i -> System.out.printf("%"+(n)+"s\n", Stream.generate(() -> "#").limit(i).collect(Collectors.joining())));
        /*IntStream.rangeClosed(1,n).forEach(i -> {
            //sb.re
            System.out.print("");
        });*/

    }
}

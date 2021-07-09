package com.avi.hackerrank;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(-4, 3, -9, 0, 4, 1);
        plusMinus(l);

    }

    public static void plusMinus(List<Integer> arr) {
        //arr.stream().collect( i -> i.intVal(), )
        DecimalFormat decimalFormat = new DecimalFormat("#.000000");
        int positive =0, negative = 0, zeros = 0, iVal =0;
        for(Integer in : arr){
            iVal = in.intValue();
            if (iVal > 0) positive++;
            else if(iVal <0) negative++;
            else zeros++;
        }
        System.out.println(decimalFormat.format(positive/(double)arr.size()));
        System.out.println(decimalFormat.format((double)negative/arr.size()));
        System.out.println(decimalFormat.format((double)zeros/arr.size()));

        System.out.println(
                arr.stream().reduce( Integer::sum));
       /* System.out.println(
        arr.stream().map( i -> {
            List<Integer>  l = new ArrayList<>();
            l.add(0,0);
            l.add(1,0);
            if (i > 0) l.add(0, l.get(0) +1);
            else l.add(1, l.get(1) + 1);
            return l;
        }).collect(Collectors.toList()));*/

    }
}

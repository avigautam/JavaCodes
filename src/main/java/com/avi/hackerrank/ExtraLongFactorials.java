package com.avi.hackerrank;

import java.math.BigInteger;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        extraLongFactorials(1);
    }

    public static void extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger(String.valueOf(1));
        for(int i = n ; i >=1 ; i --){
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(factorial);

        //BigIntegerStream.range(1, n).reduce(new BigInteger(String.valueOf(1)), (a,b) -> a*b);

    }
}

package com.avi.hackerrank;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println(kangaroo(0,3,4,2));
        System.out.println(kangaroo(0,2,5,3));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if(v1>v2 && ((x2-x1) % (v1-v2)) == 0) return "YES";
        else return "NO";

        /*int d1 = x1 + v1, d2 = x2 + v2, i=1;
        if((x1>x2 && v1 >= v2) || (x1>= x2 && v1> v2)) return "NO";
        while(d1 - d2 != 0 ){
            if(i <= 10000) return "NO";
            if((d1-d2 < 0 && v1<v2) || (d1-d2> 0 && v1> v2)) return "NO";
            d1 = x1 + v1*i;
            d2 = x2 + v2*i;
            i++;

        }

        return "YES";*/
    }
}

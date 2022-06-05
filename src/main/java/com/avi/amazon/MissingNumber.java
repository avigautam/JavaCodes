package com.avi.amazon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    /**
     *     You are given an array of positive numbers from 1 to n,
     *     such that all numbers from 1 to n are present except one number x.
     *     You have to find x. The input array is not sorted. Look at the below array
     *     and give it a try before checking the solution.
     */


    public static void main(String[] args) {

        int n = 6;
        int [] A = {1,2,3,4,5};
        int sum = (n*(n+1))/2;

        //String s = "Avi G";
        //char[] sentence = {'A',' ', 'G'};
       // String s = new String(sentence);

        String s = "the sky is       blue";
        String[] sp = s.split(" ");
        for(int i = sp.length -1 ; i>=0; i-- ){
            System.out.print(sp[i] + " ");
        }

        System.out.println("Missing element : " + (sum - Arrays.stream(A).sum()));
        if(findSumOfTwo(A, 9)) System.out.println("Yes");
        else System.out.println("No");

    }

    //LinkedListNode ls;

    static boolean findSumOfTwo(int[] A, int val) {
        Set set = new HashSet();
        for(int a : A){
            if(set.contains(val - a)) return true;
            else set.add(a);
        }
        return false;
    }
}

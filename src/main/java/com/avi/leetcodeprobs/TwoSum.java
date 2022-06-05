package com.avi.leetcodeprobs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {

        byte a = (byte) (127+1);
        System.out.println("a value: " + a );

        Deque<Integer> deque = new ArrayDeque<>();

        String [] s = {"A","B","C"};
        printArr(s);
        //String [] s1 = Arrays.copyOf(s,3);
        List<String> s1 = Arrays.asList(s);
        s[0] = "Z";
        s1.stream().forEach(System.out::println);


    }

    public static void printArr(String [] s){
        Arrays.stream(s).forEach(System.out::println);
    }

    public int[] twoSum(int[] nums, int target) {

        if(nums.length != 0){
            ///Arrays.stream(nums).sort();

            for(int i=0; i<nums.length; i++){
                if(nums[0] + nums[nums.length -1] == target) return null;
            }

        }else{
            // can put else blockt
        }

        return null;
    }
}

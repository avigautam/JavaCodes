package com.avi.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BillDivision {
    public static void main(String[] args) {
        //System.out.println(countingValleys(9, "UDDDUDUUD"));
        List<Integer> list = new ArrayList<>();
        list.add(1);  list.add(3);  list.add(1);  list.add(3);  list.add(1);  list.add(4);  list.add(1);  list.add(3);
        list.add(2);  list.add(5);  list.add(5);  list.add(5);  list.add(5);  list.add(5);  list.add(5);  list.add(5);  list.add(5);  list.add(5);
        list.add(5);  list.add(5);  list.add(5);  list.add(5);  list.add(5);  list.add(5);  list.add(5);  list.add(5);
        System.out.println(designerPdfViewer(list,"abc"));
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        long annaShareBill = bill.stream().mapToLong( i-> i.longValue()).sum() - bill.get(k);
        System.out.println( (annaShareBill/2 -b) == 0 ? "Bon Appetit" : Math.abs((annaShareBill/2 -b)));




    }

    public static int countingValleys(int steps, String path) {
        int cnt = 0, prevCont = 0 , vallyCnt = 0;
        int u = 1 + 'a';
        System.out.println( u);
       for (int i =0 ; i < steps; i++){
           if (path.charAt(i) == 'U') {
               cnt++;
           } else {
               cnt--;
           }
           if(cnt == -1 && prevCont >= 0) vallyCnt++;
           prevCont = cnt;
       }
       return vallyCnt;

    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        char [] arr = word.toCharArray();
        int high = 0;
        for(char c :arr){
            if(h.get(c - 97) >= high) high = h.get(c - 97);
        }
        return high* word.length();
    }

    public static int utopianTree(int n) {
        if(n==0) return 1;
        if(n==1) return 2;
        int height = 1;
        for(int i=0; i<n ; i=i+2 ){
            height*=2;
            if(i+1 <n) height+=1;
        }
        return height;

    }



}

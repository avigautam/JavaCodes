package com.avi.mit.alogs;

public class LongestPalindromeFromString {
    static int cnt = 0;
    static int [] [] status;
    public static void main(String[] args) {

        String  s = "erwt";
        System.out.println(findPalindrome(s,0,s.length()-1));
        System.out.println(cnt);
    }

    private static int findPalindrome(String s, int startIndex, int endIndex) {
        cnt++;
        System.out.println("iteration: i= " +startIndex+ " j= " + endIndex);
        //if (true){
        // Add memoization
        //if(status[startIndex][endIndex] == 1) return 1;
            if(startIndex == endIndex){
                return 1;
            }
            if(s.charAt(startIndex) == s.charAt(endIndex))
                if((startIndex + 1) == endIndex) {
                    return 2;
                }
                else {
                    return 2 + findPalindrome(s, startIndex+1, endIndex-1);
                }
            else return  Math.max(findPalindrome(s, startIndex+1, endIndex),
                    findPalindrome(s, startIndex, endIndex-1));
       // }

    }
}

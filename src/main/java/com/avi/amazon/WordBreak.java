package com.avi.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordBreak {
    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> l = List.of("apple","pen");

        String s1 = "catsandog";
        List<String> l1 = List.of("cats","dog","sand","and","cat");

    }

    public boolean wordBreak(String s, List<String> wordDict) {

        List<String> l = wordDict.stream().filter(word -> word.startsWith(String.valueOf(s.charAt(0)))).collect(Collectors.toList());
        return false;
    }

    public String wordBreak1(String s, List<String> wordDict){
        List<String> l = wordDict.stream().filter(word -> word.startsWith(String.valueOf(s.charAt(0)))).collect(Collectors.toList());
        for(String word : l){
            wordBreak1(s.replaceFirst(word, ""), wordDict);
        }
        return null;

    }
}

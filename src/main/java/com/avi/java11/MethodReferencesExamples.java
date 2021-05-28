package com.avi.java11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class MethodReferencesExamples {

    public static void main(String[] args) {
        Supplier<List<String>> methodRef = ArrayList::new;
        var a = methodRef.get();
        //var b = (ArrayList::new).get();
        Map.ofEntries(Map.entry("Avinash","Gautam"),
                Map.entry("James","Bond"));

    }
}

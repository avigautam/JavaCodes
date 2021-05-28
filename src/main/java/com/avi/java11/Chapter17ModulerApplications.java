package com.avi.java11;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class Chapter17ModulerApplications {
    public static void main(String[] args) {
        List<InterfaceExample> all = ServiceLoader.load(InterfaceExample.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
        all.forEach(System.out::println);
    }
}

package com.avi.java11;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.Arrays;

@Retention(RetentionPolicy.RUNTIME)
@interface Plumber {
    String value() default "Mario";
}

public class Team {
    @Plumber("") private String foreman = "Mario";
    @Plumber private String worker = "Kelly";
    @Plumber("Kelly") private String trainee;

    public static void main(String[] args) {
        var t = new Team();
        var fields = t.getClass().getDeclaredFields();
       // Arrays.stream(fields).forEach(System.out::println);
        for (Field field : fields){
            //System.out.println(field);
            //System.out.println(field.isAnnotationPresent(Plumber.class));
            if(field.isAnnotationPresent(Plumber.class))
                System.out.println(field.getAnnotation(Plumber.class)
                        .value());
        }

    }
}
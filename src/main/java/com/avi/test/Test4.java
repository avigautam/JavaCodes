package com.avi.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Sellable {}
abstract class Animal {}
class Mammal extends Animal{}
class Rabbit extends Mammal implements Sellable{}

public class Test4 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        //System.out.println(sb.append((char[]) null).length());

        int [] array1 = {};
        int [] array2 = {100, 200};
        System.out.print(Arrays.compare(array1, array2));
        System.out.print(Arrays.mismatch(array1, array2));

        StringBuilder sb1 = new StringBuilder("Breathe Deeply");
        String str1 = sb1.toString();
        String str2 = "Breathe Deeply";

        System.out.println(str1 == str2);

        String fruit = "mango";
        switch (fruit) {
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
            default:
                System.out.println("ANY FRUIT WILL DO");
        }




        Boolean [] arr = new Boolean[2];
        List<Boolean> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[1]);
        list.add(null);
        System.out.println(list.size());
        list.forEach(System.out::println);
        if(list.remove(0)) {
            list.remove(1);
        }

        System.out.println(list);
    }
    {
        List<Animal> list = new ArrayList<>();
        list.add(new Rabbit());
    }
    {
        List<Animal> list = new ArrayList<>();
        list.add(new Mammal());
    }
    {
        List<Mammal> list = new ArrayList<>();
        list.add(new Rabbit());
    }
    {
        List<Sellable> list = new ArrayList<>();
        //list.add(new Mammal());
    }
    {
        List<Sellable> list = new ArrayList<>();
        list.add(new Rabbit());
    }
}
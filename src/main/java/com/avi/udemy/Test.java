package com.avi.udemy;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Car {
    void speed(Byte val) { //Line n1
            System.out.println("DARK"); //Line n2
            } //Line n3

            void speed(byte... vals) {
            System.out.println("LIGHT");
            }
            }

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        byte b = 10; //Line n4
        //new Car().speed((byte...)b); //Line n5
        //someMethod();
        System.out.println("=========== Ques1 ===========");
        StringBuilder sb = new StringBuilder(5);
        sb.append("HOWDy");
        sb.insert(0, ' ');
        sb.replace(3, 5, "LL");
        sb.insert(6, "COW");
        sb.delete(2,7);
        System.out.println(sb.toString());
        System.out.println(sb.length());

        System.out.println("=========== Ques2 ===========");
        int[] a = {2,4,12,8,10};
        int[] b1 = {2,4,8,6,10};

        int res1 = Arrays.mismatch(a, b1);
        int res2 = Arrays.compare(a, b1);
        System.out.println(res1 +" "+ res2);

        System.out.println("=========== Ques3 ===========");
        String javaworld = "JavaWorld";
        String java = "Java";
        String world = "World";
        java += world;
        System.out.println(java == javaworld);

        System.out.println("=========== Ques4 ===========");
        List<Character> list = new ArrayList<>();
        list.add(0, 'E');
        list.add('X');
        list.add(1, 'P');
        list.add(3, 'O');

        if(list.contains('O')) {
            //list.remove('O');
            list.remove(Character.valueOf('O'));
        }

        for(char ch : list) {
            System.out.print(ch);
        }

        System.out.println("=========== Ques5 ===========");
        char [] arr1 = {'A'};
        char [] arr2 = {'A', 'A', 'A', 'A'};
        System.out.println(Arrays.compare(arr1, arr2));
        System.out.println(Arrays.mismatch(arr1, arr2));

        int [] i1 = {1,2};
        int [] i2 = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.compare(i1, i2));
        System.out.println(Arrays.mismatch(i1, i2));

        System.out.println("=========== Ques6 ===========");
        List<String> list1;
        list1 = new ArrayList<>(); //Line n1
        list1.add("A");
        list1.add("E");
        list1.add("I");
        list1.add("O");
        list1.add("U");
        list1.addAll(list1.subList(0, 4)); //Line n2
        System.out.println(list1);

        System.out.println("=========== Ques7 ===========");
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        for(String dryFruit : dryFruits) {
            if(dryFruit.startsWith("A")) {
                //dryFruits.remove(dryFruit);
            }
        }

        System.out.println(dryFruits);

        System.out.println("=========== Ques8 ===========");
        String[] arr = { "A", "B", "C", "D" }; // Line n1
        arr[0] = arr[1]; // Line n2
        arr[1] = "E"; // Line n3
        for (String s : arr) {
            System.out.print(s + " ");
        }

        System.out.println();

        System.out.println("=========== Ques9 ===========");
        int i = 0;
        for(System.out.print(i++); i < 2; System.out.print(i++)) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("=========== Ques10 ===========");
        try {
            availableSeats(); //Line 12
        } catch(SQLException e) {
            System.out.println("SEATS NOT AVAILABLE");
        }

        System.out.println("=========== Ques11 ===========");
        int val = 25;
        if(val++ < 26) {
            System.out.println(val++);
        }

        System.out.println("=========== Ques12 ===========");
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.append("").append("").append("").length());

        System.out.println("=========== Ques12 ===========");
        boolean status = true;
        //System.out.println(status = false || status = true | status = false);
        System.out.println(status);

        System.out.println("=========== Ques13 ===========");
        var festivals = List.of("DIWALI", "CHRISTMAS", "EID");
        //festivals.removeIf(str -> str.length() == 3); //UnsupportedOperationException
        System.out.println(festivals);

        System.out.println("=========== Ques14 ===========");
/*        byte var = 100;
        switch(var) {
            case 100:
                System.out.println("var is 100");
                break;
            case 99:
                System.out.println("var is 200");
                break;
            default:
                System.out.println("In default");
        }*/

        System.out.println("=========== Ques15 ===========");
        for(int x = 10, y = 11, z = 12; y > x && z > y; y++, z -= 2) {
            System.out.println(x + y + z);
        }

        System.out.println("=========== Ques16 ===========");
        int i11 = 10;
        System.out.println(i11 > 3 != false);

        System.out.println("=========== Ques17 ===========");
        //byte [] arr11 = new byte[0];
        //System.out.println(arr11[0]);// ArrayIndexOutOfBound

        System.out.println("=========== Ques18 ===========");
        int day = '3';
        switch(day) {
            case '3':
                System.out.println("BUY 2 GET 1 FREE");
                break;
            default:
                System.out.println("SORRY!!! NO SALE");
        }

        System.out.println("=========== Ques19 ===========");
        String str = "USER GENERATED";
        str = String.join("-", str.split(" "));
        System.out.println(str);

        System.out.println("=========== Ques20 ===========");
        System.out.println( 53 / 2.0 );
        System.out.println( 53 % 2.0 );

        System.out.println("=========== Ques21 ===========");
        Boolean [] arr12 = new Boolean[2];
        System.out.println(arr12[0] + ":" + arr12[1]);

        System.out.println("=========== Ques22 ===========");
        boolean flag1 = "Java" == "Java".replace('J', 'J'); //Line n1
        System.out.println(flag1);
        boolean flag2 = "Java" == "Java".replace("J", "J"); //Line n2
        System.out.println(flag2);
        System.out.println(flag1 && flag2);

        System.out.println("=========== Ques23 ===========");
        byte var1 = 127;
        //System.out.println(var1 = var1* 2);

        System.out.println("=========== Ques24 ===========");
        String s1 = "OCP";
        String s2 = "ocp";
        System.out.println(s1.equals(s2.toUpperCase()));

        System.out.println("=========== Ques25 ===========");
        StringBuilder sb12 = new StringBuilder("Dream BIG");
        String s112 = sb12.toString();
        String s212 = sb12.toString();
        System.out.println(s112);
        System.out.println(s212);

        System.out.println(s112 == s212);

/*
        var var11 = 3; //Line n1
        String [][] arr1222 = new String[--var11][var11++]; //Line n2
        arr1222[1][1] = "X"; //Line n3
        arr1222[1][2] = "Y"; //Line n4
        for(String [] arr122 : arr1222) {
            for(String s : arr122) {
                if(s != null)
                    System.out.print(s);
            }
        }*/

        list.stream().filter(p -> !!!!!!false);

        System.out.println("=========== Ques26 ===========");
        char ccd = 'A';
        System.out.println(ccd +1);

/*        System.out.println(new RuntimeException()); //Line n1
        System.out.println(new RuntimeException("HELLO")); //Line n2
        System.out.println(new RuntimeException(new RuntimeException("HELLO"))); //Line n3*/

        String place = "MISSS";
        System.out.println(place.replace("SS", "T"));

        System.out.println("Password" + 1 + 2 + 3 + 4);

        String text = null;
        //System.out.println(text.repeat(3));
        //System.out.println(null + null + null);

        System.out.println(null + "null" + null);

       // System.out.println(text *= 3);

        //System.out.println(text += "null".repeat(2));
        //System.out.println(text + text + text);
        //text += null; System.out.println((text.concat(null)));


        String [] arqr = new String[1];
        System.out.println(arqr[0].isBlank());

    }

    private static void availableSeats() throws SQLException {
        //throw null; //Line 7
        throw new SQLException();
    }

    private static void someMethod() throws FileNotFoundException {
        if(true){
            throw new FileNotFoundException();
        }
    }
}

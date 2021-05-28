package com.avi.java11;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Practice {


    public static void main(String[] args) {
        System.out.println("=========== Ques1 ===========");
        //What is the output of the following code snippet?
        int moon = 9, star = 2 + 2 * 3;
        float sun = star>10 ? 1 : 3;
        double jupiter = (sun + moon) - 1.0f;
        int mars = --moon <= 8 ? 2 : 3;
        System.out.println(sun+"-"+jupiter+"-"+mars);

        System.out.println("=========== Ques2 ===========");
        var s1 = "Java";
        var s2 = "Java";
        var s3 = "Ja".concat("va");
        var s4 = s3.intern();
        var sb1 = new StringBuilder();
        sb1.append("Ja").append("va");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

        System.out.println("=========== Ques3 ===========");
        //Find more
        /*final int score1 = 8, score2 = 3;
        char myScore = 7;
        switch (myScore) {
            default:
            score1:
            2: 6: System.out.print("great-");
            4: System.out.print("good-"); break;
            score2:
            1: System.out.print("not good-");
        }*/
        System.out.println("=========== Ques4 ===========");
        //int i =5;
        System.out.println(test(i -> i == 5));
        //System.out.println(test(i -> {i == 5);});
        System.out.println(test((i) -> i == 5));
        System.out.println(test((final Integer i) -> i == 5));
        System.out.println(test((Integer i) -> {return i == 5;}));

        System.out.println("=========== Ques5 ===========");
        //int monday = 3 + 2.0; -> required type is double
        double tuesday = 5_6L;
        //boolean wednesday = 1 > 2 ? !true; -> Ternary operator : expected
        short thursday = (short)Integer.MAX_VALUE;
        //long friday = 8.0L; -> 8.0 is double value
        //var saturday = 2_.0; -> _ adjacent to decimal not allowed
        System.out.println(tuesday);

        System.out.println("=========== Ques6 ===========");

        var x = 5;
        var j = 0;
        OUTER: for (var i = 0; i < 3;)
            INNER: do {
                i++;
                x++;
                if (x> 10) break INNER;
                x += 4;
                j++;
            } while (j <= 2);
        System.out.println(x);

        System.out.println("=========== Ques7 ===========");
        //var spring = null;
        var fall = "leaves";
        //var evening = 2; evening = null;
        var night = new Object();
        //var day = 1/0;
        //var winter = 12, cold;
        //var fall = 2, autumn = 2;
        var morning = ""; morning = null;


        System.out.println("=========== Ques8 ===========");
        var list = new ArrayList<>();
        String name = "Scruffy";
        name.length();
        list.size();

        System.out.println("=========== Ques9 ===========");
        System.out.println("null comparison will brings true ");
        System.out.println(null == null);

        System.out.println("=========== Ques10 ===========");
        System.out.println("Assignment operator working on booleans");
        boolean f1 = true;
        boolean f2 = true;
        System.out.println(f1 == f2);
        System.out.println("=========== Ques11 ===========");
        double l = (long)(int)(short)2;
        long goat = (int)2;
        goat -= 1.0;
        System.out.println("Goat val : " + goat);
        System.out.println(l);
        System.out.println("=========== Ques12 ===========");
        int a = 2, b = 4, c = 2;
        System.out.println(a > 2 ? --c : b++);
        System.out.println(b = (a!=c ? a : b++));
        System.out.println(a > b ? b < c ? b : 2 : 1);
        System.out.println("=========== Ques13 ===========");
        short height = 1, weight = 3;
        //short zebra = (byte) weight * (byte) height; -> type should have been int
        double ox = 1 + height * 2 + weight;
        long giraffe = 1 + 9 % height + 1;
        //System.out.println(zebra);
        System.out.println(ox);
        System.out.println(giraffe);
        System.out.println("=========== Ques14 ===========");
        int sample1 = (2 * 4) % 3;
        int sample2 = 3 * 2 % 3;
        int sample3 = 5 * (1 % 2);
        System.out.println(sample1+"-"+sample2+"-"+sample3);

        System.out.println("=========== Ques15 ===========");
        boolean sunny = true, raining = false, sunday = true;
        boolean goingToTheStore = sunny & raining ^ sunday;
        boolean goingToTheZoo = sunday && !raining;
        boolean stayingHome = !(goingToTheStore && goingToTheZoo);
        System.out.println(goingToTheStore + "-" + goingToTheZoo
                + "-" +stayingHome);
        System.out.println("=========== Ques16 ===========");
        //How many lines of the following code contain compiler errors?
        //int note = 1 * 2 + (long)3;
        int note = 1 * 2 + 3;
        short melody = (byte)(double)(note *= 2);
        double song = melody;
        float symphony = (float)((song == 1_000f) ? song * 2L : song);
        System.out.println(symphony);
        System.out.println("=========== Ques17 ===========");

        int dayOfWeek = 2;
        switch(dayOfWeek) {

            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");

        }


        System.out.println("=========== Ques18 ===========");
        int temperature = 4;
        long humidity = -temperature + temperature * 3;
        if (temperature>=4)// though there will be some catch in if block but its perfectly fine
        if (humidity < 6) System.out.println("Too Low");
        else System.out.println("Just Right");
        else System.out.println("Too High");

        System.out.println("=========== Ques19 ===========");

        int sing = 8, squawk = 2, notes = 0;
        while(sing > squawk) {
            sing--;
            squawk += 2;
            notes += sing + squawk;
        }
        System.out.println(notes);

        System.out.println("=========== Ques20 ===========");
        boolean keepGoing = true;
        int result = 15, meters = 10;
        do {
            meters--;
            if(meters==8) keepGoing = false;
            result -= 2;
        } while (keepGoing);
        System.out.println(result);
        System.out.println("=========== Ques21 ===========");
        for(var penguin : new int[2])
            System.out.println(penguin);

        var ostrich = new Character[3];
        for(var emu : ostrich)
            System.out.println(emu);

        List parrots = new ArrayList();
        for(var macaw  : parrots)
            System.out.println(macaw);
        System.out.println("=========== Ques22 ===========");
        final char a1 = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a1:
            case 'B':
            case 'C': System.out.println("great ");
            case 'D': System.out.println("good "); break;
            case e:
            case 'F': System.out.println("not good ");
        }
        System.out.println("=========== Ques23 ===========");
        String [] weather = {"Rainy","Summer", "Winter"};
        for(int i=0, j1 = 0; i<weather.length; ++i) {
            System.out.println(i);
            System.out.println(weather[i]);
        }

        System.out.println("=========== Ques24 ===========");
        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
        for(int i=wolf.length; i>0; --i){
            System.out.println(i);
            //System.out.print(wolf[i]);
        }

        System.out.println("=========== Ques25 ===========");
        String instrument = "violin";
        final String CELLO = "cello";
        String viola = "viola";
        int p = -1;
        switch(instrument) {
            case "bass" : break;
            case CELLO : p++;
            default: p++;
            case "VIOLIN": p++;
            case "viola" : ++p; break;
        }
        System.out.println(p);
        System.out.println("=========== Ques26 ===========");
        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 4, "sty");
        System.out.println(builder);  // pigsty dirty

        System.out.println("=========== Ques27 ===========");

        List<String> birds = new ArrayList<>();
        birds.add("Hawk");                           // [hawk]
        System.out.println(birds.contains("hawk"));  // true
        System.out.println(birds.contains("robin"));

        System.out.println("=========== Ques28 ===========");
        System.out.println("=========== Ques29 ===========");
        System.out.println("=========== Ques30 ===========");
        System.out.println("=========== Ques31 ===========");
        System.out.println("=========== Ques32 ===========");
        System.out.println("=========== Ques33 ===========");
        System.out.println("=========== Ques34 ===========");
        System.out.println("=========== Ques35 ===========");
        System.out.println("=========== Ques36 ===========");
        System.out.println("=========== Ques37 ===========");
        System.out.println("=========== Ques38 ===========");
        System.out.println("=========== Ques39 ===========");





    }

    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }

/*    public static void main(String... unused) {
        System.out.print("a");
        try (StringBuilder reader = new StringBuilder()) {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (Exception e || RuntimeException e) {
            System.out.print("c");
            throw new FileNotFoundException();
        } finally {
            System.out.print("d");
        } }*/

}

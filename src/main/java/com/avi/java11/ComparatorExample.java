package com.avi.java11;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample implements Comparator<ComparatorExample> {
    @Override
    public int compare(ComparatorExample o1, ComparatorExample o2) {
        return 0;
    }

  /*
  Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies)
   .thenComparingInt(Squirrel::getWeight);

  @Override
    public int compare(ComparatorExample c1, ComparatorExample c2){
        int result = c1..getName().compareTo(s2.getName());
        if(result != 0) return result;
        return s1.weight - s2.weight;
    }*/

    class Squirrel{
        private String name;
        private int weight;
        public Squirrel(String name, int weight){
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
        @Override
        public String toString(){
            return name + " " + weight;
        }
    }



    public static void main(String[] args) {
        ComparatorExample c1 = new ComparatorExample();
        c1. new Squirrel("Sq1", 5);
        ComparatorExample c2 = new ComparatorExample();
        c2. new Squirrel("Sq1", 2);
        ComparatorExample c3 = new ComparatorExample();
        c3. new Squirrel("Sq2", 3);
        ComparatorExample c4 = new ComparatorExample();
        c3. new Squirrel("Sq1", 7);
        var list = new ArrayList<ComparatorExample>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        //Collections.sort(list);
        System.out.println(list.toString());
        //list.stream().forEach( s- > System.out.println(s.););



    }
}

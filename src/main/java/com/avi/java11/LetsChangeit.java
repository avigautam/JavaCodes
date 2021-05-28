package com.avi.java11;

class Speedster {
    int numSpots;
    public Speedster(int numSpots){
        this.numSpots = numSpots;
    }
}
public class LetsChangeit extends Speedster {
    int numSpots;

    public LetsChangeit(int numSpots) {
        super(numSpots);
        this.numSpots = numSpots;
    }
    public static void main(String[] args) {
        //LetsChangeit cheetah = new LetsChangeit();
        Speedster s = new LetsChangeit(50);
        System.out.print(s.numSpots);
    }

}




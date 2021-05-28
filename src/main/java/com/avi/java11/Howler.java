package com.avi.java11;

public class Howler {
    public Howler(long shadow) {
        this(5);
    }
    private Howler(int moon) {
        super();
    }
}
class Wolf extends Howler {
    protected Wolf(String stars) {
        super(2L);
    }
    public Wolf() {
        //super(null); This won't work -> here explicit casting
        super((Long)null);
    }
}

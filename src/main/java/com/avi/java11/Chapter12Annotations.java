package com.avi.java11;
import java.lang.annotation.*;
public class Chapter12Annotations {
}
//=========================First=========================
// default should be used set default values
// private/protected -> not allowed
enum Color {GREY, BROWN}
@Documented @interface Dirt {
    boolean wet();
    String type() default  "unknown";
    public Color color();
    static final int slippery = 5;
}

//=========================Second=========================
class Food {}
@Inherited @interface Unexpected {
    //Null values can't be default
    // public String rsvp() default null;
    //Here Type is Food not class
    //Food food();
    public String[] dessert();
    final int numberOfGuests = 5;
    long startTime() default 0L;
}
//=========================Third=========================

enum UnitOfTemp { C, F }
@interface Snow { boolean value(); }
@Target(ElementType.METHOD) @interface Cold {
    //public Cold() {}
    int temperature();
    UnitOfTemp unit() default UnitOfTemp.C;
    Snow snow() default @Snow(true);
}
//=========================Fourth=========================

@interface Maker{

}
//=========================Fifth=========================
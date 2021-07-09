/*
 * This code is developed by Avinash Gautam.
 *
 * While preparing for Java 11 certification on Oracle University online platform.
 *
 * For more information connect me on avigautam.knit@gmail.com
 *
 * @author  Avinash Gautam
 * @version 1.0
 *
 *
 */

package com.avi.effective.java.chapter1;

import static com.avi.effective.java.chapter1.NyPizza.Size.SMALL;
import static com.avi.effective.java.chapter1.Pizza.Toppings.CAPSICUM;
import static com.avi.effective.java.chapter1.Pizza.Toppings.ONION;

public class MainPizza {

    public static void main(String[] args) {

        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(CAPSICUM).addTopping(ONION).build();

        Dominos dominos = new Dominos.Builder()
                .putSauceInside().addTopping(ONION).build();

        pizza.getToppings().stream().forEach(System.out::println);
        System.out.println(pizza.getSize());

        dominos.toppings.stream().forEach(System.out::println);
        System.out.println(dominos.isSauceInside());
    }
}

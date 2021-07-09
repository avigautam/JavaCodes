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
 * This is for implementing Builder pattern for Abstract classes
 *
 * wherein a subclass method is declared to return a
 * subtype of the return type declared in the super-class,
 * is known as covariant return typing
 */

package com.avi.effective.java.chapter1;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Toppings  {ONION, TOMATO, CAPSICUM};
    final Set<Toppings> toppings;

    abstract static class Builder<T extends Builder<T>> {

        EnumSet<Toppings> toppings = EnumSet.noneOf(Toppings.class);

        public T addTopping(Toppings topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        // This method should return "this" in
        // implementing class
        protected abstract T self();

        abstract Pizza build();

    }

    Pizza(Builder<?> builder){
        this.toppings = builder.toppings.clone();
    }

    public Set<Toppings> getToppings() {
        return toppings;
    }
}

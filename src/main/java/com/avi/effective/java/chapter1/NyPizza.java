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
 *
 */

package com.avi.effective.java.chapter1;

import java.util.Objects;

public class NyPizza extends Pizza{

    public enum Size {SMALL, MEDIUM, LARGE};
    private Size size;

    public static class Builder extends Pizza.Builder<Builder>{
        private Size size;

        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }
    }


    NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public Size getSize() {
        return size;
    }
}

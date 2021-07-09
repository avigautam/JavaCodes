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

public class Dominos extends Pizza{

    private boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder>{

        private boolean sauceInside = false;

        public Builder putSauceInside(){
            sauceInside = true;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        Dominos build() {
            return new Dominos(this);
        }
    }

    private Dominos(Builder builder){
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    public boolean isSauceInside() {
        return sauceInside;
    }
}

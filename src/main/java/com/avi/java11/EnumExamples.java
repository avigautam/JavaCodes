package com.avi.java11;

public enum EnumExamples {
    HAPPY {
        @Override
        void print() {
            System.out.println("HAPPY");
        }
    }, SAD {
        @Override
        void print() {
            System.out.println("SAD");
        }
    }, NEUTRAL {
        public void print(){
            System.out.println("NEUTRAL");
        }
    };

    abstract void print();
}

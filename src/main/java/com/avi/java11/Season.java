package com.avi.java11;

public enum Season implements Runnable{
    WINTER {
        public String getHours() { return "10am-3pm"; }
        public void run(){
            System.out.println("Running: 10am-3pm");
        }
    },
    SPRING {
        public String getHours() { return "9am-5pm"; }
    },
    SUMMER {
        public String getHours() { return "9am-7pm"; }
    },
    FALL {
        public String getHours() { return "9am-5pm"; }
    };

    public void run(){
        System.out.println("Running");
    }

    public abstract String getHours();
}
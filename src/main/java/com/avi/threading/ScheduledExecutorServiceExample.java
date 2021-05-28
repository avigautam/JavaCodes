package com.avi.threading;

import java.util.concurrent.*;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
        ScheduledExecutorService seServ = Executors.newSingleThreadScheduledExecutor();
        Runnable t1 = () -> System.out.println("Running");
        seServ.scheduleAtFixedRate(t1, 1, 1, TimeUnit.SECONDS);
    }
}

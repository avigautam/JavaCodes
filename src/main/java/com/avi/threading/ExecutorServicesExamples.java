package com.avi.threading;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorServicesExamples {
    public static int counter = 0;
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("============= Prob 1 =============");
        // This is the example of the invokeAll Example
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> task = () -> 4;
        Callable<Integer> task1 = () -> 5;
        Callable<Integer> task2 = () -> 6;

        List<Future<Integer>> futures= executor.invokeAll(List.of(task, task1, task2));
        futures.stream().forEach(future -> {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

        System.out.println("============= Prob 2 =============");
        // This is example of newSingleThreadExecutor
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(() -> {
            for (int i = 0; i <100; i++) {
                ExecutorServicesExamples.counter++;
            }
        });
        System.out.println("middle");
        try{
            //if (future.isDone()) {
                future.get(10, TimeUnit.MILLISECONDS);
                System.out.println("Done");
            //}

        }catch (TimeoutException te){
            System.out.println("Timeout reached");
        }finally {
            if (executorService != null) executorService.shutdown();
            if (executor != null) executor.shutdown();
        }
        if (executorService != null){
            // Waiting for the executor service to finish all tasks first
            executorService.awaitTermination(1, TimeUnit.MINUTES);
            if (executorService.isTerminated()) System.out.println("Terminated");
            else System.out.println("At least one task is still running...");
        }
    }
}

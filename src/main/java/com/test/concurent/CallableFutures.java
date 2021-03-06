package com.test.concurent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableFutures {
  private static final int NTHREDS = 10;

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
    List<Future<Long>> list = new ArrayList<Future<Long>>();
    for (int i = 0; i < 20000; ++i) {
      Callable<Long> worker = new MyCallable(1000);
      Future<Long> submit = executor.submit(worker);
      list.add(submit);
    }

    long sum = 0;
    System.out.println(list.size());

    // retrieve results
    for (Future<Long> future : list) {
      try {
        sum += future.get();
      } catch (InterruptedException e) {
        e.printStackTrace();
      } catch (ExecutionException e) {
        e.printStackTrace();
      }
    }

    System.out.println(sum);
    executor.shutdown();
  }
}

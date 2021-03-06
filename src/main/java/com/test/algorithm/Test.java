package com.test.algorithm;

import java.util.concurrent.ForkJoinPool;

public class Test {

  public static void main(String[] args) {
    Problem test = new Problem();
    // check the number of available processors
    int nThreads = Runtime.getRuntime().availableProcessors();
    System.out.println(nThreads);
    Solver solver = new Solver(test.getList());
    ForkJoinPool pool = new ForkJoinPool();
    pool.invoke(solver);
    long result = solver.getResult();
    System.out.println("Done. Result: " + result);
    long sum = 0;
    // check if the result was ok
    for (int i = 0; i < test.getList().length; i++) {
      sum += test.getList()[i];
    }
    pool.shutdown();
    System.out.println("Done. Result: " + sum);
  }
}

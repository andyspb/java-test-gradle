package com.test.lambda;

public class RunnableTest {
  public static void main(String... args) {
    System.out.println("Runnable test >>>");

    // Anonymous Runnable
    Runnable r1 =
        new Runnable() {
          @Override
          public void run() {
            System.out.println("Hello world one!");
          }
        };

    // Lambda Runnable
    Runnable r2 = () -> System.out.println("Hello world two!");

    r1.run();
    r2.run();
  }
}

package com.test.atomic;

/** @author Andrey Krutogolov */
public class Book {
  private String name;

  public Book() {}

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

package com.step.assignments.abstractClasses;

public class StreamReader implements Reader {
  public void read() {
    System.out.println("Reading from Stream");
  }
  public void isReadable(){
    System.out.println("Yes file is readable");
  }

//  public abstract void display();
}


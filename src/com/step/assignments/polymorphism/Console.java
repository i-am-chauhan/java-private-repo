package com.step.assignments.polymorphism;

public class Console implements Page {

  public void display(Object content){
    System.out.println(content);
  }

  @Override
  public Object getPage() {
    return null;
  }

  @Override
  public void click() {
  }

}

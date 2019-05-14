package com.step.assignments.polymorphism;

public class WebPage implements Page {

  @Override
  public void display(Object string) {
    System.out.println(string);

  }

  @Override
  public Object getPage() {
    return "This is some text.";
  }

  public void click(){
    System.out.println("clicked...");
  }
}

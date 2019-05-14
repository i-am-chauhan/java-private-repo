package com.step.assignments.polymorphism;

public class NonInteractiveWebPage implements Page {
  @Override
  public void display(Object string) {
    System.out.println(string);
  }

  @Override
  public Object getPage() {
    return "This is some text on Non interactive webpage.";
  }

  public void click(){
    System.err.println("This is not clickable.");
  }
}

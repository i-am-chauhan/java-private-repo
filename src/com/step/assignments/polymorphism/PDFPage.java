package com.step.assignments.polymorphism;

public class PDFPage implements Page {

  @Override
  public void display(Object string) {

  }

  public Object getPage() {
    return "This is a pdf.";
  }

  @Override
  public void click() {

  }
}

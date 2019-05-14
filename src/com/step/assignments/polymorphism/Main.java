package com.step.assignments.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>(4);
    integers.add(4);
    integers.add(3);
    integers.add(5);
    integers.add(2);

    Console console = new Console();
    console.display(integers);

    PDFPage pdfPage = new PDFPage();
    System.out.println(pdfPage.getPage());

    WebPage webPage = new WebPage();
    System.out.println(webPage.getPage());
    webPage.display("Print it");
    webPage.click();
  }
}

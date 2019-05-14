package com.step.assignments.OOP;

public class Main {

  public static void main(String[] args) {
    Jewellery jewellery = new Jewellery("gold");
    JewelleryBox jewelleryBox = new JewelleryBox(5);
    JewelleryBox jewelleryBox1 = new JewelleryBox(jewelleryBox, jewellery, 3);
    System.out.println(jewelleryBox1.getJwellerCount());
  }
}

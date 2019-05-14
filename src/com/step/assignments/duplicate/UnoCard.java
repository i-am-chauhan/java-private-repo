package com.step.assignments.duplicate;

public class UnoCard implements Duplicable {
  private int value;
  private String color;

  public UnoCard(int value, String color) {
    this.value = value;
    this.color = color;
  }

  @Override
  public UnoCard duplicate() {
    return new UnoCard(this.value, this.color);
  }
}

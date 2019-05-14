package com.step.assignments;

public class Rectangle {
  private double length;
  private double width;

  public Rectangle(double length, double width) {
    this.length = length;
    if(length<0) this.length = 0;
    this.width = width;
    if(width<0) this.width =0;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getArea(){
    return length*width;
  }
}

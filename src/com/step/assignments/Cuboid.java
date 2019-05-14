package com.step.assignments;

public class Cuboid extends Rectangle {
  private double height;

  public Cuboid(double length, double width, double height) {
    super(length, width);
    this.height = height;
    if(height<0) this.height = 0;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getArea(){
    return super.getArea()*height;
  }
}


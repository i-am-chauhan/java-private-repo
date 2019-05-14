package com.step.assignments;

public class Cylinder extends Circle {
  private double height;

  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
    if(height<0) this.height = 0;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double getArea(){
    return (2*Math.PI*super.getRadius())+ super.getArea();
  }

  public double getVolume(){
    return super.getArea()*height;
  }
}

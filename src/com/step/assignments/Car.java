package com.step.assignments;

public class Car extends Vehilcle{
  private int gears;
  private String module;

  public Car(int gears, int speed, String module) {
    super("Car", speed);
    this.gears = gears;
    this.module = module;
  }

  public void increaseGears(){
    this.gears++;
  }

  public String getModule() {
    return module;
  }

  public int getGears() {
    return gears;
  }

  public void decreaseGears(){
    this.gears--;
  }

  public void handleSteering(){
    System.out.println("Handling Steering");
  }

}

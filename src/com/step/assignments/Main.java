package com.step.assignments;

public class Main {

    public static void main(String[] args) {

//        Car toyota = new Car(6, 40, "toyota");
//        toyota.handleSteering();
//        System.out.println(toyota.getGears());
//        toyota.increaseGears();
//        System.out.println(toyota.getGears());
//        System.out.println(toyota.getModule());

//        Cylinder cylinder = new Cylinder(5, 10);
//        System.out.println(cylinder.getSurfaceArea());
//        System.out.println(cylinder.getVolume());

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());


    }
}

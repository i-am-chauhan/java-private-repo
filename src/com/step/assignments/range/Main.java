package com.step.assignments.range;

public class Main {

  public static void main(String[] args) {
    AlphabetRange range = new AlphabetRange('a', 'z');
    System.out.println(range.getAll());
    System.out.println(range.getAll());
    System.out.println(range.contains('A'));
    NumberRange numberRange = new NumberRange(3, 5);
    System.out.println(numberRange.getAll());
    System.out.println(numberRange.contains(4));}
}

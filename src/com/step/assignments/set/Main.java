package com.step.assignments.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Set<Integer> first = new HashSet<Integer>();
    first.add(1);
    first.add(2);
    Set<Integer> second = new HashSet<Integer>();
    second.add(1);
    second.add(2);
    SetOfInteger setOfInteger = new SetOfInteger(first, second);
    System.out.println(setOfInteger.union());
    System.out.println(setOfInteger.intersection());
    System.out.println(setOfInteger.difference());
  }
}

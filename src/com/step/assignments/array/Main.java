package com.step.assignments.array;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
//    List<Integer> integers = new ArrayList<>(6);
//    integers.add(5);
//    integers.add(4);
//    integers.add(3);
//    integers.add(2);
//    integers.add(1);
//    integers.add(0);
//
//
//    ListIterator listIterator = new ListIterator(integers);
//    System.out.println(listIterator.next());
//    System.out.println(listIterator.next());
//    System.out.println(listIterator.next());
//    System.out.println(listIterator.next());
//    System.out.println(listIterator.next());
//    System.out.println(listIterator.next());
//    System.out.println(listIterator.next());

    List<String> a = new ArrayList<>(5);
    a.add("asdf");
    a.add("rewt");
    a.add("wt");
    a.add("t");
    a.add("ewt");
    a.add("wrerewt");
    System.out.println(a);
    Rotate rotate = new Rotate(a);
    System.out.println(rotate.rotate());
  }
}

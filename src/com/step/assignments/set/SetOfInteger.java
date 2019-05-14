package com.step.assignments.set;

import java.util.HashSet;
import java.util.Set;

public class SetOfInteger {

  private Set<Integer> set1;
  private Set<Integer> set2;

  public SetOfInteger(Set<Integer> set1, Set<Integer> set2) {
    this.set1 = set1;
    this.set2 = set2;
  }

  public Set intersection() {
    Set<Integer> result = new HashSet<>();
    set1.forEach(integer -> {
      if (set2.contains(integer)) {
        result.add(integer);
      }
    });
    return result;
  }

  public Set union(){
    Set<Integer> result = new HashSet<>();
    result.addAll(set1);
    result.addAll(set2);
    return result;
  }

  public Set difference() {
    Set<Integer> result = new HashSet<>();
    set1.forEach(integer -> {
      if (!set2.contains(integer)) {
        result.add(integer);
      }
    });
    return result;
  }

}

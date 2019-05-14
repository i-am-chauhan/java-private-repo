package com.step.assignments.array;

import java.util.List;

public class ListIterator {
  private List list;
  private int currentIndex;

  public ListIterator(List list) {
    this.list = list;
    this.currentIndex = -1;
  }

  public boolean hasNext(){
    return (list.size()-1) > currentIndex;
  }

  public Object next(){
    if(!hasNext()) throw new Error("No next element present");
    return list.get(++currentIndex);
  }
}

package com.step.assignments.array;

import java.util.List;

public class Rotate {

  private List list;

  public Rotate(List list) {
    this.list = list;
  }

  public Object rotate(){
    for (int i = 0; i < list.size(); i++) {
      if(i > Math.ceil(list.size()/2)) break;
      Object a;
      a = list.get(i);
      list.set(i, list.get(list.size() - i -1));
      list.set(list.size() - i -1, a);
    }
    return list;
  }
}

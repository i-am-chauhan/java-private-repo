package com.step.assignments.range;

import java.util.ArrayList;
import java.util.List;

public class NumberRange implements Range<Integer> {
  private Integer lowRange;
  private Integer highRange;
  private List<Integer> list;

  public NumberRange(Integer lowRange, Integer highRange) {
    this.lowRange = lowRange;
    this.highRange = highRange;
    this.list = new ArrayList<>();
    this.generateList();
  }

  private void generateList(){
    for (int i = lowRange; i <= highRange ; i++) {
      this.list.add(i);
    }
  }

  @Override
  public List getAll() {
    return list;
  }

  @Override
  public boolean contains(Integer number) {
    return list.contains(number);
  }
}

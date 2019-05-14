package com.step.assignments.range;

import java.util.ArrayList;
import java.util.List;

public class AlphabetRange implements Range<Character> {
  private Character lowRange;
  private Character highRange;
  private List<Character> list;

  public AlphabetRange(Character lowRange, Character highRange) {
    this.lowRange = lowRange;
    this.highRange = highRange;
    this.list = new ArrayList<>();
    this.generateList();
  }

  private void generateList(){
    for (int i = lowRange; i <= highRange ; i++) {
      this.list.add((char) i);
    }
  }

  @Override
  public List getAll() {
    return list;
  }

  @Override
  public boolean contains(Character number) {
    return list.contains(number);
  }
}

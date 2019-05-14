package com.step.assignments.range;

import java.util.ArrayList;
import java.util.List;

public interface Range<T> {

  public List getAll();

  public boolean contains(T content);
}

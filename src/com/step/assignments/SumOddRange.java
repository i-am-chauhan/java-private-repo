package com.step.assignments;

public class SumOddRange {
  public static boolean isOdd(int num){
    if(num < 0) return false;
    return (num % 2) != 0;
  }

  public static int sumOdd(int start, int end){
    if(start < 0 || start > end) return -1;
    int result = 0;
    for (int i = start; i <= end; i++){
      if(isOdd(i)) result += i;
    }
    return result;
  }
}

package com.step.assignments;

public class NumberPalindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome(-11));
  }

  public static boolean isPalindrome(int number){
    int reverse = 0;
    int copyNum = Math.abs(number);
    for(int i = 0; i < ("" + Math.abs(number)).length(); i++){
      int remainder = copyNum % 10;
      reverse = (reverse*10) + remainder;
      System.out.println(reverse);
      copyNum = (int) Math.floor(copyNum/10);
    }
    return Math.abs(number) == reverse;
  }
}

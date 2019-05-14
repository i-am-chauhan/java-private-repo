package com.step.assignments;

import java.util.Scanner;

public class SumOfNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int j = 0;
    while(scanner.hasNextInt()) {
      sum += scanner.nextInt();
      j++;
    }
    System.out.println("Sum = "+ sum + ", Avg = "+ (double) (sum/j));
  }
}

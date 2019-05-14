package com.step.assignments;

public class MinutesToYearsDaysCalculator {

  public static void printYearsAndDays(long mins){
    if(mins < 0){
      System.out.println("Invalid Value");
      return;
    }
    long hours = (long) (Math.floor(mins/60));
    long days = (long) Math.floor(hours/24);
    long years = (long) (Math.floor(days/365));
    long remainingdays = (days % 365);
    System.out.println(mins+" min = " + years + " y and " + remainingdays + " d");
  }
}

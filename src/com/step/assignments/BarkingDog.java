package com.step.assignments;

public class BarkingDog {
 public static boolean shouldWakeUp(boolean isBarking, int hourOfday) {
  if (!isBarking) {
   return false;
  }
  if (hourOfday < 8 && hourOfday >= 0 || hourOfday > 22 && hourOfday <= 23) {
   return true;
  }
  return false;
 }
}

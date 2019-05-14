package com.step.assignments.array;

import java.util.Scanner;

class Player {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    // game loop
    while (true) {
      int mountainToFire = 0;
      for (int i = 0; i < 8; i++) {
        int highestMountain = 0;
        int mountainH = in.nextInt();// represents the height of one mountain.

        if(Math.max(highestMountain, mountainH) == mountainH){
          System.out.println(highestMountain + "=======" + mountainH);
          mountainToFire = i;
          System.out.println("**********"+mountainToFire);
        }
      }


      // Write an action using System.out.println()
      // To debug: System.err.println("Debug messages...");

      System.out.println(mountainToFire); // The index of the mountain to fire on.
    }
  }
}

package com.step.assignments;

public class PlayingCat {

  public static boolean isCatPlaying(boolean summer, int temperature){
    int lowerLimit = 25;
    int upperLimit = 35;
    if(summer) upperLimit = 45;
    return temperature>=lowerLimit && temperature<=upperLimit;
  }
}

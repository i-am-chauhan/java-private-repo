package com.step.assignments.genericClasses;

public class CricketTeam extends Team {
  public CricketTeam(String name, int won, int lost, int draw) {
    super(name, won, lost, draw);
  }

  private int calculatePoints(){
    return super.calculatePoints(2,0,1);
  }
}

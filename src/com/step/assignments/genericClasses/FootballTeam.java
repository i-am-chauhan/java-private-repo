package com.step.assignments.genericClasses;

public class FootballTeam extends Team {

  public FootballTeam(String name, int won, int lost, int draw) {
    super(name, won, lost, draw);
  }

  private int calculatePoints(){
    return super.calculatePoints(1,-2,0);
  }
}

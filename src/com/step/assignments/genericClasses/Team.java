package com.step.assignments.genericClasses;

public class Team {
  private String name;
  private int won;
  private int lost;
  private int draw;

  public Team(String name, int won, int lost, int draw) {
    this.name = name;
    this.won = won;
    this.lost = lost;
    this.draw = draw;
  }

  public int calculatePoints(int winPoints, int lostPoints, int drawPoints){
    return won*winPoints + lost*lostPoints + draw*drawPoints;
  }
}

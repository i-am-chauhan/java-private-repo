package com.step.assignments.genericClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class LeagueTable<T> {
  private ArrayList<T> teams;

  public LeagueTable(ArrayList teams) {
    this.teams = teams;
  }

  public void print(){
    System.out.println(Arrays.toString(new ArrayList[]{}));
  }

  public void addTeam(T team){
    this.teams.add(team);
  }

//  private ArrayList compareTeams(){
//    ArrayList<Team> ts = new ArrayList<>(this.teams.size());
//    for (int i = 0; i < ts.size(); i++) {
//      Team maxPointsTeam = (Team) this.teams.get(i);
//      for (int j = i+1; j <ts.size() ; j++) {
//        Team team = (Team) this.teams.get(j);
//        if(maxPointsTeam.calculatePoints() < team.calculatePoints()){
//          maxPointsTeam = team;
//        }
//      }
//      ts.add(maxPointsTeam);
//    }
//    return ts;
//  }
}

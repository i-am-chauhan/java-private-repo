package com.step.assignments.genericClasses;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    FootballTeam brazil = new FootballTeam("Brazil", 5, 3, 6);
    FootballTeam india = new FootballTeam("India", 7, 3, 6);
    FootballTeam pak = new FootballTeam("Pak", 2, 6, 2);

    CricketTeam brazil1 = new CricketTeam("Brazil", 5, 3, 6);

    LeagueTable<FootballTeam> footballTeamLeagueTable = new LeagueTable<>(new ArrayList<FootballTeam>(3));
    footballTeamLeagueTable.addTeam(brazil);
    footballTeamLeagueTable.addTeam(india);
    footballTeamLeagueTable.addTeam(pak);
    footballTeamLeagueTable.print();
  }
}

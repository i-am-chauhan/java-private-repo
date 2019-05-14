package com.step.assignments.tic_tac_toe;

import java.util.ArrayList;

public class Game {

  private ArrayList<Player> players;
  private Player currentPlayer;
  private int currentIndex;
  private Board board;

  public Game(Player firstPlayer, Player secondPlayer) {
    this.players.add(firstPlayer);
    this.players.add(secondPlayer);
    this.currentIndex = 0;
    this.board = new Board();
  }

  public void setCurrentPlayer(){
    this.currentPlayer = this.players.get(this.currentIndex);
    this.currentIndex = 1 - this.currentIndex;
  }

  public void makeMove(int move){
    this.board.fill(this.currentPlayer.getSymbol(), move);
    this.currentPlayer.makeMove(move);
  }

  public boolean hasCurrentPlayerWon(){
    return this.currentPlayer.hasWon();
  }

}

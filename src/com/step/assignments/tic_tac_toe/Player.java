package com.step.assignments.tic_tac_toe;

import java.util.ArrayList;

public class Player {
  private String name;
  private String symbol;
  private ArrayList<Integer> moves;
  private int[][] winningMoves;

  public Player(String name, String symbol) {
    this.name = name;
    this.symbol = symbol;
    this.moves = new ArrayList();
    this.winningMoves = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {1, 5, 9},
            {3, 5, 7},
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9}
    };
  }

  public String getName() {
    return name;
  }

  public String getSymbol() {
    return symbol;
  }

  public void makeMove(int move) {
    this.moves.add(move);
  }

  public boolean hasWon(){
    boolean result = false;
    for (int index = 0; index < winningMoves.length; index++) {
      int moveSet[] = winningMoves[index];
      result = false;
      for (int moveIndex = 0; moveIndex < moveSet.length; moveIndex++) {
        result = this.moves.contains(moveSet[moveIndex]);
      }
      if(result) break;
    }
    return result;
  }
}

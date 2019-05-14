package com.step.assignments.tic_tac_toe;

import java.util.ArrayList;

public class Board {

  private ArrayList<Object> board;

  public Board() {
    this.board = new ArrayList<>(9);
    setBoard();
  }

  private void setBoard(){
    for (int i = 1; i < 10 ; i++) {
      this.board.add(i);
    }
  }

  public ArrayList getBoard(){
    return this.board;
  }

  public void fill(String symbol, int position){
    this.board.set(position-1, symbol);
  }
}

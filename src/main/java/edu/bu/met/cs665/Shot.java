package edu.bu.met.cs665;

import java.util.Random;


public class Shot {
  public Shot() {
    
  }
  
  //Row
  int row; 
  //Column
  int column;

  
  /**
   * the shot opition with random position and update the states. 
   * @param board the board object.
   * @param ship the ship object.
   * @param result the object result.
   * 
   * 
   */
  
  public void fire(Board board,Battleship ship,Result result) {
    //see if the game already ends
    if (result.gameend == 1) {
      System.out.println("This game is already end, please start a new one.");
      return; 
    }
    //import random
    Random r = new Random();
    //get the random position to shot 
    int c = r.nextInt(board.board.length * board.board[1].length);
    row = c / board.board.length;
    column = c % board.board.length;
    // change number to row and column
    int d = board.board[row][column];
    switch (d) {
      // if the number is 0 menas nothing happen
      case 0 :
        board.board[row][column] = 4;
        break;
      //means there is a ship
      case 1:
        board.board[row][column] = 5;
        ship.ship.get(0).remove(0);
        break;
      //means there is a ship
      case 2:
        board.board[row][column] = 5;
        ship.ship.get(1).remove(0);
        break;        
      //means there is a ship   
      case 3:
        board.board[row][column] = 5;
        ship.ship.get(2).remove(0);
        break;           
      default:
        System.out.println("there is something wrong");
        break;

    }
    // call result to update the game states
    result.gameend(ship, board);
  
  }
  
  /**
   * the shot opition with given position and update the states. 
   * @param board the board object.
   * @param ship the ship object.
   * @param result the object result.
   * @param row the row of the board.
   * @param column the column of the board. 
   * 
   */
  
  public void fire(Board board,Battleship ship,Result result, int row, int column) {
    //see if the game ends 
    if (result.gameend == 1) {
      System.out.println("This game is already end, please start a new one.");
      return;
    }
    this.row = row;
    this.column = column;
    int d = board.board[row][column];
    switch (d) {
      case 0 :
        board.board[row][column] = 4;
        break;
      case 1:
        board.board[row][column] = 5;
        ship.ship.get(0).remove(0);
        break;
      case 2:
        board.board[row][column] = 5;
        ship.ship.get(1).remove(0);
        break;        
      case 3:
        board.board[row][column] = 5;
        ship.ship.get(2).remove(0);
        break;       
      default:
        System.out.println("there is something wrong");
        break;

    }   
    result.gameend(ship, board);

  }
  
  
}


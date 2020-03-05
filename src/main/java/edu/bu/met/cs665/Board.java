package edu.bu.met.cs665;

public class Board {
  //make an arraylist to store the number for board.
  public int[][] board; 
  
  public Board(){
    
  }
  
  /**
   * initialize the game boards board size: 5*5.
   * 
   * 
   * 
   */
  
  public void init() {
    board = new int[5][5];
    //use double for loop to add the number to the list.
    for (int i = 0; i < board.length;i++) {  
      for (int j = 0; j < board[i].length; j++) {
        // the origin number is 0 in the array list.
        board[i][j] = 0;    
      }  
    }   
  }
  
  /**
   * initialize the game boards board size: m * n.
   * 
   * @param m : row
   * @param n  : column 
   */
  
  public void init(int m, int n) {
    board = new int[m][n];
    for (int i = 0; i < board.length;i++) {
      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = 0;    
      }  
    }   
  }
  
  
}

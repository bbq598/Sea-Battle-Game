package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Battleship {
  //create an arraylist to store the ship 
  List<ArrayList<Integer>> ship;

  
  public Battleship() {
    
  }
  
  /**
   * generate 3 ships with size between 2-5.
   * @param board the board object.
   * 
   * 
   */
  
  public void init(Board board) {
    ship = new ArrayList<>();
    //import random from java random
    Random r = new Random();
    //get 0 or 1 to decide ships is horizontal or vertical 
    int a = r.nextInt(2);
    ArrayList<Integer> b = new ArrayList<>();     
    switch (a) {
      default:
        System.out.println("there is something wrong");
        break;
      //case 0 means ships are horizontal
      case 0:       
        //to choose 3 not repeately row in the board 
        while (b.size() != 3) {          
          int c = r.nextInt(board.board.length);
          if (!b.contains(c)) {
            b.add(c);
          }                             
        }
        //add three ship to the choosen row
        for (int i = 0; i < 3; i++) {
          ArrayList<Integer> f = new ArrayList<>();   
          int c = r.nextInt(board.board[1].length - 1);
          if (board.board[1].length - c > 5) {
            int e = r.nextInt(4) + 2; 
            for (int j = 0; j < e; j++) {
              board.board[b.get(i)][c + j] = i + 1;
              f.add(board.board[b.get(i)][c + j]);              
            }                      
          } else {
            for (int k = 0; k < board.board.length - c;k++) {
              board.board[b.get(i)][c + k] = i + 1;
              f.add(board.board[b.get(i)][c + k]);                
            }
          }
          ship.add(f);
        }
        break;
      //case 1 means the ship are vertical  
      case 1: 
        //choose 3 not repeat column in the board
        while (b.size() != 3) {          
          int c = r.nextInt(board.board[1].length);
          if (!b.contains(c)) {
            b.add(c);
          }                                                                                    
        }   
        //add 3 ships to the choosen column
        for (int i = 0; i < 3; i++) {
          ArrayList<Integer> f = new ArrayList<>();   
          int c = r.nextInt(board.board.length - 1);
          if (board.board.length - c > 5) {
            int e = r.nextInt(4) + 2; 
            for (int j = 0; j < e; j++) {
              board.board[c + j][b.get(i)] = i + 1;
              f.add(board.board[c + j][b.get(i)]);
            }             
          
          } else {
            for (int k = 0; k < board.board.length - c;k++) {
              board.board[c + k][b.get(i)] = i + 1;
              f.add(board.board[c + k][b.get(i)]);                
            }
          }
          ship.add(f);
        }
        break;
    }    
  }
}
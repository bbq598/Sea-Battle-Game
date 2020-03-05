package edu.bu.met.cs665;

public class Result {
  public Result() {
  
  }
  
  //store if game already ends
  int gameend;
  
  /**
   * show the board with symbols. 
   * @param board the board object.
   * 
   * 
   *
   * 
   */
  
  public void boardstate(Board board) {
    for (int i = 0; i < board.board.length;i++) {
      for (int j = 0; j < board.board[i].length;j++) {
        //use switch to chanage the number to symbol
        switch (board.board[i][j]) {
          //'*' means the position get shot but there is nothing.
          case 4:
            System.out.print("*" + "  ");
            break;          
          //'X' means the position get shot and hit.
          case 5:
            System.out.print("X" + "  ");
            break;
          // '-' means the postion still not get shot.  
          default:
            System.out.print("-" + "  ");
            break;
        }       
      }
      System.out.println("\n");
    }     
    
  }
  
  /**
   * check if the game ends, that means all ship get destoy. 
   * @param board the board object.
   * @param ship the object of ship.
   * 
   *  
   */

  public void gameend(Battleship ship,Board board) {
    //check if all ship all get destoried. 
    //if the lenth of ship eauqls 0 that means all ships get destoried. 
    if (ship.ship.get(0).size() + ship.ship.get(1).size() + ship.ship.get(2).size() == 0) {
      System.out.println("The game is over, you are the winner.\nThe final result are:\n");
      //if so change the game states to already end. 
      this.gameend = 1;
      boardstate(board); 
    
    } 
  
  }
}

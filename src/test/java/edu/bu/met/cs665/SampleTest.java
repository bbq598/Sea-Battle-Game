package edu.bu.met.cs665;
import static org.junit.Assert.assertTrue;
import org.junit.Test;



public class SampleTest {
// 0 still not be shot 
// 1 ship number 1
// 2 ship number 2 
// 3 ship number 3 
// 4 nothing there, already shot
// 5: X hit a part of a ship
  
  /**
   *test the output of the project.
   * 
   */
  
  @Test
  public void main() {
     Board board = new Board();
     Battleship ship = new Battleship();
     Shot fire = new Shot();
     Result result = new Result();
     GameFacade facade = new GameFacade(board,ship,fire,result);
     facade.quickstart();
     facade.advshot(0,0);           
     assertTrue(board.board[0][0] == 1 || board.board[0][0] == 2 || board.board[0][0] == 3 || board.board[0][0] == 4 || board.board[0][0] == 5);

     
     facade.advshot(1,1);                
     assertTrue(board.board[1][1] == 1 || board.board[1][1] == 2 || board.board[1][1] == 3 || board.board[1][1] == 4 || board.board[1][1] == 5);
     
     
     facade.showboardstate();
     
     
    
    
  }

}

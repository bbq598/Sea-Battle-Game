package edu.bu.met.cs665;

public class GameFacade {
  Board board;
  Battleship ship;
  Shot fire;
  Result result;
  
  /**
   * prepare fot the game.
   * @param board the board object.
   * @param ship the object of ship.
   * @param fire the object of shot
   * @param result the object of result 
   * 
   *  
   */
  
  public GameFacade(Board board, Battleship ship,Shot fire,Result result) {
    this.board = board;
    this.result = result;
    this.fire = fire;
    this.ship = ship;
  }
  
  /**
   *quick start the game wiht default setting.
   * 
   *  
   */
  
  public void quickstart() {
    board.init();
    ship.init(board);
  }
  
  /**
   *start the game wiht adv setting.
   *@param m the row of board.  
   * @param n the column of board. 
   */
  
  public void advstart(int m, int n) {
    board.init(m,n);
    ship.init(board);
  }
  
  /**
   *fire a shot with defual setting, randomly.
   * 
   */
  
  public void quickshot() {
    fire.fire(board, ship, result);    
  }
  
  /**
   *fire a shot with given poistion.
   *@param row the row want to shot.
   * @param column the column want to shot.
   */
  
  public void advshot(int row,int column) {
    fire.fire(board, ship, result, row, column);
  }
  
  /**
   *show the current states of all board.
   * 
   */
  
  public void showboardstate() {
    result.boardstate(board);
  }
  
  
}

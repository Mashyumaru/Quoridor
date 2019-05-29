package quoridor;

import java.lang.*;

public class Board {

  private int width;
  private int height;

  public Board(int width, int height) {
    if (width > 2 && height > 2) {
      this.width = width;
      this.height = height;
    }
    else throw new IllegalArgumentException("Width and height must be > 2");
  }

  public void placeWall(int x, int y, int x2, int y2) {

  }

  public void movePawn(int x, int y) {

  }

  public boolean checkIfWon(Pawn pawn) {
    return
  }

}

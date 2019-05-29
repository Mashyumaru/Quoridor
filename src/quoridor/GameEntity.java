package quoridor;

public class GameEntity {
  private int posX;
  private int posY;

  public GameEntity(int x, int y) {

  }

  public int[] getPos() {
    int[] ret = new int[2];
    ret[0] = this.posX;
    ret[1] = this.posY;
    return ret;
  }
  
}

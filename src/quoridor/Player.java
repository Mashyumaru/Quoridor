package quoridor;

import java.lang.*;

public abstract class Player {

  private String name;
  private int spawnX;
  private int spawnY;
  private Pawn pawn;

  public Player(String name, int spawnX, int spawnY) {
    if (name != null) this.name = name;
    else throw new NullPointerException();

    this.spawnX = spawnX;
    this.spawnY = spawnY;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name != null) this.name = name;
    else throw new NullPointerException("No name given");
  }

/*  public Pawn getPawn() {
    return ;;
  } */

  public void setPawn(Pawn pawn) {
    if (name != null) this.pawn = pawn;
    else throw new NullPointerException("No pawn given");

  }

  public void play() {;;}


}

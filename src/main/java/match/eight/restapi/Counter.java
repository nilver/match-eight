package match.eight.restapi;

public class Counter {
  private int count;
  private Player player;

  public Counter(Player player, int count) {
    this.count = count;
    this.player = player;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }
}

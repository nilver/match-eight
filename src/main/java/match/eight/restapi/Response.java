package match.eight.restapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

  private List<Player> players;

  public Response() {
  }

  public List<Player> getValues() {
    return players;
  }

  public void setValues(List<Player> players) {
    this.players = players;
  }

  @Override
  public String toString() {
    return "Response{" +
        ", players=" + players +
        '}';
  }
}
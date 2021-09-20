package match.eight.restapi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {

  private String  firstName;
  private String  lastName;
  private int inches;

  public Player() {
  }

  @JsonCreator
  public Player(
      @JsonProperty("first_name") String firstName,
      @JsonProperty("last_name") String lastName,
      @JsonProperty("h_in") int inches) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.inches = inches;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getInches() {
    return inches;
  }

  public void setInches(int inches) {
    this.inches = inches;
  }

  @Override
  public String toString() {
    return "Player{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", inches=" + inches +
        '}';
  }
}
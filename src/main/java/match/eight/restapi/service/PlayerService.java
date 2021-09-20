package match.eight.restapi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import match.eight.restapi.Player;
import match.eight.restapi.Counter;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {


  public  List<String>  processHeights(List<Player> playerList, int input) {

    List<String> result = new ArrayList<>();
    HashMap<Integer, Counter > ocurrencies = new HashMap<Integer, Counter>();

    playerList.forEach(player -> {
      int rest = input - player.getInches();
      if (ocurrencies.containsKey(rest)) {
        Counter counter = ocurrencies.get(rest);
        int count = counter.getCount();
        for (int j = 0; j < count; j++) {
          result.add("-- "+ counter.getPlayer().getFirstName()+" "+ counter.getPlayer().getLastName()+ "      "+ player.getFirstName()+" "+ player.getLastName()+ "\n");
        }
      }
      addPlayer(ocurrencies, player);
    });

    return result;
  }

  public void print(List<String> result){
    if(result.isEmpty()){
      System.out.println("No maches fount");
    }else {
      result.forEach(System.out::print);
    }

  }

  private void addPlayer(HashMap<Integer, Counter> ocurrencies, Player player) {
    Counter counter;
    if (ocurrencies.containsKey(player.getInches())){
      counter = ocurrencies.get(player.getInches());
      counter.setCount(counter.getCount()+ 1);
    }
    else
    {
      counter = new Counter(player, 1);
    }
    ocurrencies.put(player.getInches(), counter);
  }
}


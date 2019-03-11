import models.Kadra;

import java.util.List;

public interface LechSelectorInterface {

    List<Kadra> getAllPlayers();

    List<Kadra> getPlayersByYear();

    List<Kadra> getPlayersByName();

    List<Kadra> getPlayersByCountry(String countryName);

    void getAverageAge();

    void getPlayersFrom80s();

    void getPlayersFrom2000s();

    void getOldestPlayer();

    void getYoungestPlayer();


}

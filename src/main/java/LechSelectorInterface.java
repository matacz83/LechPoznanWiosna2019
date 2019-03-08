import models.Kadra;

import java.util.List;

public interface LechSelectorInterface {

    List<Kadra> getAllPlayers();

    List<Kadra> getPlayersByYear();

    List<Kadra> getPlayersByCountry(String countryName);
}

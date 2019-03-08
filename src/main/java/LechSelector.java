import dao.DaoProvider;
import models.Kadra;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LechSelector implements LechSelectorInterface {
    private List<Kadra> pilkarze = new ArrayList<>();

    public LechSelector(DaoProvider daoProvider) {
        this.pilkarze = daoProvider.getLechList();
    }

    @Override
    public List<Kadra> getAllPlayers() {
        return this.pilkarze;
    }

    @Override
    public List<Kadra> getPlayersByYear() {
        List<Kadra> result = this.pilkarze
                .stream()
                .sorted((p1, p2) -> p1.getRok().compareTo(p2.getRok()))
                .collect(Collectors.toList());
        return result;
    }

    @Override
    public List<Kadra> getPlayersByCountry(String countryName) {
        List<Kadra> result = this.pilkarze
                .stream()
                .sorted((p1, p2) -> p1.getKraj().compareTo(p2.getKraj()))
                .collect(Collectors.toList());
        return result;
    }
}

import dao.DaoProvider;
import models.Kadra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
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
    public List<Kadra> getPlayersByName() {
        List<Kadra> result = this.pilkarze
                .stream()
                .sorted((p1, p2) -> p1.getNazwisko().compareTo(p2.getNazwisko()))
                .collect(Collectors.toList());
        return result;
    }

    @Override
    public List<Kadra> getPlayersByCountry(String countryName) {
        List<Kadra> result = this.pilkarze
                .stream()
                .sorted((p1, p2) -> p1.getKraj().compareTo(p2.getKraj()))
                .filter(kadra -> kadra.getKraj().equals(countryName))
                .collect(Collectors.toList());
        return result;
    }

    @Override
    public void getAverageAge() {
        double sredniRok = this.pilkarze
                .stream()
                .collect(Collectors.averagingDouble(p -> p.getRok()));
        LocalDate dzis = LocalDate.now();
        double roznicaLat = dzis.getYear() - sredniRok;
        int zaokraglonaRoznicaLat = (int) (roznicaLat);
        System.out.format("Średni wiek piłkarzy Lecha Poznań, to " + zaokraglonaRoznicaLat + " lat." + "\n");
    }

    @Override
    public void getPlayersFrom80s() {
        List<Kadra> urodzeni80s = this.pilkarze
                .stream()
                .filter((p) -> p.getRok() < 1990)
                .collect(Collectors.toList());
        for (Kadra pilkarze : urodzeni80s)
            System.out.println(pilkarze.toString());
    }

    @Override
    public void getPlayersFrom2000s() {
        List<Kadra> urodzeni2000s = this.pilkarze
                .stream()
                .filter((p) -> p.getRok() >= 2000)
                .collect(Collectors.toList());
        for (Kadra pilkarze : urodzeni2000s)
            System.out.println(pilkarze.toString());
    }

    @Override
    public void getOldestPlayer() {
    /*double maxRok = this.pilkarze
            .stream()*/
    }

    @Override
    public void getYoungestPlayer() {

    }


}

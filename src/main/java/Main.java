import dao.DaoProvider;
import models.Kadra;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DaoProvider daoProvider = new DaoProvider();
        LechSelector lechSelector = new LechSelector(new DaoProvider());

        System.out.println("==KADRA LECHA POZNAŃ (WIOSNA 2019)==");
        System.out.println(daoProvider.getLechList());

        System.out.println("\n==KADRA LECHA POZNAŃ ALFABETYCZNIE==");
        System.out.println(Arrays.asList(lechSelector.getPlayersByName()));

        System.out.println("\n==KADRA LECHA POZNAŃ OD NAJSTARSZYCH)==");
        System.out.println(Arrays.asList(lechSelector.getPlayersByYear()));

        System.out.println("\n==PIŁKARZE LECHA POZNAŃ URODZENI W LATACH 80-TYCH==");
        lechSelector.getPlayersFrom80s();

        System.out.println("\n==PIŁKARZE LECHA POZNAŃ URODZENI PO ROKU 2000==");
        lechSelector.getPlayersFrom2000s();

        System.out.println("\n==ŚREDNI WIEK PIŁKARZY LECHA POZNAŃ (WIOSNA 2019)==");
        lechSelector.getAverageAge();

        System.out.println("\n==NAJSTARSZY ZAWODNIK LECHA POZNAŃ (WIOSNA 2019)==");
        lechSelector.getOldestPlayer();

        System.out.println("\n==NAJMŁODSZY ZAWODNIK LECHA POZNAŃ (WIOSNA 2019)==");
        lechSelector.getYoungestPlayer();

        System.out.println("\n==LISTA PIŁKARZY LECHA POZNAŃ (WIOSNA 2019) Z WYBRANEGO KRAJU==");
        System.out.print("Podaj nazwę kraju, by uzyskać listę piłkarzy Lecha z tego kraju: ");
        Scanner scanner = new Scanner(System.in);
        String podaj_kraj = scanner.nextLine();
        System.out.println(Arrays.asList(lechSelector.getPlayersByCountry(podaj_kraj)));
    }
}

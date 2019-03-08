import dao.DaoProvider;
import models.Kadra;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DaoProvider daoProvider = new DaoProvider();
        System.out.println("==KADRA LECHA POZNAŃ (WIOSNA 2019)==");
        System.out.println(daoProvider.getLechList());
        System.out.println("\n==KADRA LECHA POZNAŃ OD NAJSTARSZYCH (WIOSNA 2019)==");
        LechSelector lechSelector = new LechSelector(new DaoProvider());
        System.out.println(Arrays.asList(lechSelector.getPlayersByYear()));
        System.out.println("\n==LISTA PIŁKARZY LECHA POZNAŃ (WIOSNA 2019) Z WYBRANEGO KRAJU==");
        System.out.print("Podaj nazwę kraju, by uzyskać listę piłkarzy z danego kraju: ");
        Scanner scanner = new Scanner(System.in);
        String podaj_kraj = scanner.nextLine();
        System.out.println(Arrays.asList(lechSelector.getPlayersByCountry(podaj_kraj)));

    }
}

import dao.DaoProvider;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DaoProvider daoProvider = new DaoProvider();
        System.out.println("==KADRA LECHA POZNAŃ (WIOSNA 2019)==");
        System.out.println(daoProvider.getLechList());
        System.out.println("\n==KADRA LECHA POZNAŃ OD NAJSTARSZYCH (WIOSNA 2019)==");
        LechSelector lechSelector = new LechSelector(new DaoProvider());
        System.out.println(Arrays.asList(lechSelector.getPlayersByYear()));


    }
}

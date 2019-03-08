package models;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineManager {

    private static String getResponse(String urlQueryString) throws Exception {
        URL url = new URL(urlQueryString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.addRequestProperty("User-Agent", "Mozilla/4.76");
        connection.connect();
        InputStream inStream = connection.getInputStream();
        return new Scanner(inStream, "UTF-8").useDelimiter("\\Z").next();
    }

    private static List<Kadra> getPOJO(String rawJSON) {
        Gson gson = new Gson();
        List<Kadra> listaPilkarzy = (ArrayList<Kadra>) gson.fromJson(rawJSON, new TypeToken<ArrayList<Kadra>>() {
        }.getType());

        return listaPilkarzy;
    }

    public static List<Kadra> getLechWiosnaList() throws Exception {
        return getPOJO(getResponse("https://raw.githubusercontent.com/matacz83/LechPoznanWiosna2019/master/src/main/java/lech_wiosna.json"));
    }
}
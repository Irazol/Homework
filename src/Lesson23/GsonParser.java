package Lesson23;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;


import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GsonParser {
    public static void parseJson(String url) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));

        ExchangeRates [] exchangeRates  = gson.fromJson(jsonReader, ExchangeRates [].class);

        for (ExchangeRates  exchangeRate : exchangeRates) {
            System.out.println(exchangeRate);
        }

        String gsonString = gson.toJson(exchangeRates);

        Files.write(Paths.get("C:\\Javaf\\Homework\\src\\Lesson23\\gsonCurrency.json"),
                gsonString.getBytes(), StandardOpenOption.CREATE);
    }
}

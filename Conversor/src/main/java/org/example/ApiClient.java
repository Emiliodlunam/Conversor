package org.example;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class ApiClient {
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";

    public static JsonObject obtenerTasasCambio(String monedaOrigen) {
        try {
            String url = API_URL + monedaOrigen;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                System.out.println("Error al obtener los datos de la API. Código de estado: " + response.statusCode());
                return null;
            }

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            JsonObject rates = jsonObject.getAsJsonObject("rates");
            return rates;
        } catch (Exception e) {
            System.out.println("Error en la solicitud a la API: " + e.getMessage());
            return null;
        }
    }
}

package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.JsonObject;

public class CurrencyConverter {
    private final Map<String, Double> cache = new HashMap<>();

    public String convertir(String fromCurrency, String toCurrency, Scanner scanner) {
        System.out.printf("Ingrese la cantidad de %s que desea convertir: ", fromCurrency);
        double amount = scanner.nextDouble();

        double rate = obtenerTasaCambio(fromCurrency, toCurrency);
        if (rate == -1) {
            System.out.println("No se pudo obtener la tasa de cambio. Verifique su conexión o intente más tarde.");
            return "Conversión fallida";
        }

        double convertedAmount = amount * rate;
        String resultado = String.format("%.4f %s = %.4f %s", amount, fromCurrency, convertedAmount, toCurrency);
        System.out.println(resultado);
        return resultado;
    }

    private double obtenerTasaCambio(String fromCurrency, String toCurrency) {
        String cacheKey = fromCurrency + "_" + toCurrency;

        // Verificar si la tasa está en el caché
        if (cache.containsKey(cacheKey)) {
            return cache.get(cacheKey);
        }

        // Obtener tasas de cambio desde ApiClient
        JsonObject rates = ApiClient.obtenerTasasCambio(fromCurrency);
        if (rates == null) {
            return -1;
        }

        if (!rates.has(toCurrency)) {
            System.out.println("Moneda de destino no encontrada en las tasas de cambio.");
            return -1;
        }

        double rate = rates.get(toCurrency).getAsDouble();
        cache.put(cacheKey, rate); // Almacenar en caché
        return rate;
    }
}

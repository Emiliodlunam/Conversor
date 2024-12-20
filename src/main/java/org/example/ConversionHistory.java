package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConversionHistory {
    private final List<String> historial = new ArrayList<>();
    private String ultimaConversion = null;

    public void add(String conversion) {
        if (!conversion.equals("Conversión fallida")) {
            historial.add(conversion);
            ultimaConversion = conversion;
        }
    }

    public void mostrarHistorial() {
        System.out.println("Historial de conversiones:");
        if (historial.isEmpty()) {
            System.out.println("No hay conversiones registradas.");
        } else {
            for (String conversion : historial) {
                System.out.println(conversion);
            }
        }
    }

    public void invertirUltimaConversion(CurrencyConverter currencyConverter) {
        if (ultimaConversion == null) {
            System.out.println("No hay conversiones para invertir.");
            return;
        }

        String[] partes = ultimaConversion.split(" ");
        String fromCurrency = partes[1];
        String toCurrency = partes[3];
        double cantidad = Double.parseDouble(partes[0]);

        currencyConverter.convertir(toCurrency, fromCurrency, new Scanner(String.valueOf(cantidad)));
    }
}

package org.example;

import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();
        ConversionHistory history = new ConversionHistory();

        boolean running = true;
        while (running) {
            UserInterface.mostrarMenu();
            System.out.print("Elija una opción válida: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> history.add(currencyConverter.convertir("USD", "ARS", scanner)); // Dólar a Peso argentino
                case 2 -> history.add(currencyConverter.convertir("ARS", "USD", scanner)); // Peso argentino a Dólar
                case 3 -> history.add(currencyConverter.convertir("USD", "BRL", scanner)); // Dólar a Real brasileño
                case 4 -> history.add(currencyConverter.convertir("BRL", "USD", scanner)); // Real brasileño a Dólar
                case 5 -> history.add(currencyConverter.convertir("USD", "COP", scanner)); // Dólar a Peso colombiano
                case 6 -> history.add(currencyConverter.convertir("COP", "USD", scanner)); // Peso colombiano a Dólar
                case 7 -> history.add(currencyConverter.convertir("USD", "EUR", scanner)); // Dólar a Euro
                case 8 -> history.add(currencyConverter.convertir("EUR", "USD", scanner)); // Euro a Dólar
                case 9 -> history.add(currencyConverter.convertir("USD", "GBP", scanner)); // Dólar a Libra Esterlina
                case 10 -> history.add(currencyConverter.convertir("GBP", "USD", scanner)); // Libra Esterlina a Dólar
                case 11 -> history.add(currencyConverter.convertir("USD", "JPY", scanner)); // Dólar a Yen Japonés
                case 12 -> history.add(currencyConverter.convertir("JPY", "USD", scanner)); // Yen Japonés a Dólar
                case 13 -> history.add(currencyConverter.convertir("USD", "MXN", scanner)); // Dólar a Peso Mexicano
                case 14 -> history.add(currencyConverter.convertir("MXN", "USD", scanner)); // Peso Mexicano a Dólar
                case 15 -> history.mostrarHistorial(); // Mostrar historial
                case 16 -> {
                    System.out.println("Gracias por usar el Conversor de Moneda. ¡Hasta pronto!");
                    running = false;
                }

                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

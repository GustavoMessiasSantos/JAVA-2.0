package principal;

import java.util.Scanner;

public class ConversorTemperatura {

    public static double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = celsiusParaFahrenheit(temperaturaCelsius);

        System.out.println(temperaturaCelsius + " ºC são equivalentes a " + temperaturaFahrenheit + " ºF.");

        scanner.close();
    }
}
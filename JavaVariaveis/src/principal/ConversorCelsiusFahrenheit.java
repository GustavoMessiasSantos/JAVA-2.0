package principal;
import java.util.Scanner;

public class ConversorCelsiusFahrenheit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a temperatura em �C: ");
		double celsius = scanner.nextDouble();

		double fahrenheit = (celsius * 9 / 5) + 32;

		System.out.printf("A temperatura � %.2f �F", fahrenheit);
		scanner.close();

	}

}

package principal;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro para calcular o fatorial: ");
		int numero = scanner.nextInt();

		if (numero < 0) {
			System.out.println("O fatorial de um número negativo não é definido.");
		} else {
			int fatorial = 1;
			for (int i = 1; i <= numero; i++) {
				fatorial *= i;
			}
			System.out.println("O fatorial de " + numero + " é = " + fatorial);
		}
		scanner.close();

	}
}

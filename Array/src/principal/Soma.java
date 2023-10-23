package principal;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[10];
		int soma = 0;
		
		for (int i = 0; i < 10; i++) {
			numeros[i] = i + 1;
		}
		
		for (int i = 0; i < 10; i++) {
			soma += numeros[i];
		}

		System.out.println("Array de inteiros de 1 a 10:");
		for (int i = 0; i < 10; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("\nSoma de todos os elementos: " + soma);

		scanner.close();

	}

}

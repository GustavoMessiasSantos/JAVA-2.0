package principal;

import java.util.Scanner;

public class NumeroPrimo {

	public static boolean isPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero para verificar se � primo: ");
		int numero = scanner.nextInt();

		if (isPrimo(numero)) {
			System.out.println(numero + " � um n�mero primo.");
		} else {
			System.out.println(numero + " n�o � um n�mero primo.");
		}
	}
}
package principal;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine();

		// Remove espaços e converte a palavra para letras minúsculas
		palavra = palavra.replaceAll(" ", "").toLowerCase();

		// Verifica se a palavra é um palíndromo
		boolean ehPalindromo = true;
		int comprimento = palavra.length();

		for (int i = 0; i < comprimento / 2; i++) {
			if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
				ehPalindromo = false;
				break;
			}
		}

		if (ehPalindromo) {
			System.out.println("A palavra é um palíndromo.");
		} else {
			System.out.println("A palavra não é um palíndromo.");
		}
		scanner.close();
	}

}

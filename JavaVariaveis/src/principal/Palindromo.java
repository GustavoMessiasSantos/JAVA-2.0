package principal;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine();

		// Remove espa�os e converte a palavra para letras min�sculas
		palavra = palavra.replaceAll(" ", "").toLowerCase();

		// Verifica se a palavra � um pal�ndromo
		boolean ehPalindromo = true;
		int comprimento = palavra.length();

		for (int i = 0; i < comprimento / 2; i++) {
			if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
				ehPalindromo = false;
				break;
			}
		}

		if (ehPalindromo) {
			System.out.println("A palavra � um pal�ndromo.");
		} else {
			System.out.println("A palavra n�o � um pal�ndromo.");
		}
		scanner.close();
	}

}

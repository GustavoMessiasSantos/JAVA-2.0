package principal;

import java.util.Scanner;

public class AntecessorESucessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero, antecessor, sucessor;

		System.out.println("Digite um numero: ");
		numero = sc.nextInt();

		antecessor = numero - 1;
		sucessor = numero + 1;

		System.out.println("O antecessor de " + numero + " é " + antecessor);
		System.out.println("O sucessor de " + numero + " é " + sucessor);

		sc.close();

	}

}

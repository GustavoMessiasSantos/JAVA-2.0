package principal;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a nota (0 a 100): ");
		double nota = sc.nextDouble();

		if (nota >= 70) {
			System.out.println("Aprovado");
		} else if (nota >= 40) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		sc.close();

	}

}

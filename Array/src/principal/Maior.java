package principal;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int[] numero = new int[5];

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numero[i] = scanner.nextInt();
        }

        int maiorValor = numero[0];

        for (int i = 1; i < 5; i++) {
            if (numero[i] > maiorValor) {
                maiorValor = numero[i];
            }
        }

        System.out.println("Maior valor no array: " + maiorValor);

        scanner.close();

	}

}

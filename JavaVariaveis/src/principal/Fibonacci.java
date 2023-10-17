package principal;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o n�mero de termos da sequ�ncia de Fibonacci: ");
		int n = scanner.nextInt();
		
		
		System.out.println("Sequ�ncia de Fibonacci com " + n + " termos:");
		int termoAnterior = 0;
		int termoAtual = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(termoAnterior + " ");

			int proximoTermo = termoAnterior + termoAtual;
			termoAnterior = termoAtual;
			termoAtual = proximoTermo;
		}
		scanner.close();

	}

}

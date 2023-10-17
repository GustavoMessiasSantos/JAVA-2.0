package principal;

import java.util.Scanner;

public class CalculadorJurosSimples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double principal = 0;
		double taxaDeJuros = 0;
		int tempoEmAnos = 0;
		double jurosSimples = 0;
		
		System.out.print("Digite o valor em R$: ");
		principal = sc.nextDouble();
		System.out.print("Digite o valor da taxa de Juros: ");
		taxaDeJuros = sc.nextDouble();
		System.out.print("Digite o tempo em anos: ");
		tempoEmAnos = sc.nextInt();
		
		jurosSimples = (principal * taxaDeJuros / 100) * tempoEmAnos;
		System.out.printf("O valor dos juros simples é: R$ %.2f",  jurosSimples);
		
		
		sc.close();

	}

}

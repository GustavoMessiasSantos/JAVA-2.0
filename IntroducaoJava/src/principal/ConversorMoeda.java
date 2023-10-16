package principal;

import java.util.Scanner;

public class ConversorMoeda {

	public static final double taxaDeCambio = 0.94745;

	public static double converterDolaresParaEuros(double dolar) {
		return dolar * taxaDeCambio;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em dólar a ser convertido");
		double dolar = sc.nextDouble();
		
		System.out.printf("€ %.2f" , converterDolaresParaEuros(dolar));
		
		sc.close();
	}

}

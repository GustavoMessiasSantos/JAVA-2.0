package principal;

import java.util.Scanner;

public class CalculadoraIMC {

	public static double calcularIMC(double peso, double altura) {
		if (altura <= 0) {
			return -1.0; // Altura n�o pode ser negativa ou zero
		}
		return peso / (altura * altura);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o seu peso em Kg: ");
		double peso = scanner.nextDouble();

		System.out.print("Digite a sua altura em m: ");
		double altura = scanner.nextDouble();

		double imc = calcularIMC(peso, altura);

		if (imc == -1.0) {
			System.out.println("Altura inv�lida. N�o � poss�vel calcular o IMC.");
		} else {
			System.out.printf("Seu �ndice de Massa Corporal (IMC) �: %.2f", imc);
		}

		scanner.close();
	}
}

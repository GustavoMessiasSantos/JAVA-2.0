package entities;

public class Calculadora {
	public double somar(double num1, double num2) {
		return num1 + num2;
	}

	public double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	public double dividir(double num1, double num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			System.out.println("Erro: Divis�o por zero n�o � permitida.");
			return Double.NaN;
		}
	}
}

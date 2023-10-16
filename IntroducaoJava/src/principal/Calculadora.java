package principal;

import java.util.Scanner;

public class Calculadora {

	public static double adicao(double numero1, double numero2) {
		return numero1 + numero2;
	}

	public static double subtracao(double numero1, double numero2) {
		return numero1 - numero2;
	}

	public static double multiplicacao(double numero1, double numero2) {
		return numero1 * numero2;
	}

	public static double divisao(double numero1, double numero2) {
		return numero1 / numero2;
	}

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		double numero1 = sc.nextDouble();
		System.out.println("Digite outro número: ");
		double numero2 = sc.nextDouble();
		System.out.println("Escolha uma operação: \n" + "+ para adição\n" + "- para subtração\n"
				+ "* para mutiplicação\n" + "/ para divisão");

		char operacao = sc.next().charAt(0);

		while (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/') {
			System.out.println("Escolha uma operacao válida!");
			operacao = sc.next().charAt(0);
			}

			if (operacao == '+') {
				calc.adicao(numero1, numero2);
				System.out.println(calc.adicao(numero1, numero2));
			} else if (operacao == '-') {
				calc.subtracao(numero1, numero2);
				System.out.println(calc.subtracao(numero1, numero2));
			} else if (operacao == '*') {
				calc.multiplicacao(numero1, numero2);
				System.out.println(calc.multiplicacao(numero1, numero2));
			} else if (operacao == '/') {
				calc.divisao(numero1, numero2);
				System.out.println(calc.divisao(numero1, numero2));
			} else {
				System.out.println("Você fez alguma coisa errada!");
			}
		

		sc.close();

	}
}

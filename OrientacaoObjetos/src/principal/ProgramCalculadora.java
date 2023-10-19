package principal;

import java.util.Scanner;

import entities.Calculadora;

public class ProgramCalculadora {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        double resultado = 0.0;

        if (opcao == 1) {
            resultado = calculadora.somar(num1, num2);
        } else if (opcao == 2) {
            resultado = calculadora.subtrair(num1, num2);
        } else if (opcao == 3) {
            resultado = calculadora.multiplicar(num1, num2);
        } else if (opcao == 4) {
            resultado = calculadora.dividir(num1, num2);
        } else {
            System.out.println("Opção inválida.");
        }

        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }

        sc.close();
    }
}


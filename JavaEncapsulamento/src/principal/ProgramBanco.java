package principal;

import java.util.Scanner;

import entities.Banco;

public class ProgramBanco {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nome do titular da conta: ");
		String nomeTitular = scanner.nextLine();

		System.out.print("Número da conta: ");
		int numeroConta = scanner.nextInt();

		Banco conta = new Banco(nomeTitular, numeroConta);

		System.out.print("Depositar um valor inicial na conta: ");
		double valorInicial = scanner.nextDouble();
		conta.depositar(valorInicial);

		while (true) {
			System.out.println("\nEscolha uma ação:");
			System.out.println("1. Depositar");
			System.out.println("2. Sacar");
			System.out.println("3. Verificar saldo");
			System.out.println("4. Sair");
			System.out.print("Opção: ");
			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Valor para depositar: ");
				double valorDeposito = scanner.nextDouble();
				conta.depositar(valorDeposito);
				break;
			case 2:
				System.out.print("Valor para sacar: "
						+ "");
				double valorSaque = scanner.nextDouble();
				conta.sacar(valorSaque);
				break;
			case 3:
				System.out.println("Saldo atual: " + conta.verificarSaldo() + " R$");
				break;
			case 4:
				System.out.println("Encerrando o programa.");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}
}

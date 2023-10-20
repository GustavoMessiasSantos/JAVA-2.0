package principal;

import java.util.Scanner;

import entities.Pessoa;

public class ProgramPessoa {
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome da pessoa: ");
		String nome = sc.nextLine();
		pessoa.setNome(nome);

		System.out.print("Digite a idade da pessoa: ");
		int idade = sc.nextInt();
		pessoa.setIdade(idade);

		sc.nextLine(); // Limpa o buffer após a leitura do inteiro

		System.out.print("Digite o endereço da pessoa: ");
		String endereco = sc.nextLine();
		pessoa.setEndereco(endereco);

		System.out.println("Dados da pessoa:");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Endereço: " + pessoa.getEndereco());

		sc.close();
	}
}

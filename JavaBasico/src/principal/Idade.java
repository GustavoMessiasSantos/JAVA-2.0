package principal;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {

		/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
		 * dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o
		 * mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/


		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade em anos: ");
		int idadeAno = sc.nextInt();
		System.out.println("Digite a idade em meses: ");
		int idadeMeses = sc.nextInt();
		System.out.println("Digite a idade em dias: ");
		int idadeDias = sc.nextInt();

		int idadeTotalDias = ((idadeAno * 365) + (idadeMeses * 30) + idadeDias);
		System.out.println(idadeTotalDias + " Dias");

		sc.close();

	}
}

package principal;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int ano;
		
		
        System.out.print("Digite o ano: ");
		ano = leia.nextInt();

		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("O ano é bissexto!");
		} else {
			System.out.println("O ano não é bissexto!");
		}

		leia.close();

	}

}

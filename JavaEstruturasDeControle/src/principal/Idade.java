package principal;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 18) {
			System.out.println("� maior de idade!");
		}else {
			System.out.println("N�o � maior de idade!");
		}
		
		
		sc.close();

	}

}

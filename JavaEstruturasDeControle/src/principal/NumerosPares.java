package principal;

import java.util.Scanner;

public class NumerosPares {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		for(int i = 0; i<10; i++) {
			numero = numero + 2;
			System.out.print(numero + " ");
		}
		
		sc.close();
		
	}

}

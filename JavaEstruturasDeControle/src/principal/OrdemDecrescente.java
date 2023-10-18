package principal;

import java.util.Scanner;

public class OrdemDecrescente {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 11;
		
		while(numero>=1) {
			numero = numero - 1;
			System.out.print(numero + " ");
		}
		
		sc.close();
	}

}

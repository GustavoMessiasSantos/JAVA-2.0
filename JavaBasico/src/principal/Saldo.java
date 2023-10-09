package principal;

import java.util.Scanner;

public class Saldo {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Informe o saldo atual: ");
	        double saldo = scanner.nextDouble();
	        
	        double saldoComReajuste = saldo * 1.01;
	        
	        System.out.println("Saldo com reajuste de 1%: R$ " + saldoComReajuste);
	        
	        scanner.close();
	}

}

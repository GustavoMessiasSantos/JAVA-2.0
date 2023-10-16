package principal;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salarioMinimo, salarioUsuario;
		
		System.out.println("Digite o Salário Mínimo: ");
		salarioMinimo = sc.nextDouble();
		
		System.out.println("Digite o Salário do Usuário: ");
		salarioUsuario = sc.nextDouble();
		
		double qntSalarios = salarioUsuario/salarioMinimo;
		
		System.out.printf("A quantidade de sálarios é: %.2f\n",  qntSalarios);
		
		sc.close();

	}

}

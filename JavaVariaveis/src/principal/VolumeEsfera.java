package principal;

import java.util.Scanner;

public class VolumeEsfera {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio = 0;
		double volume = 0;
		
		System.out.print("Digite o raio da esfera: ");
		raio = sc.nextDouble();
		
		volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
		
		System.out.printf("O volume da esfera é: %.2f m³", volume);
		sc.close();

	}

}

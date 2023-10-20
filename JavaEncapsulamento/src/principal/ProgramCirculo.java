package principal;

import java.util.Scanner;

import entities.Circulo;

public class ProgramCirculo {

	public static void main(String[] args) {
        
		Circulo c = new Circulo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        c.setRaio(raio);

        System.out.printf("Área do círculo: %.2f cm \n", c.calcularÁrea());
        System.out.printf("Perímetro do círculo: %.2f cm \n", c.calcularPerímetro());

        sc.close();
	}

}

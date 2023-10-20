package principal;

import java.util.Scanner;

import entities.Circulo;

public class ProgramCirculo {

	public static void main(String[] args) {
        
		Circulo c = new Circulo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do c�rculo: ");
        double raio = sc.nextDouble();
        c.setRaio(raio);

        System.out.printf("�rea do c�rculo: %.2f cm \n", c.calcular�rea());
        System.out.printf("Per�metro do c�rculo: %.2f cm \n", c.calcularPer�metro());

        sc.close();
	}

}

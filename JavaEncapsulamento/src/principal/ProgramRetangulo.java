package principal;

import java.util.Scanner;

import entities.Retangulo;

public class ProgramRetangulo {
	
	public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner sc= new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = sc.nextDouble();
        retangulo.setLargura(largura);

        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();
        retangulo.setAltura(altura);

        sc.close();

        System.out.printf("Área do retângulo: %.2f m²\n", retangulo.calcularÁrea());
        System.out.printf("Perímetro do retângulo: %.2f m\n", retangulo.calcularPerímetro());
    }

}

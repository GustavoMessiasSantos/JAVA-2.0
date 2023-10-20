package principal;

import java.util.Scanner;

import entities.Retangulo;

public class ProgramRetangulo {
	
	public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner sc= new Scanner(System.in);

        System.out.print("Digite a largura do ret�ngulo: ");
        double largura = sc.nextDouble();
        retangulo.setLargura(largura);

        System.out.print("Digite a altura do ret�ngulo: ");
        double altura = sc.nextDouble();
        retangulo.setAltura(altura);

        sc.close();

        System.out.printf("�rea do ret�ngulo: %.2f m�\n", retangulo.calcular�rea());
        System.out.printf("Per�metro do ret�ngulo: %.2f m\n", retangulo.calcularPer�metro());
    }

}

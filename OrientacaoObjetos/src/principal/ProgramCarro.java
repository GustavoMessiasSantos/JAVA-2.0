package principal;

import entities.Carro;

public class ProgramCarro {
	
	public static void main(String[] args) {
        Carro monza = new Carro("Chevrolet", "Monza", 1990, "Azul");
        Carro chevette = new Carro("Chevrolet", "Chevette", 1985, "Vermelho");
        Carro opala = new Carro("Chevrolet", "Opala", 1978, "Verde");

        System.out.println("Informações sobre o Monza:");
        monza.exibirInformacoes();

        System.out.println("Informações sobre o Chevette:");
        chevette.exibirInformacoes();

        System.out.println("Informações sobre o Opala:");
        opala.exibirInformacoes();
    }
}

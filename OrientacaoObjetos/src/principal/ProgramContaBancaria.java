package principal;

import entities.ContaBancaria;

public class ProgramContaBancaria {
	
	public static void main(String[] args) {
        
		ContaBancaria conta1 = new ContaBancaria("João", 12345, 1000.0);
        ContaBancaria conta2 = new ContaBancaria("Maria", 67890, 500.0);
        ContaBancaria conta3 = new ContaBancaria("Pedro", 13579, 1500.0);
        ContaBancaria conta4 = new ContaBancaria("Ana", 24680, 200.0);

        conta1.exibirSaldo();
        conta1.depositar(500.0);
        conta1.sacar(300.0);
        conta1.exibirSaldo();

        conta2.exibirSaldo();
        conta2.depositar(300.0);
        conta2.sacar(800.0);
        conta2.exibirSaldo();

        conta3.exibirSaldo();
        conta3.depositar(1000.0);
        conta3.sacar(200.0);
        conta3.exibirSaldo();

        conta4.exibirSaldo();
        conta4.depositar(50.0);
        conta4.sacar(300.0);
        conta4.exibirSaldo();
    }

}

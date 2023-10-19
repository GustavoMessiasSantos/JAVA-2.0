package entities;

public class ContaBancaria {
	
	private String nomeTitular;
    private int numeroConta;
    private double saldo;
	
    public ContaBancaria(String nomeTitular, int numeroConta, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor a ser depositado deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("O valor a ser sacado deve ser maior que zero.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
    }
    
    

}

package entities;

public class Banco {

	    private String nomeDoTitular;
	    private double saldo;
	    private int numeroDaConta;

	    public Banco(String nomeDoTitular, int numeroDaConta) {
	        this.nomeDoTitular = nomeDoTitular;
	        this.numeroDaConta = numeroDaConta;
	        this.saldo = 0.0; // Saldo inicial � zero
	    }

	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	        } else {
	            System.out.println("O valor do dep�sito deve ser maior que zero.");
	        }
	    }

	    public void sacar(double valor) {
	        if (valor > 0 && valor <= saldo) {
	            saldo -= valor;
	        } else {
	            System.out.println("Saque inv�lido. Verifique o valor ou o saldo dispon�vel.");
	        }
	    }

	    public double verificarSaldo() {
	        return saldo;
	    }
	}


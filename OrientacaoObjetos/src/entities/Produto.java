package entities;

public class Produto {

	private String nome;
	private double preco;
	private int quantidadeEstoque;

	public Produto(String nome, double preco, int quantidadeEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public void adicionarProduto(int quantidade) {
		if (quantidade > 0) {
			this.quantidadeEstoque += quantidade;
			System.out.println(quantidade + " unidades de " + this.nome + " foram adicionadas ao estoque.");
		} else {
			System.out.println("A quantidade a ser adicionada deve ser maior que zero.");
		}
	}

	public void removerProduto(int quantidade) {
		if (quantidade > 0 && quantidade <= this.quantidadeEstoque) {
			this.quantidadeEstoque -= quantidade;
			System.out.println(quantidade + " unidades de " + this.nome + " foram removidas do estoque.");
		} else if (quantidade > this.quantidadeEstoque) {
			System.out.println("Quantidade insuficiente em estoque.");
		} else {
			System.out.println("A quantidade a ser removida deve ser maior que zero.");
		}
	}

	public void exibirInformacoes() {
		double valorTotal = this.preco * this.quantidadeEstoque;
		System.out.println("Produto: " + this.nome);
		System.out.println("Preço por unidade: R$" + this.preco);
		System.out.println("Quantidade em estoque: " + this.quantidadeEstoque + " unidades");
		System.out.println("Valor total em estoque: R$" + valorTotal);
	}

}

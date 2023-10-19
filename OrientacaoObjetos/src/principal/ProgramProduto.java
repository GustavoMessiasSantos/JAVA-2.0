package principal;

import entities.Produto;

public class ProgramProduto {

	public static void main(String[] args) {
	        
		 Produto produto1 = new Produto("Sabonete", 2.99, 100);
	        Produto produto2 = new Produto("Shampoo", 9.99, 50);
	        Produto produto3 = new Produto("Condicionador", 8.99, 75);

	        produto1.exibirInformacoes();
	        produto1.adicionarProduto(50);
	        produto1.removerProduto(30);
	        produto1.exibirInformacoes();

	        produto2.exibirInformacoes();
	        produto2.adicionarProduto(20);
	        produto2.removerProduto(60);
	        produto2.exibirInformacoes();
	        
	        produto3.exibirInformacoes();
	        produto3.adicionarProduto(10);
	        produto3.removerProduto(20);
	        produto3.exibirInformacoes();
	    }
}



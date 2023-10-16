package principal;

public class Pessoa {
	public String nome;
	public int idade;
	public String sexo;

	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public void exibirDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
	}

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Roberto Sousa Da Costa", 27, "Masculino");
		pessoa1.exibirDetalhes();
	}
}

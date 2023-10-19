package entities;

import java.util.ArrayList;

public class Agenda {
	public static class Contato {
		private String nome;
		private String telefone;
		private String email;

		public Contato(String nome, String telefone, String email) {
			this.nome = nome;
			this.telefone = telefone;
			this.email = email;
		}

		public String getNome() {
			return nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public String getEmail() {
			return email;
		}
	}

	private ArrayList<Contato> contatos = new ArrayList<>();

	public void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	public void removerContato(String nome) {
		Contato contatoParaRemover = null;
		for (Contato contato : contatos) {
			if (contato.getNome().equals(nome)) {
				contatoParaRemover = contato;
				break;
			}
		}
		if (contatoParaRemover != null) {
			contatos.remove(contatoParaRemover);
			System.out.println("Contato removido com sucesso.");
		} else {
			System.out.println("Contato não encontrado na agenda.");
		}
	}

	public void listarContatos() {
		if (contatos.isEmpty()) {
			System.out.println("A agenda está vazia.");
		} else {
			System.out.println("Lista de Contatos:");
			for (Contato contato : contatos) {
				System.out.println("Nome: " + contato.getNome());
				System.out.println("Telefone: " + contato.getTelefone());
				System.out.println("Email: " + contato.getEmail());
				System.out.println();
			}
		}
	}
}

package principal;

import entities.Agenda;
import entities.Agenda.Contato;

public class ProgramAgenda {
	
	 public static void main(String[] args) {
	        Contato contato1 = new Contato("Roberto", "00 2456-7890", "roberto@fake.com");
	        Contato contato2 = new Contato("José", "00 8654-3210", "jose@fake.com");
	        Contato contato3 = new Contato("Beatriz", "88 8815-0368", "beatriz@fake.com");

	        Agenda agenda = new Agenda();

	        agenda.adicionarContato(contato1);
	        agenda.adicionarContato(contato2);
	        agenda.adicionarContato(contato3);

	        System.out.println("Contatos na agenda:");
	        System.out.println();
	        agenda.listarContatos();

	        agenda.removerContato("João");
	        System.out.println();
	        System.out.println("Após remover Roberto:");
	        System.out.println();
	        agenda.listarContatos();
	    }

}

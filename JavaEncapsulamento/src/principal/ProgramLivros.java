package principal;

import java.util.Scanner;

import entities.Livros;

public class ProgramLivros {
	
	public static void main(String[] args) {
        
		Livros livro = new Livros();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        livro.setTitulo(titulo);

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        livro.setAutor(autor);

        System.out.print("Digite o número de páginas do livro: ");
        int numeroDePaginas = scanner.nextInt();
        livro.setNumeroDePaginas(numeroDePaginas);

        scanner.close();

        System.out.println("Dados do livro:");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Número de páginas: " + livro.getNumeroDePaginas());
    }
}



package principal;

import java.util.Scanner;

import entities.Livros;

public class ProgramLivros {
	
	public static void main(String[] args) {
        
		Livros livro = new Livros();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o t�tulo do livro: ");
        String titulo = scanner.nextLine();
        livro.setTitulo(titulo);

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        livro.setAutor(autor);

        System.out.print("Digite o n�mero de p�ginas do livro: ");
        int numeroDePaginas = scanner.nextInt();
        livro.setNumeroDePaginas(numeroDePaginas);

        scanner.close();

        System.out.println("Dados do livro:");
        System.out.println("T�tulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("N�mero de p�ginas: " + livro.getNumeroDePaginas());
    }
}



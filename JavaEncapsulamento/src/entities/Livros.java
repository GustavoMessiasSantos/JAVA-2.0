package entities;

public class Livros {
	
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Livros() {
        this.titulo = "";
        this.autor = "";
        this.numeroDePaginas = 0;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        if (numeroDePaginas >= 0) {
            this.numeroDePaginas = numeroDePaginas;
        } else {
            System.out.println("O número de páginas não pode ser negativo.");
        }
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

}

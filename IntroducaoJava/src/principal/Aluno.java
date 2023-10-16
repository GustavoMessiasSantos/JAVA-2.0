package principal;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean estaAprovado(double notaMinimaAprovacao) {
        double media = calcularMedia();
        return media >= notaMinimaAprovacao;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite a matr�cula do aluno: ");
        int matriculaAluno = scanner.nextInt();

        System.out.print("Digite o n�mero de notas: ");
        int numNotas = scanner.nextInt();

        double[] notasAluno = new double[numNotas];

        for (int i = 0; i < numNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notasAluno[i] = scanner.nextDouble();
        }

        System.out.print("Digite a nota m�nima de aprova��o: ");
        double notaMinimaAprovacao = scanner.nextDouble();

        Aluno aluno = new Aluno(nomeAluno, matriculaAluno, notasAluno);

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matr�cula: " + aluno.matricula);
        System.out.println("Notas: " + java.util.Arrays.toString(aluno.notas));
        System.out.println("M�dia: " + aluno.calcularMedia());

        if (aluno.estaAprovado(notaMinimaAprovacao)) {
            System.out.println("O aluno est� aprovado.");
        } else {
            System.out.println("O aluno est� reprovado.");
        }

        scanner.close();
    }
}
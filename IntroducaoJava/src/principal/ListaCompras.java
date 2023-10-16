package principal;

import java.util.Scanner;

public class ListaCompras {
    private String[] itens;
    private double[] precos;
    private int tamanho;

    public ListaCompras(int capacidade) {
        itens = new String[capacidade];
        precos = new double[capacidade];
        tamanho = 0;
    }

    public void adicionarItem(String item, double preco) {
        if (tamanho < itens.length) {
            itens[tamanho] = item;
            precos[tamanho] = preco;
            tamanho++;
            System.out.println("Item adicionado com sucesso.");
        } else {
            System.out.println("A lista de compras está cheia. Não é possível adicionar mais itens.");
        }
    }

    public void removerItem(int indice) {
        if (indice >= 0 && indice < tamanho) {
            for (int i = indice; i < tamanho - 1; i++) {
                itens[i] = itens[i + 1];
                precos[i] = precos[i + 1];
            }
            tamanho--;
            System.out.println("Item removido.");
        } else {
            System.out.println("Índice inválido. Não é possível remover o item.");
        }
    }

    public void listarItens() {
        if (tamanho == 0) {
            System.out.println("A lista de compras está vazia.");
        } else {
            System.out.println("Lista de Compras:");
            for (int i = 0; i < tamanho; i++) {
                System.out.println(i + ": " + itens[i] + " - R$" + precos[i]);
            }
        }
    }

    public double calcularCustoTotal() {
        double custoTotal = 0;
        for (int i = 0; i < tamanho; i++) {
            custoTotal += precos[i];
        }
        return custoTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a capacidade da lista de compras: ");
        int capacidade = scanner.nextInt();
        ListaCompras lista = new ListaCompras(capacidade);

        int opcao;
        do {
            System.out.println("\nOpções:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Listar itens");
            System.out.println("4. Calcular custo total");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                scanner.nextLine();
                System.out.print("Digite o nome do item: ");
                String nomeItem = scanner.nextLine();
                System.out.print("Digite o preço do item: ");
                double precoItem = scanner.nextDouble();
                lista.adicionarItem(nomeItem, precoItem);
            } else if (opcao == 2) {
                System.out.print("Digite o índice do item a ser removido: ");
                int indice = scanner.nextInt();
                lista.removerItem(indice);
            } else if (opcao == 3) {
                lista.listarItens();
            } else if (opcao == 4) {
                double custoTotal = lista.calcularCustoTotal();
                System.out.printf("Custo total da lista de compras: R$ %.2f\n",  custoTotal);
            } else if (opcao == 5) {
                System.out.println("Saindo do programa.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}

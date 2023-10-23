package principal;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[][] A = new int[3][3];
		int[][] B = new int[3][3];
		int[][] C = new int[3][3];

		System.out.println("Digite os valores da matriz A (3x3):");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("A[" + (i + 1) + "][" + (j + 1) + "]: ");
				A[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Digite os valores da matriz B (3x3):");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("B[" + (i + 1) + "][" + (j + 1) + "]: ");
				B[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				C[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}

		System.out.println("Matriz resultante C (A x B):");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}

}

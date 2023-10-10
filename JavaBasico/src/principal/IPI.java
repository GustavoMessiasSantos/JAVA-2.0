package principal;

import java.util.Scanner;

public class IPI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double ipi, vlrUnit1, vlrUnit2;
		int cdPeca1, qntPeca1, cdPeca2, qntPeca2;

		System.out.println("Digite a porcentagem do IPI: ");
		ipi = sc.nextDouble();
		System.out.print("Digite o código da peça 1: ");
		cdPeca1 = sc.nextInt();
		System.out.print("Digite o valor unitário da peça 1: ");
		vlrUnit1 = sc.nextDouble();
		System.out.print("Digite a quantidade de peças 1: ");
		qntPeca1 = sc.nextInt();
		System.out.print("Digite o código da peça 2: ");
		cdPeca2 = sc.nextInt();
		System.out.print("Digite o valor unitário da peça 2: ");
		vlrUnit2 = sc.nextDouble();
		System.out.print("Digite a quantidade de peças 2: ");
		qntPeca2 = sc.nextInt();
		
		double vlrTot1 = vlrUnit1 * qntPeca1;
        double vlrTot2 = vlrUnit2 * qntPeca2;
        double vlrTotProd = vlrTot1 + vlrTot2;
        
        double vlrTotComIPI = vlrTotProd * (ipi / 100 + 1);
        System.out.println("Código Peça: " + cdPeca1 + " Valor Unitário: " + vlrUnit1);
        System.out.println("Código Peça: " + cdPeca2 + " Valor Unitário: " + vlrUnit2);
        
        System.out.printf("Valor total com IPI: R$ %.2f\n",  vlrTotComIPI);

		sc.close();
	}

}

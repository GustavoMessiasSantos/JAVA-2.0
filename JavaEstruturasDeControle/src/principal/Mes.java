package principal;

import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		  
		
		Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o n�mero do m�s (1 a 12): ");
	        int numeroMes = sc.nextInt();

	        String nomeMes;

	        switch (numeroMes) {
	            case 1:
	                nomeMes = "Janeiro";
	                break;
	            case 2:
	                nomeMes = "Fevereiro";
	                break;
	            case 3:
	                nomeMes = "Mar�o";
	                break;
	            case 4:
	                nomeMes = "Abril";
	                break;
	            case 5:
	                nomeMes = "Maio";
	                break;
	            case 6:
	                nomeMes = "Junho";
	                break;
	            case 7:
	                nomeMes = "Julho";
	                break;
	            case 8:
	                nomeMes = "Agosto";
	                break;
	            case 9:
	                nomeMes = "Setembro";
	                break;
	            case 10:
	                nomeMes = "Outubro";
	                break;
	            case 11:
	                nomeMes = "Novembro";
	                break;
	            case 12:
	                nomeMes = "Dezembro";
	                break;
	            default:
	                nomeMes = "M�s inv�lido";
	        }

	        System.out.println("O nome do m�s �: " + nomeMes);
	        
	        sc.close();
	    }
	}


package principal;

public class Media {

	public static void main(String[] args) {
        double mediaAritmetica1 = (8 + 9 + 7) / 3.0;
        double mediaAritmetica2 = (4 + 5 + 6) / 3.0;
        double somaDasMedias = mediaAritmetica1 + mediaAritmetica2;
        double mediaDasMedias = somaDasMedias / 2.0;

        System.out.println("M�dia dos n�meros 8, 9 e 7: " + mediaAritmetica1);
        System.out.println("M�dia dos n�meros 4, 5 e 6: " + mediaAritmetica2);
        System.out.println("Soma das duas m�dias: " + somaDasMedias);
        System.out.println("M�dia das m�dias: " + mediaDasMedias);

	}

}

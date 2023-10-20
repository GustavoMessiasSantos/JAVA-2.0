package entities;

public class Circulo {
	
    private double raio;

    public Circulo() {
        this.raio = 0.0;
    }

    public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
        if (raio >= 0) {
            this.raio = raio;
        } else {
            System.out.println("O raio n�o pode ser negativo.");
        }
    }

    public double calcular�rea() {
        return 3.14 * raio * raio;
    }

    public double calcularPer�metro() {
        return 2 * 3.14 * raio;
    }


}

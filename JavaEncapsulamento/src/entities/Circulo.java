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
            System.out.println("O raio não pode ser negativo.");
        }
    }

    public double calcularÁrea() {
        return 3.14 * raio * raio;
    }

    public double calcularPerímetro() {
        return 2 * 3.14 * raio;
    }


}

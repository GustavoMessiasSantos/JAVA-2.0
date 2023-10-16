package principal;

public class Relogio {
    public int hora;
    public int minutos;

    public Relogio() {
        hora = 0;
        minutos = 0;
    }

    public void definirHora(int hora, int minutos) {
        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59) {
            this.hora = hora;
            this.minutos = minutos;
            System.out.println("Hora definida como " + hora + ":" + minutos);
        } else {
            System.out.println("Hora ou minutos inválidos. A hora não foi definida.");
        }
    }

    public void exibirHoraAtual() {
        System.out.println("Hora atual: " + hora + ":" + minutos);
    }

    public static void main(String[] args) {
        Relogio relogio = new Relogio();

        relogio.exibirHoraAtual();

        relogio.definirHora(10, 30);
        relogio.exibirHoraAtual();

        relogio.definirHora(25, 70); // Tentativa de definir uma hora inválida
        relogio.exibirHoraAtual();
        
        relogio.definirHora(23, 59);
        relogio.exibirHoraAtual();
    }
}
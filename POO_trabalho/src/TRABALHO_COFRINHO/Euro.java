package TRABALHO_COFRINHO;

public class Euro extends Moedas {

    public Euro(double valor) {
        super(valor);
    }

    public void info() {
        System.out.println(valor + " Euros");
    }

    public double converter() {
        return valor * 6.33; // valor do euro no momento.
    }
}

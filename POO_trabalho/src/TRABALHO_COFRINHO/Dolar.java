package TRABALHO_COFRINHO;

public class Dolar extends Moedas {

    public Dolar(double valor) {
        super(valor);
    }

    public void info() {
        System.out.println(valor + " Dólares");
    }

    public double converter() {
        return valor * 5.43; // valor da cotação do momento
    }
}

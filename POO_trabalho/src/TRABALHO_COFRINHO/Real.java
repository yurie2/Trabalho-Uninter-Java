package TRABALHO_COFRINHO;

public class Real extends Moedas {
// 
    public Real(double valor) {// metodo para receber o parametro(valo)
        super(valor);
    }

    public void info() {
        System.out.println(valor + " Reais");
    }

    public double converter() {
        return valor;
    }
}

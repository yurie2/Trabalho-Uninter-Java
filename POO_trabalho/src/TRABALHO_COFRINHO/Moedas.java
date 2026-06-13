package TRABALHO_COFRINHO;

// Classe abstrata para permitir polimorfismo
public abstract class Moedas {
    double valor;

    public Moedas(double valor) {
        this.valor = valor;
    }

    public abstract void info();   // mostra as informações
    public abstract double converter(); // faz a conversao para o real
}

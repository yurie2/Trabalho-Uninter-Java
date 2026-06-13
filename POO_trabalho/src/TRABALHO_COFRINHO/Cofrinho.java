package TRABALHO_COFRINHO;

import java.util.ArrayList;

public class Cofrinho {

    // Lista de moedas (polimorfismo)
    private ArrayList<Moedas> lista = new ArrayList<>(); // criação da lista

    public void adicionar(Moedas m) {
        lista.add(m);
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
            return;
        }

        for (Moedas m : lista) {
            m.info();   
        }
    }

    // Remove a primeira moeda encontrada do tipo escolhido
    // instanceof para identificar a classe
    public boolean removerPorTipo(int tipo) {
        for (Moedas m : lista) {

            if (tipo == 1 && m instanceof Dolar) {
                lista.remove(m);
                return true;
            }
            if (tipo == 2 && m instanceof Euro) {
                lista.remove(m);
                return true;
            }
            if (tipo == 3 && m instanceof Real) {
                lista.remove(m);
                return true;
            }
        }
        return false;
    }
	public double totalConvertido() {
		double total = 0;
        for (Moedas m : lista) {
            total += m.converter(); 
        }
        return total;
	}
}

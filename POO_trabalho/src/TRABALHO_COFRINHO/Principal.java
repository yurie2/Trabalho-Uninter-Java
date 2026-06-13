package TRABALHO_COFRINHO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) { // estrutura de repetição
            System.out.println("\n------ COFRINHO ------");
            System.out.println("1 - Adicionar moedas");
            System.out.println("2 - Remover moedas");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Total em reais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = teclado.nextInt(); // usuário seleciona uma das opções

            if (opcao == 0) {
                System.out.println("Encerrando..."); // caso o usuario queira encerrar
                break;
            }

            switch (opcao) {

            case 1:								// segundo Menu
                System.out.println("1 - Dólar");
                System.out.println("2 - Euro");
                System.out.println("3 - Real");
                System.out.print("Escolha a moeda: ");
                int tipoMoeda = teclado.nextInt();

                System.out.print("Digite o valor: ");
                double valor = teclado.nextDouble();

                Moedas nova = null;  // essa variavel tem que ser declarada antes de ser usada

                if (tipoMoeda == 1) nova = new Dolar(valor);
                else if (tipoMoeda == 2) nova = new Euro(valor);
                else if (tipoMoeda == 3) nova = new Real(valor);
                else {
                    System.out.println("Moeda inválida!");
                    break;
                }

                cofrinho.adicionar(nova);
                System.out.println("Moeda adicionada!");
                break;

            case 2: // menu de remover
                System.out.println("1 - Dólar");
                System.out.println("2 - Euro");
                System.out.println("3 - Real");
                System.out.print("Escolha o tipo para remover: ");
                int removerTipo = teclado.nextInt();

                boolean removido = cofrinho.removerPorTipo(removerTipo);

                if (removido)
                    System.out.println("Moeda removida!");
                else
                    System.out.println("Nenhuma moeda desse tipo encontrada.");
                break;

            case 3: // chama o metodo do cofrinho
                cofrinho.listar();
                break;

           
            case 4:
                System.out.println("Total em reais: R$ " + cofrinho.totalConvertido()); // mostra o total ja convertido para o real
                break;

            default:
                System.out.println("Opção inválida!");
            }
        }

        teclado.close();
    }
}

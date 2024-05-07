package Exercicios30042024;

import java.util.ArrayList;

public class Exercicio03 {
    public static void main(String[] args) {
        String carro_01[] = { "Fiat", "azul" };
        String carro_02[] = { "Fiat", "verde" };
        String carro_03[] = { "Ford", "azul" };
        String carro_04[] = { "Fiat", "verde" };
        String carro_05[] = { "GM", "azul" };

        ArrayList<String[]> listaCarros = new ArrayList<String[]>();
    
        listaCarros.add(carro_01);
        listaCarros.add(carro_02);
        listaCarros.add(carro_03);
        listaCarros.add(carro_04);
        listaCarros.add(carro_05);

        int quantidadeAzul = 0;
        int quantidadeFiat = 0;

        for (String[]carro : listaCarros) {
            String modelo = carro[0];
            String cor = carro[1];

            // Dados do Carro atual
            System.out.println("====================================");
            System.out.println("Carro: " + modelo);
            System.out.println("Cor: " + cor);

            if (cor.equalsIgnoreCase("verde")) {
                quantidadeAzul++;
            }

            if (modelo.equalsIgnoreCase("Fiat")) {
                quantidadeFiat++;

                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("====================================");
                System.out.println("Quantidade veiculo verde: " + quantidadeAzul);
                System.out.println("Quantidade veiculo Fiat: " + quantidadeFiat);
                System.out.println("====================================");
            }
        
        }    

    }
}
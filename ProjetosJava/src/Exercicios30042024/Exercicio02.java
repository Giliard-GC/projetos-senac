package Exercicios30042024;

    import java.util.ArrayList;
    
    public class Exercicio02 {
    
        // Dado o modelo(Fiat, Ford,GM, Wolskwagen,Toyota,Honda), ano fabricação, cor e
        // placa de 5 carros.
        // Faca um algoritmo que:
        // a)Imprima quantos carros sao da cor verde e o percentual em relacao ao total.
        // b)Imprima quantos foram fabricados antes de 1990 percentual em relacao ao
        // total;
        // c)Imprima quantos sao da Fiat e o percentual em relacao ao total;
    
        public static void main(String[] args) {
            // ========== posições | 0 |=== | 1 | ===| 2 | == | 3 |
            String carro_01[] = { "Fiat", "2024", "verde", "MFI-7815" };
            String carro_02[] = { "Fiat", "2024", "verde", "MFI-7815" };
            String carro_03[] = { "Ford", "2024", "azul", "MFI-7415" };
            String carro_04[] = { "Fiat", "2022", "verde", "MFI-7815" };
            String carro_05[] = { "GM", "2024", "verde", "MFI-7815" };
    
            ArrayList<String[]> listaCarros = new ArrayList<String[]>();
    
            listaCarros.add(carro_01);
            listaCarros.add(carro_02);
            listaCarros.add(carro_03);
            listaCarros.add(carro_04);
            listaCarros.add(carro_05);
    
            int quantidadeVerde = 0;
            int quantidadeAntesAnos1990 = 0;
            int quantidadeFiat = 0;
    
            for (String[]carro : listaCarros) {
                String modelo = carro[0];
                String ano = carro[1];
                String cor = carro[2];
                String placa = carro[3];
    
                // Dados do Carro atual
                System.out.println("====================================");
                System.out.println("Carro: " + modelo);
                System.out.println("Cor: " + cor);
                System.out.println("Ano: " + ano);
                System.out.println("Placa: " + placa);
    
                if (cor.equalsIgnoreCase("verde")) {
                    quantidadeVerde++;
                }
    
                int int_ano = Integer.parseInt(ano);
                if (int_ano < 1990) {
                    quantidadeAntesAnos1990++;
                }
    
                if (modelo.equalsIgnoreCase("Fiat")) {
                    quantidadeFiat++;
                }
            }
    
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("====================================");
            System.out.println("Quantidade veiculo verde: " + quantidadeVerde);
            System.out.println("Quantidade veiculo fabricado antes de 1990: " + quantidadeAntesAnos1990);
            System.out.println("Quantidade veiculo Fiat: " + quantidadeFiat);
            System.out.println("====================================");
        }
    
    }


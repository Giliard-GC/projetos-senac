package Exercicios29042024;

public class Exercicio03 {
    public static void main(String[] args) {
        // Crie um algoritmo que recebe 2 números e 
        // multiplica o num1 pelo num2 através
        // de somas repetidas.(Exemplo:2 e 3 = 2 + 2 + 2 => 6)

        int num1 = 2;
        int num2 = 3; // usuario vai informar...

        // variavel acumuladora
        int soma = 0;

        int contador = 1;
        int total_linhas = num2;
        while (contador <= total_linhas) {
            // System.out.println("contador: " + contador);
            
            // cria acumulador com a soma
            // primeira vez => 0  =   0  +   2 => 2 
            // segunda vez  => 2  =   2  +   2 => 4 
            // terceira vez => 4  =   4  +   2 => 6 
                             soma = soma + num1;

            System.out.println("soma:" + soma);

            contador++;
        }
    }
}

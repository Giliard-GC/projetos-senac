package Exercicios29042024;


public class Exercicio04 {
    // Crie um algoritmo que recebe 1 número e verifica se o mesmo é perfeito.
    // Um numero é perfeito quando a soma dos seus divisores é igual a ele mesmo, por exemplo 6.
    // Para isso use resto e acumulador soma.
    // Verificando se numero e perfeito:
    // Exemplo para numero 6
    // POSICAO 01 - resto = 6 % 5;
    // POSICAO 02 - resto = 6 % 4;
    // POSICAO 03 - resto = 6 % 3;
    // POSICAO 04 - resto = 6 % 2;
    // POSICAO 05 - resto = 6 % 1;
    // Para cada posicao, verificar se o resto = 0 , adiciona a soma numa variavel de nome soma.
    // Apos passar por todas as repetições, no final se a soma == numero, o numero e perfeito.

    public static void main(String[] args) {
        
        int numero = 6;
        int numero_inicial = numero;

        int contador = 1;
        int total_linhas = numero;

        int resto = 0;
        int soma = 0;

        while (contador < total_linhas) {
            numero--;
            resto = numero_inicial % numero;

            if (resto == 0) {
                soma = soma + numero;
            }
            
            contador++;
        }
        
        if (soma == numero_inicial) {
            System.out.println("O numero " + numero_inicial + " é perfeito");
        }
    }
}
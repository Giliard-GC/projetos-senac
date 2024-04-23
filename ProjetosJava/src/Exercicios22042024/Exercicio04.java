package Exercicios22042024;
//Faça um algoritmo para verificar se um aluno esta APROVADO ou REPROVADO, 
//lendo 3 notas e calculando sua media que deve ser maior ou igual a 7.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota1, nota2, nota3;
        int media;
        // Solicita as notas ao usuário
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextInt();
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextInt();
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextInt();
        // Calcula a média aritmética
        media = (nota1 + nota2 + nota3) / 3;
        // Verifica se o aluno está aprovado ou reprovado
        if (media >= 6.0) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
        scanner.close();
    }
}

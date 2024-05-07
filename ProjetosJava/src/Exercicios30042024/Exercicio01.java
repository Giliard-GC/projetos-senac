package Exercicios30042024;

import java.util.ArrayList;

public class Exercicio01 {

    public static void main(String[] args) {
        // Suponha que para cada aluno de uma sala exista uma ficha contendo o nome e a
        // idade de 05 alunos.
        // Faça algoritmo que determine quantos alunos tem idade maior que 30.

        // Ficha de 5 alunos, com nome e idade
        // ============posicao| 0 | | 1 |
        String aluno_01[] = { "Joao", "22" };
        String aluno_02[] = { "Jessica", "18" };
        String aluno_03[] = { "Julio", "19" };
        String aluno_04[] = { "Adriano", "32" };
        String aluno_05[] = { "Gabriele", "18" };

        // Cria a lista de alunos
        ArrayList<String[]> listaAlunos = new ArrayList<String[]>();

        listaAlunos.add(aluno_01);
        listaAlunos.add(aluno_02);
        listaAlunos.add(aluno_03);
        listaAlunos.add(aluno_04);
        listaAlunos.add(aluno_05);

        int quantidadeAlunoMaior30Anos = 0;
        for (String[] aluno : listaAlunos) {
            String nome = aluno[0];
            String idade = aluno[1];

            // Validações
            // Primeiro coloca a idade para inteiro
            int int_idade = Integer.parseInt(idade);
            if(int_idade > 30){
                quantidadeAlunoMaior30Anos++;
            }
        }

        // Apos o final do laço de repetição, mostra quandos alunos tem mais de 30 anos
        System.out.println("Quantidade de alunos com mais de 30 anos: " + quantidadeAlunoMaior30Anos);
    }
}
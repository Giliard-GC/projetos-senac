package Exercicios22042024;

public class Exercicio02 {
    public static void main(String[] args) {
        int tempoDiario = 5; // em minutos
        int diasPorSemana = 6;
        int semanasPorAno = 52;
        
        // Calculando o tempo total em minutos
        int tempoTotalMinutos = tempoDiario * diasPorSemana * semanasPorAno;
        
        // Convertendo o tempo total de minutos para horas
        double tempoTotalHoras = tempoTotalMinutos / 60.0;
        
        // Mostrando o resultado na tela
        System.out.println("Tempo total dedicado ao livro em horas por ano: " + tempoTotalHoras);
    }
}

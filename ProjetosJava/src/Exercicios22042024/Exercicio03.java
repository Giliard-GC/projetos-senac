package Exercicios22042024;

public class Exercicio03 {
    public static void main(String[] args) {
        // Distância em metros de ida e volta para o trabalho
        int distanciaDiariaMetros = 800;

        // Dias trabalhados por semana e semanas trabalhadas por ano
        int diasPorSemana = 5;
        int semanasPorAno = 45;

        // Calcula a distância total percorrida em um ano
        int distanciaAnualMetros = distanciaDiariaMetros * diasPorSemana * semanasPorAno * 2; // Multiplica por 2 pois vai e volta

        // Converte a distância total de metros para quilômetros
        double distanciaAnualQuilometros = distanciaAnualMetros / 1000.0;

        // Exibe o resultado
        System.out.println("Distância total percorrida em um ano: " + distanciaAnualQuilometros + " quilômetros");
    }
}

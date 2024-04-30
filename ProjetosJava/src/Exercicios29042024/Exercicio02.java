package Exercicios29042024;

public class Exercicio02 {
    public static void main(String[] args) {
        int redutor = 10;
        int contador = 0;
        int total = redutor;

        while (contador <= total){
            System.out.println("Contador: " + redutor);
            redutor = redutor - 1;
            contador++;
        }
    }
}

package Exercicio26032024.Exercicios10042024;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = 2;
        double c = 3;
        double tripo = a*c;
        double mult = a*b;

        if(mult>0) {
	        System.out.println(" positivo " + mult);
        }else {
	        if(tripo<0) {
	            System.out.println(" Negativo " + tripo);
	            input.close();}
        }
    }
}
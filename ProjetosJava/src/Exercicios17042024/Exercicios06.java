package Exercicios17042024;

import javax.swing.JOptionPane;

public class Exercicios06 {
    public static void main(String[] args) {
        //Faca um algoritmo que leia o maior, o menor e o intermediario de tres numeros digitados.

        String numero1 = JOptionPane.showInputDialog("Insira o primeiro número");
        double numero1digitado = Double.parseDouble(numero1);

        String numero2 = JOptionPane.showInputDialog("Insira o segundo número");
        double numero2digitado = Double.parseDouble(numero2);

        String numero3 = JOptionPane.showInputDialog("Insira o terceiro número");
        double numero3digitado = Double.parseDouble(numero3);

        //primeira comparação
        if (numero1digitado > numero2digitado && numero1digitado > numero3digitado && numero2digitado > numero3digitado){
            System.out.println(numero1digitado);
            System.out.println(numero3digitado);
            System.out.println(numero2digitado);

            //segunda comparação
        } else if (numero1digitado > numero2digitado && numero1digitado > numero3digitado && numero3digitado > numero2digitado){
            System.out.println(numero1digitado);
            System.out.println(numero2digitado);
            System.out.println(numero3digitado);

                //terceira comparação
            } else if (numero2digitado > numero1digitado && numero2digitado > numero3digitado && numero1digitado > numero3digitado){
                System.out.println(numero2digitado);
                System.out.println(numero3digitado);
                System.out.println(numero1digitado);

                //quarta comparação
                } else if (numero2digitado > numero1digitado && numero2digitado > numero3digitado && numero3digitado > numero1digitado){
                    System.out.println(numero2digitado);
                    System.out.println(numero1digitado);
                    System.out.println(numero3digitado);

                    //quinta comparação
                    } else if (numero3digitado > numero2digitado && numero3digitado > numero1digitado && numero1digitado > numero2digitado){
                        System.out.println(numero3digitado);
                        System.out.println(numero2digitado);
                        System.out.println(numero1digitado);

                        //sexta comparação
                        } else if (numero3digitado > numero2digitado && numero3digitado > numero1digitado && numero2digitado > numero1digitado){
                            System.out.println(numero3digitado);
                            System.out.println(numero1digitado);
                            System.out.println(numero2digitado);
                        }
                        
        }
        
     }
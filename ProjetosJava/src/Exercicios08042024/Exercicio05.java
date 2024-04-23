package Exercicios08042024;

import javax.swing.*;

public class Exercicio05 {

    public static void main(String[] args) {

        // Exercicio 05 - Leia dois numeros inteiros e imprima-os.
        String numero = JOptionPane.showInputDialog("Digite um numero:");        
        JOptionPane.showMessageDialog(null, "Numero Lido:" + numero);

        String numero2 = JOptionPane.showInputDialog("Digite outro numero:");        
        JOptionPane.showMessageDialog(null, "Numero Lido:" + numero2);

    }

}
package Exercicio26032024.Exercicios17042024;

import javax.swing.JOptionPane;

public class Exercicios07 {
    public static void main(String[] args) {
        
        double antecessor = 0;
        double sucessor = 0;

        String numero1 = JOptionPane.showInputDialog("Insira um número: ");
        double numeroConv = Double.parseDouble(numero1);

        antecessor = numeroConv - 1;
        sucessor = numeroConv + 1;
        
        JOptionPane.showMessageDialog(null, numeroConv);
        JOptionPane.showMessageDialog(null, antecessor);
        JOptionPane.showMessageDialog(null, sucessor);
    }
}
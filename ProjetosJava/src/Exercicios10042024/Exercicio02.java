package Exercicios10042024;

import javax.swing.*;

public class Exercicio02 {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Informe o nome:");
        String sexo = JOptionPane.showInputDialog("Informe o sexo, sendo (F - Feminino) e (M - Masculino):");

        String estadocivil = JOptionPane.showInputDialog("Informe o estado civil, sendo SOLTEIRO ou CASADA:");
        
        String tempocasada = "0";        
        if(sexo.equalsIgnoreCase("F")){
            if(estadocivil.equalsIgnoreCase("CASADA")){
                tempocasada = JOptionPane.showInputDialog("Informe o tempo de casada:");                
            }
        }
        JOptionPane.showMessageDialog(null, 
            "Nome:" + nome + " \n" + 
            "Sexo:" + sexo + "\n" + 
            "Estado civil:" + estadocivil +
            "Tempo de casada, se for mulher:" + tempocasada + " anos."
        );
    }
}
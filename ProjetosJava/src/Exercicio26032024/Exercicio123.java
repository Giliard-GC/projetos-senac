package Exercicio26032024;

public class Exercicio123 {
    public static void main(String[] args) {
        // Definindo os custos
        double custoAssinatura = 17.90;
        double custoImpulsoExcedente = 0.04;
        double custoInterurbano = 0.20;

        // Quantidades
        int totalImpulsos = 254;
        double custoInterurbanos = 34.29;
        int chamadasCelular = 23;

        // Calculando custo dos impulsos excedentes
        double custoImpulsos = 0;
        if (totalImpulsos > 90) {
            custoImpulsos = (totalImpulsos - 90) * custoImpulsoExcedente;
        }

        // Calculando custo das chamadas para celular
        double custoChamadasCelular = chamadasCelular * custoInterurbano;

        // Calculando o valor total da conta
        double valorTotal = custoAssinatura + custoImpulsos + custoInterurbanos + custoChamadasCelular;

        // Mostrando os custos e o valor total
        System.out.println("Custo da assinatura: R$" + custoAssinatura);
        System.out.println("Custo dos impulsos excedentes: R$" + custoImpulsos);
        System.out.println("Custo das chamadas para celular: R$" + custoChamadasCelular);
        System.out.println("Custo dos interurbanos: R$" + custoInterurbanos);
        System.out.println("Valor total da conta: R$" + valorTotal);
    }
}

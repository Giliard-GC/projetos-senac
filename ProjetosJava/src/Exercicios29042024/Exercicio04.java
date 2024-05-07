package Exercicios29042024;

 
import java.util.Scanner;
 
public class Exercicio04 {
  public static void main(String[] args) {
  
    Scanner entrada = new Scanner(System.in);
     
    // vamos pedir o número inteiro
    System.out.print("Informe o primeiro número (dividendo): ");
    int dividendo = Integer.parseInt(entrada.nextLine());
     
    int quociente = 0; // vai guardar o resultado da divisão
     
    // enquanto o dividendo for maior ou igual ao
    // divisor
    while(dividendo >= divisor){
      dividendo = dividendo - divisor; // subtrai o divisor do dividendo
      quociente++; // aumenta o quociente em 1
    }
     
    // agora mostramos o resultado da divisão
    System.out.println("O resultado da divisão é: " + quociente); 
  }
}

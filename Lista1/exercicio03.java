/*
3- Escreva um programa que receba 2 números através da linha de comando (console) e
imprima na tela. (Dica: Fazer o parser)
*/

public class exercicio03 {
    public static void main(String args[]) {
      int valor1 = Integer.parseInt(args[0]);
      int valor2 = Integer.parseInt(args[1]);
  
      System.out.println("O Primeiro valor é: " + valor1);
      System.out.println("O Segundo valor é: " + valor2);
    }
  }
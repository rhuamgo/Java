/*
4- Escreva um programa que receba 2 números através da linha de comando (console) e
imprima na tela apenas o valor do maior.

*/

public class exercicio04 {
    public static void main(String args[]) {
      int valor1 = Integer.parseInt(args[0]);
      int valor2 = Integer.parseInt(args[1]);
      
      if(valor1 > valor2){
          System.out.println("O maior valor é: " + valor1);
      }
      else{System.out.println("O maior valor é: " + valor2);}
          
      }
  }
/*
5- Escreva um programa que receba 3 números através da linha de comando (console) e
imprima na tela apenas o valor do maior.
*/

public class exercicio05 {
    public static void main(String args[]) {
      int valor1 = Integer.parseInt(args[0]);
      int valor2 = Integer.parseInt(args[1]);
      int valor3 = Integer.parseInt(args[2]);
  
      if(valor1 > valor2 && valor1 > valor3){ 
          System.out.println("O maior valor é: " + valor1);
      }
      else if(valor2 > valor1 && valor2 > valor3){
           System.out.println("O maior valor é: " + valor2);
      }else{
           System.out.println("O maior valor é: " + valor3);
      }
      
    }
  }
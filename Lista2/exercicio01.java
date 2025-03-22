// 1. Escreva um programa que solicita 8 números inteiros ao usuário e guarda esses
// valores em um array. Em seguida o programa deve imprimir o array

import java.util.Scanner;

public class exercicio01 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        String [] numeros = new String[8];
        int contador1 =1;
        for (int i = 0; i < (numeros.length); i++){
            System.out.print("Digite o "+ contador1+ "° Numero que deseja adicionar: ");
            String numero = ler.nextLine();
            contador1++;
            
            numeros[i] = numero;
        }
        
        int contador = 1;

        for (String numero : numeros){
            
            System.out.println("O "+ contador+ "° Numero adicionado foi = " + numero);
            contador++;
        }

        ler.close();
    }
}
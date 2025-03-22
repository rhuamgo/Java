// 5. Escreva um programa que armazene em um array de números inteiros com 5
// valores digitados pelo usuário. Em seguida, o programa deve informar qual foi o
// maior valor digitado.

import java.util.Scanner;

public class exercicio05 {
     public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int [] vet1 = new int[5];
        int contador1 =1;

        for (int i = 0; i < (vet1.length); i++){
            System.out.print("Digite o "+ contador1+ "° Numero que deseja adicionar: ");
            int numero = ler.nextInt();
            contador1++;
            
            vet1[i] = numero;
        }
        int cal = vet1[0];
        int result = 0;

        for (int conta : vet1){
            for (int i = 0; i < vet1.length; i++){
                cal = vet1[i];
                if (cal > result){
                    result = conta;
                }
            }
      
        }

        System.out.println("O maior numero digitado foi: " + result);

        ler.close();
 }
}

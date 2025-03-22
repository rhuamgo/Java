// 2. Escreva um programa que recebe um número inteiro entre 1 e 10.
// Em seguida, imprima a tabuala desse número

import java.util.Scanner;

public class exercicio02 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número inteiro entrer 1 e 10: ");
        int numeroTabuada = ler.nextInt();

        System.out.println("Tabuada do " + numeroTabuada);
        for (int i = 1; i < 11; i++){
            System.out.println(numeroTabuada + " * " + i + " = " + numeroTabuada * i);
        }


        ler.close();
    }
}

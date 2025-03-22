// 8 - Escreva um programa que receba uma letra, em seguida, escreva na tela se essa letra
// é uma vogal ou consoante (considerar apenas letras minúsculas).

import java.util.Scanner;

public class exercicio08 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Escreva a letra que deseja verificar: ");
        String letra = ler.nextLine().toLowerCase();


        String[] vogais = {"a","e","i","o","u"};
        int i = 0;
        for (String vogal : vogais){
            if (letra.equals(vogal)){
                i++;
            }
        }
        if (i > 0){
            System.out.println("A letra '" + letra + "' é uma Vogal");
        }else{
            System.out.println("A letra '" + letra + "' é uma Consoante");
        }
        ler.close();
    }
}

// 7- Escreva um programa que converta uma temperatura em graus Celsius(C) para
// Fahrenheit(F). Fórmula: F = C * (9 / 5) + 32

import java.util.Scanner;

public class exercicio07 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor em Celsius que deseja converter: ");
        String v1= ler.nextLine();
        
        float valor = Integer.parseInt(v1);          

        float convertido = (valor * 9/5) + 32;

        System.out.println("O Valor Convertido é: " + convertido);
        ler.close();
 }        
}

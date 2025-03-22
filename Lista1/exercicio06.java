/*
6- Reescreva os exercícios 2, 3, 4, 5 mas agora o usuário poderá digitar (iterativo) os
valores. (Dica: Classe Scanner)
*/
import java.util.Scanner;
public class exercicio06 {
  public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
// Exercicio 02
    System.out.println("Digite o primeiro nome: ");
    String nome1= ler.nextLine();
    
    System.out.println("Digite o segundo nome: ");
    String nome2= ler.nextLine();
    
    System.out.println(nome1);
    System.out.println(nome2);
 
//Exercicio 03
    System.out.println("Digite o primeiro Numero: ");
    String numero1= ler.nextLine();

    System.out.println("Digite o Segundo Numero: ");
    String numero2= ler.nextLine();

    System.out.println(numero1);
    System.out.println(numero2);    
 
//Exercicio 04  
    System.out.println("Digite o primeiro Numero: ");
    String numeroMaior1= ler.nextLine();

    System.out.println("Digite o Segundo Numero: ");
    String numeroMaior2= ler.nextLine();
    
    int numeromaior1 = Integer.parseInt(numeroMaior1);
    int numeromaior2 = Integer.parseInt(numeroMaior2);



    if (numeromaior1 > numeromaior2){
         System.out.println(numeromaior1);  
    }else{
        System.out.println(numeromaior2);  
    }

//Exercicio05   

    System.out.println("Digite o 1° Numero: ");
    String v1= ler.nextLine();

    System.out.println("Digite o 2° Numero: ");
    String v2= ler.nextLine();

    System.out.println("Digite o 1° Numero: ");
    String v3= ler.nextLine();

    int valor1 = Integer.parseInt(v1);
    int valor2 = Integer.parseInt(v2);
    int valor3 = Integer.parseInt(v3);

    if(valor1 > valor2 && valor1 > valor3){ 
    System.out.println("O maior valor é: " + valor1);
}
    else if(valor2 > valor1 && valor2 > valor3){
     System.out.println("O maior valor é: " + valor2);
    }else{
     System.out.println("O maior valor é: " + valor3);
}
    ler.close();
  }
}
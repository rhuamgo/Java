// 4. Modifique o exercício anterior de forma que o conteúdo de vet1 seja copiado
// para vet2 de forma invertida.


import java.util.Scanner;

public class exercicio04 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        String [] vet1 = new String[5];
        String [] vet2 = new String[5];
        int contador1 =1;
        for (int i = 0; i < (vet1.length); i++){
            System.out.print("Digite o "+ contador1+ "° Numero que deseja adicionar: ");
            String numero = ler.nextLine();
            contador1++;
            
            vet1[i] = numero;
        }
        
        System.out.println("Valores Adicionados com Sucesso!");
        int contador = vet1.length-1;
        System.out.println(contador);
        for (String numero : vet1){
            vet2[contador] = numero;
            contador--;
        }

        System.out.println("Array 1:");
        for (String imprima : vet1){
            System.out.println(imprima);
        }

        System.out.println("Array 2:");
        for (String imprima : vet2){
            System.out.println(imprima);
        }

        ler.close();
    }       
}        


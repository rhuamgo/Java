// 9 - Escreva um programa que indique o número de dias existentes em um
// mês.


import java.util.Scanner;

public class exercicio09 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o mês que deseja verificar: ");
        String mes = ler.nextLine();

        if(mes.equals("1") ||  mes.equals("3") ||  mes.equals("5") ||  mes.equals("7") ||  mes.equals("8") ||  mes.equals("10") ||  mes.equals("12")){
            System.out.println("O Mês '"+ mes + "' tem 31 dias!");
        }else if(mes.equals("4") ||  mes.equals("6") ||  mes.equals("9") ||  mes.equals("11")){
            System.out.println("O Mês '" + mes + "' tem 30 dias!");
        }else if(mes.equals("2")){
            System.out.println("O Mês '2' tem 28 dias!");
        }else {System.out.println("Informe um mês valido");}

        ler.close();
    }
}   

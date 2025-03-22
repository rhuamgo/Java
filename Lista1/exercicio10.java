// 10- Escrever um programa que leia o código do produto escolhido do cardápio de uma
// lanchonete e a quantidade. O programa deve calcular o valor a ser pago por aquele
// lanche. Considere que a cada execucão somente será calculado um pedido. O cardápio
// da lanchonete segue o padrão abaixo:

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o Código do produto: ");
        String codigoProduto = ler.nextLine();

        System.out.print("Informe a Quantidade: ");
        String quantidadeProduto = ler.nextLine();

        int codigo = Integer.parseInt(codigoProduto); 
        int quantidade = Integer.parseInt(quantidadeProduto); 
        double valor = 0;
        BigDecimal total = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
    


        switch (codigo) {
            case 100:
                System.out.println("Produto selecionado: Cachorro-Quente R$1.20 UN");
                valor = quantidade * 1.20;
                total = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
                System.out.println("Quantidade pedida: " + quantidade + " Valor total = R$" + total);
                break;

                case 101:
                System.out.println("Produto selecionado: Bauru Simples R$1.30 UN");
                valor = quantidade * 1.30;
                total = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
                System.out.println("Quantidade pedida: " + quantidade + " Valor total = R$" + total);
                break;

                case 102:
                System.out.println("Produto selecionado: Bauru Com Ovo R$1.50 UN");
                valor = quantidade * 1.50;
                total = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
                System.out.println("Quantidade pedida: " + quantidade + " Valor total = R$" + total);
                break;

                case 103:
                System.out.println("Produto selecionado: Hamburguer R$1.20 UN");
                valor = quantidade * 1.20;
                total = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
                System.out.println("Quantidade pedida: " + quantidade + " Valor total = R$" + total);
                break;

                case 104:
                System.out.println("Produto selecionado: CheeseBurguer R$1.70 UN");
                valor = quantidade * 1.70;
                total = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
                System.out.println("Quantidade pedida: " + quantidade + " Valor total = R$" + total);
                break;

                case 105:
                System.out.println("Produto selecionado: Suco R$2.20 UN");
                valor = quantidade * 2.20;
                total = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
                System.out.println("Quantidade pedida: " + quantidade + " Valor total = R$" + total);
                break;

                case 106:
                System.out.println("Produto selecionado: Refrigerante R$1.00 UN");
                valor = quantidade * 1.00;
                total = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);
                System.out.println("Quantidade pedida: " + quantidade + " Valor total = R$" + total);
                break;
        
            default:
                break;
        }


        ler.close(); 
    }      
}

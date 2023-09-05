/*
 * Faça um programa que lê um valor real, representando o valor de uma peça de roupa. A seguir, o programa deve ler
um inteiro (0, 1 ou 2) os quais representam as seguintes opções:
0 – Compra à vista
1 – Compra parcelada no cartão
2 – Crediário
Na opção 0, o programa deve calcular quanto custa a peça de roupa com 10% de desconto.
Na opção 1, o programa deve perguntar ao usuário quantas parcelas deseja utilizar e exibir o valor da parcela.
Na opção 2, o usuário pagará juros de 10% sobre o valor total. O programa deve ler o número de parcelas
desejado e exibir o valor de cada parcela, que é calculado sobre o valor com juros.
Caso o usuário digite alguma opção diferente de 0, 1 ou 2, o programa deve informar “opção inválida” e
terminar.
 */

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        float precoRoupa;
        float result;
        int parcelas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da roupa ");
        precoRoupa = sc.nextFloat();

        int opcoes;

        System.out.println("Digite 0 para comprar a vista. Digite 1 para parcelar no cartão. Digite 2 para pagar no crediário");
        opcoes = sc.nextInt();

        switch (opcoes) {
            case 0:
                result = (float) ((precoRoupa / 10) + precoRoupa);
                System.out.println("O resultado da compra é de " + result);
                break;
            case 1:
                System.out.println("Quantas parcelas quer parcelar?");    
                parcelas = sc.nextInt();
                if (parcelas < 5) {
                 System.out.println("Você desejou parcelar em " + parcelas + " e está parcela fica em " + precoRoupa/parcelas);   
                }
                break;
            case 2:
                System.out.println("Digite quantas parcelas quer pagar ");  //Não consegui fazer essa operação 100%, fiquei perdido.
                parcelas = sc.nextInt();
                result = (float) ((precoRoupa * 0.10) + (precoRoupa/parcelas));
                System.out.println("O valor no crediário fica de " + result);
                break;
            default:
                System.out.println("Número inválido");
                break;
        }


        sc.close();

    }
}

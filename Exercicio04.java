/*
 * Escreva um programa que pede para o usuário inserir dois números, obtém os números do usuário e então imprime
o maior número seguido pelas palavras “é o maior”. Se os números forem iguais, imprime a mensagem “Estes
números são iguais”.
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número ");
        a = sc.nextInt();

        System.out.println("Digite o segundo número ");
        b = sc.nextInt();

        if (a>b) {
            System.out.println(a + " é o maior");
        }
        else if (b>a) {
            System.out.println(b + " é o maior");
        }
        else if (a==b) {
            System.out.println("Estes números são iguais");
        }








        sc.close();
    }
}

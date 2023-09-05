/*
 * Escreva um programa que faz a leitura de 2 números inteiros. Caso o primeiro seja maior do que o segundo, o
programa imprime “primeiro maior do que o segundo”. Caso contrário, o programa imprime “segundo maior do que o
primeiro”.
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número ");
        a = sc.nextInt();

        System.out.println("Informe o segundo número ");
        b = sc.nextInt();

        if (a>b) {
            System.out.println("O primeiro numero equivalente a " + a + " é maior que o segundo número, que é " + b);
        }
        else if (b>a) {
            System.out.println("O segundo numero equivalente a " + b + " é maior que o primeiro número, que é " + a);
        }







        sc.close();
    }
}

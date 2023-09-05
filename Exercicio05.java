/*
 * Escreva um programa que lê três inteiros a partir do teclado e imprime a soma, a média, o produto, o menor e o
maior desses números.
 */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int a, b, c;
        int soma, media, produto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número ");
        a = sc.nextInt();

        System.out.println("Digite o segundo número ");
        b = sc.nextInt();

        System.out.println("Digite o terceiro número ");
        c = sc.nextInt();


        soma = a + b + c;
        System.out.println("A soma entre eles é " + soma);

        media = (a + b + c)/3;
        System.out.println("A média é " + media);

        produto = a * b * c;
        System.out.println("O produto é " + produto);

        if (a > b && c < a) {
            System.out.println(a + " é maior");
            
        }
        else if (b > a && c < b) {
            System.out.println(b + " é maior");
        }
        else if (c > a && b < c) {
            System.out.println(c + " é maior");
        }


        if (a < b && c > a) {
            System.out.println(a + " é o menor");
        }
        else if (b < a && c > b) {
            System.out.println(b + " é o menor");
        }
        else if (c < a && b > c) {
            System.out.println(c + " é o menor");
        }




        sc.close();
    }
}

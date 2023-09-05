/*
 * Escreva um programa que lê três números inteiros diferentes e os exibe em ordrescente. Se o usuário digitar
números iguais, seu programa deve exibir uma mensagem de erro e terminar.
 */
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro número");
        num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("A ordem crescente é " + num1 + ", " + num2 + ", " + num3);
        } else if (num1 < num3 && num3 < num2) {
            System.out.println("A ordem crescente é " + num1 + ", " + num3 + ", " + num2);
        } else if (num2 < num1 && num1 < num3) {
            System.out.println("A ordem crescente é " + num2 + ", " + num1 + ", " + num3);
        } else if (num2 < num3 && num3 < num1) {
            System.out.println("A ordem crescente é " + num2 + ", " + num3 + ", " + num1);
        } else if (num3 < num1 && num1 < num2) {
            System.out.println("A ordem crescente é " + num3 + ", " + num1 + ", " + num2);
        } else if (num3 < num2 && num2 < num1) {
            System.out.println("A ordem crescente é " + num3 + ", " + num2 + ", " + num1);
        } else {
            System.out.println("Os números são iguais *** ERRO ***");
        }

        sc.close();
    }
}

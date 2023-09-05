/*
 * Escreva um programa que verifica se um dado número inteiro de quatro dígitos é uma senha válida. Para ser
considerado como uma senha válida, um número tem que ter as seguintes características:
- O primeiro dígito da esquerda para a direita tem que ser 8 ou 5
- O quarto dígito da esquerda para a direita tem que ser 5 ou 1
- A soma do segundo com o terceiro dígitos tem que ser 3 caso o quarto dígito seja 5 e 0 caso ele seja 1
Por exemplo, o número 8125 é uma senha válida pois começa com 8, termina com 5 e a soma dos dois dígitos do
meio é 3.
 */

 //512   1

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        int num1, num2, num3, num4;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();
        if (num1 == 8 || num1 == 5) {
            System.out.println("Acertou o primeiro número!");
        } else {
            System.out.println("Errou o primeiro número!");
        }




        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        if (num2 == 0 ||num2 == 1 || num2 == 2 || num2 == 3) {
            System.out.println("Acertou o segundo número");
        }
        else{
            System.out.println("Errou o segundo número");
        }





        System.out.print("Digite o terceiro número: ");
        num3 = sc.nextInt();
        if (num3 == 0 || num3 == 1 || num3 == 2 || num3 == 3) {
            System.out.println("Acertou o terceiro número");
        }
        else{
            System.out.println("Errou o terceiro número");
        }

          if (num2+num3 <= 3 ) {
            System.out.println("CERTO");
        }
        else{
            System.out.println("ERRO NO SEGUNDO E TERCEIRO NÚMERO");
        }





        System.out.print("Digite o quarto número: ");
        num4 = sc.nextInt();

        if (num4 == 5 || num4 == 1) {
            System.out.println("Acertou o último número");
        } else {
            System.out.println("Errou o último número");
        }

        

        sc.close();
    }
}

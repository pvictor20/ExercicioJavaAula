/*
 * Escreva um programa que faz a leitura de um número inteiro e um número real. Caso o número inteiro seja menor
do que o número real, o programa deve imprimir uma mensagem dizendo isso ao usuário. Caso contrário, o programa
somente termina.
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int inteiro;
        float real;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um número real ");
        real = sc.nextFloat();

        System.out.println("Escreva um número inteiro ");
        inteiro = sc.nextInt();

        if (inteiro < real) {
            System.out.println("O número " + real + " é maior do que " + inteiro );
            
        }else{
            System.out.println("****** FIM DO CÓDIGO ******");
        }










        sc.close();
    }
}

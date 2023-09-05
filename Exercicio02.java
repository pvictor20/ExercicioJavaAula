/*
 * Escreva um programa que faz a leitura de dois números reais e verifica se eles são iguais. Se forem, o programa
deve mostrar uma mensagem ao usuário informando-o disso. Caso contrário, o programa somente termina.
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        float a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número ");
        a = sc.nextFloat();

        System.out.println("Digite outro número ");
        b = sc.nextFloat();


        if (a == b) {
            System.out.println("Os números são iguais, ambos equivalem a " + a);
        }
        else{
            System.out.println("********** FIM DO CÓDIGO *****************");
        }




        sc.close();
    }
}

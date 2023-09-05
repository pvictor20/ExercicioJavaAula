/*
 * Faça um programa que lê os seguintes dados:
- código de estado (um inteiro de 1 a 5)
- valor inicial de carga
Seu programa deve calcular qual o valor final de uma carga de acordo com as seguintes regras.
Caso o código de estado seja 2 ou 5 o valor final da carga é o valor inicial menos 12%.
Caso o código de estado seja 1, 3 ou 4, o valor final da carga é o valor inicial menos 15%.
 */


import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int a, b, c, d, e, carga;
        byte codigo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu código de estado [1-5]");
        codigo = sc.nextByte();

        System.out.println("Digite o valor da carga ");
        carga = sc.nextInt();

        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;

        if (codigo == b || codigo == e) {
            System.out.println("Código é igual a 2 ou 5");
            System.out.println("O valor da carga é de " + (carga - (carga/12)));
        }
        else if (codigo == a || codigo == c || codigo == d) {
            System.out.println("Código igual a 1, ou 3 ou 4");
            System.out.println("O valor da carga é de " + (carga - (carga/15)));
        }

        sc.close();

    }

     
    }


/*
 * Escreva um programa que lê a altura e peso do usuário e calcula o seu IMC, índice de massa corpórea.
 */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        float altura;
        float peso;
        float imc;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura ");
        altura = sc.nextFloat();

        System.out.println("Digite seu peso ");
        peso = sc.nextFloat();

        imc = peso /(altura*altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal");
        }
        else if (imc >=18.4 && imc < 25) {
            System.out.println("Peso ideal, muito bem.");
        }
        else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso, um regime pode ajudar.");
        }
        else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade leve.");
        }
        else if (imc >=35 && imc < 40) {
            System.out.println("Obesidade moderada.");
        }
        else if (imc > 40) {
            System.out.println("Obesidade mórbida.");
        }










        sc.close();
    }
}

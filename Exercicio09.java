/*
 * Escreva um programa que lê duas notas de um estudante, ambas sendo valores reais. O programa deve calcular a
média e exibir um texto para o usuário conforme a tabela a seguir:
Nota Texto
média >= 9 Parabéns, continue assim!
7 <= média < 9 Aprovado.
6 <= média < 7 Aprovado no limite, estude um pouco mais.
2 < = média < 6 Não está aprovado mas ainda pode fazer a segunda época
média < 2 Reprovado. Nos vemos semestre que vem.
 */
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        double nota1, nota2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
       

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if (media >= 9) {
            System.out.println("Parabéns, continue assim!");
        } else if (media >= 7) {
            System.out.println("Aprovado.");
        } else if (media >= 6) {
            System.out.println("Aprovado no limite, estude um pouco mais.");
        } else if (media >= 2) {
            System.out.println("Não está aprovado mas ainda pode fazer a segunda época.");
        } else {
            System.out.println("Reprovado. Nos vemos semestre que vem.");
        }

        sc.close();
 }
}

/*
 * Escreva um programa que lê as notas de 10 alunos e calcula a média aritmética delas. Caso a média seja pelo
menos 6, o programa deve exibir a quantidade de alunos que tiveram nota maior do que 8. Caso contrário, o programa
deve exibir a quantidade de alunos que tiraram nota 0.
 */

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, media, alunosAprovados, alunosReprovados;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nota do Paulo ");
        n1 = sc.nextInt();

        System.out.println("Nota do Victor ");
        n2 = sc.nextInt();

        System.out.println("Nota do Pedro  ");
        n3 = sc.nextInt();

        System.out.println("Nota do Henrique ");
        n4 = sc.nextInt();

        System.out.println("Nota do Mateus ");
        n5 = sc.nextInt();

        System.out.println("Nota do Gustavo ");
        n6 = sc.nextInt();

        System.out.println("Nota do Lucas ");
        n7 = sc.nextInt();

        System.out.println("Nota do João ");
        n8 = sc.nextInt();

        System.out.println("Nota do César ");
        n9 = sc.nextInt();

        System.out.println("Nota do Denilson ");
        n10 = sc.nextInt();

        media = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10;
        alunosAprovados = 0;
        alunosReprovados = 0;

        if (media >= 6) {
            if (n1 >= 8) alunosAprovados++;
            if (n2 >= 8) alunosAprovados++;
            if (n3 >= 8) alunosAprovados++;
            if (n4 >= 8) alunosAprovados++;
            if (n5 >= 8) alunosAprovados++;
            if (n6 >= 8) alunosAprovados++;
            if (n7 >= 8) alunosAprovados++;
            if (n8 >= 8) alunosAprovados++;
            if (n9 >= 8) alunosAprovados++;
            if (n10 >= 8) alunosAprovados++;

            System.out.println("O número de alunos que tiraram mais de 8 foram: " + alunosAprovados);
        }

        else if (media < 6) {
            if (n1 == 0) alunosReprovados++;
            if (n2 == 0) alunosReprovados++;
            if (n3 == 0) alunosReprovados++;
            if (n4 == 0) alunosReprovados++;
            if (n5 == 0) alunosReprovados++;
            if (n6 == 0) alunosReprovados++;
            if (n7 == 0) alunosReprovados++;
            if (n8 == 0) alunosReprovados++;
            if (n9== 0) alunosReprovados++;
            if (n10 == 0) alunosReprovados++;

            System.out.println("Os alunos que tiraram 0 foram " + alunosReprovados);
        }

        sc.close();
    }
}

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

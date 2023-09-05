/*
 * Escreva um programa que oferece para o usuário as seguintes opções:
1 – Misto quente R$5,50
2 – Salada Chinesa R$10,20
3 – Suco de Laranja R$4,00
4 – Suco de Manga R$3,50
Se o usuário digitar qualquer número diferente de 1, 2, 3 ou 4, o seu programa deve exibir uma mensagem de erro e
terminar. Caso contrário, se o usuário escolher alguma bebida, o programa deve exibir “tenha um excelente drink, vai
lhe custar” seguido do valor da bebida. Se o usuário escolher alguma comida, o programa deve exibir “bom apetite,
vai lhe custar” seguido do valor da comida.
 */
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        float misto, salada, sucoL, sucoM;
        byte opcoes;
        String resposta;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo à nossa lanchonete!");

        while (true) {
            System.out.print("Gostaria de pedir algo? [s/n]: ");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                System.out.println("Sim");
                break; 
            } else if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Não");
                break; 
            } else {
                System.out.println("Opção inválida. Responda com 's' para Sim ou 'n' para Não.");
            }
        }

        System.out.println("Digite 1-Misto quente, 2 - Salada Chinesa, 3 - Suco de laranja, 4 - Suco de manga");
        opcoes = sc.nextByte();

        misto = (float) 5.50;
        salada = (float) 10.20;
        sucoL = (float) 4.00;
        sucoM = (float) 3.50;

        switch (opcoes) {
            case 1:
                System.out.println("Você escolheu misto quente.");
                System.out.println("O valor ficou em R$" + misto + "Bom apetite!");
                break;
            case 2:
                System.out.println("Você escolheu salada chinesa.");
                System.out.println("O valor ficou em R$" + salada + "Bom apetite!");
                break;
            case 3:
                System.out.println("Você escolheu suco de laranja.");
                System.out.println("O valor ficou em R$" + sucoL + "Tenha um excelente drink!");
                break;
            case 4:
                System.out.println("Você escolheu suco de manga.");
                System.out.println("O valor ficou em R$" + sucoM + "Tenha um excelente drink!");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }

        sc.close();
    }
}

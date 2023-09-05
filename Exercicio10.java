import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        float misto, salada, sucoL, sucoM, preco;
        byte opcoes;
        String resposta;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo à nossa lanchonete!");

        while (true) {
            System.out.print("Gostaria de pedir algo? [s/n]: ");
            resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                System.out.println("Sim");
                break; // Sai do loop quando a resposta é "s"
            } else if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Não");
                break; // Sai do loop quando a resposta é "n"
            } else {
                System.out.println("Opção inválida. Responda com 's' para Sim ou 'n' para Não.");
            }
        }

        System.out.println("Digite 1-Misto quente, 2 - Salada Chinesa, 3 - Suco de laranja, 4 - Suco de manga");
        opcoes = sc.nextByte();

        switch (opcoes) {
            case 1:
                System.out.println("Você escolheu misto quente.");
                System.out.println("O valor ficou em R$5,50. Bom apetite!");
                break;
            case 2:
                System.out.println("Você escolheu salada chinesa.");
                System.out.println("O valor ficou em R$10,20. Bom apetite!");
                break;
            case 3:
                System.out.println("Você escolheu suco de laranja.");
                System.out.println("O valor ficou em R$4,00. Tenha um excelente drink!");
                break;
            case 4:
                System.out.println("Você escolheu suco de manga.");
                System.out.println("O valor ficou em R$3,50. Tenha um excelente drink!");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }

        sc.close();
    }
}

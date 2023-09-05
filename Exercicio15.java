/*
 * Faça um programa que lê os seguintes dados:
- valor/hora (é um número real positivo)
- horas trabalhadas (é um inteiro)
- imposto (um real entre 0 e 1, inclusive)
- comissão (é um real positivo)
Seu programa deve calcular e exibir para o usuário os seguintes valores:
Salário bruto, que é igual ao valor/hora multiplicado pelo número de horas trabalhadas.
Salário líquido, que é igual ao salário bruto menos o imposto mais a comissão. Note que a comissão somente
entrará nos cálculos caso o número de horas trabalhadas seja pelo menos 120.
 */
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Digite o valor/hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o imposto (entre 0 e 1): ");
        double imposto = sc.nextDouble();

        System.out.print("Digite a comissão: ");
        double comissao = sc.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        if (horasTrabalhadas >= 120) {
            salarioBruto += comissao;
        }

        double salarioLiquido = salarioBruto - (salarioBruto * imposto);

        System.out.println("Salário bruto: R$" + salarioBruto);
        System.out.println("Salário líquido: R$" + salarioLiquido);

        sc.close();
    }
}

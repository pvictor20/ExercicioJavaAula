/*
 * Escreva um programa que lê dois valores reais. O primeiro valor é o saldo de uma conta bancária e o segundo é um
valor que o usuário deseja sacar desta conta. Caso seja possível efetuar o saque (ou seja, o saldo não fique negativo), o
programa deve mostrar o saldo remanescente. Caso contrário, deve informar o usuário que não foi possível realizar o
saque.
 */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        float saque;
        float restante;

        Scanner sc = new Scanner(System.in);

        float saldoBanco = 7895;
        System.out.println("O saldo inicial da conta é de " + saldoBanco );

        System.out.println("Quanto deseja sacar da conta?");
        saque = sc.nextFloat();

        restante = saldoBanco - saque;

        if (saldoBanco > saque) {
            System.out.println("Operação concluída, agora restam " + restante + "R$");
        }
        else if (saldoBanco < saque) {
            System.out.println("Não foi possível realizar o saque!");
        }






        sc.close();
    }
}

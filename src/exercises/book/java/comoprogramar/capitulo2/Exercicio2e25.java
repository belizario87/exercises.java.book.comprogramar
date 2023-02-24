package exercises.book.java.comoprogramar.capitulo2;

import java.util.Scanner;

/**
 * (Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador
 * de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
 */
public class Exercicio2e25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Digite um numero: ");
        num = input.nextInt();
        String ehPar = num % 2 == 0 ? "O numero escolhido eh par" : "O numero escolhido e impar";
        System.out.printf(ehPar);

    }

}

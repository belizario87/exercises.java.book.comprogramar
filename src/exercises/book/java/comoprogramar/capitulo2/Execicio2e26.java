package exercises.book.java.comoprogramar.capitulo2;

import java.util.Scanner;

/**
 * (Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e
 * imprimir o resultado. [Dica: utilize o operador de resto.]
 *
 *
 *
 */
public class Execicio2e26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Digite o primeiro numero: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = input.nextInt();

        String ehMultiplo = num1 % num2 == 0 ? "O primeiro numero e multiplo do segundo" : "O primeiro numero nao e multiplo do segundo";
        System.out.println(ehMultiplo);



    }
}

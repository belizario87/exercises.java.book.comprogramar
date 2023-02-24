package exercises.book.java.comoprogramar.capitulo2;

import java.util.Scanner;

/**
 *
 * (Separando os dígitos em um inteiro) Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
 * separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário
 * digitar o número 42339, o programa deve imprimir
 *
 */
public class Exercicio2e30 {



    public static void main(String[] args) {

        System.out.println("Digite uma sequencia de 5 numeros: ");
            for(char c : new Scanner(System.in).nextLine().toCharArray()){
                System.out.print(c + " ");

            }
//        Scanner entrada = new Scanner(System.in);
//
//        System.out.print("Digite um numero inteiro com 3 algarismos: ");
//        int numero = entrada.nextInt();
//
//        System.out.printf("%d %d %d\n", numero / 100, numero % 100 / 10, numero % 10);
    }


}








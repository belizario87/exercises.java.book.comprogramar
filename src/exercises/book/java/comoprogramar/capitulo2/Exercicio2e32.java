package exercises.book.java.comoprogramar.capitulo2;

import java.util.Scanner;

/**
 * (Valores negativos, positivos e zero) Escreva um programa que insira cinco números, além de determinar e imprimir quantos negativos,
 * quantos positivos e quantos zeros foram inseridos.
 */
public class Exercicio2e32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPositivo = 0;
        int numero;
        int totalNegativo = 0;
        int totalZeros = 0;

        for(int i = 0; i < 5; i++) {
                System.out.println("Digite um numero: ");
                numero = input.nextInt();
                if (numero < 0) {
                    totalNegativo++;
                } else if (numero == 0) {
                    totalZeros++;
                } else totalPositivo++;

        }
        System.out.println("Total de numeros negativos: " + totalNegativo);
        System.out.println("Total de numeros positivos: " + totalPositivo);
        System.out.println("Total de numeros zeros: " + totalZeros);
    }
}







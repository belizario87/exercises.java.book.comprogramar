package exercises.book.java.comoprogramar.capitulo2;

import java.util.Scanner;

/* 2.16 - (Comparando Inteiros) - Escreva um aplicativo que solicite ao usuario escrever dois inteiros,
obtenha dele esses numeros e exiba o numero maior seguido pelas palavras "Is larger". Se os numeros forem iguais,
imprima a mensagem "These numbers are equal". Utilize as tecnicas mostradas na figura 2.15 ( pag 44)
*/
public class Exercicio16 {
    int number1;
    int number2;
    public static void main(String[] args) {
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int number1 = inputScanner.nextInt();

            System.out.print("Enter the first number: ");
            int number2 = inputScanner.nextInt();

            if(number1 > number2) {
                System.out.println(number1 + " is larger");
            } if (number2 > number1) {
                System.out.println(number2 + " is larger");
            } if (number1 == number2) {
                System.out.println("These numbers are equal");
            }
        }


    }

}

package exercises.book.java.comoprogramar.capitulo2;


import java.util.Scanner;

/* 2.15 - (Aritimetica) Escreva um aplicativo que solicite ao usuario inserir dois inteiros,
obtenha dele esses numeros e imprima sua soma, produto, diferenca e quociente (divisao).
Utilize as tecnicas usadas na figura 2.7. (pag 36)
*/
public class Exercicio15 {


    public static void main(String[] args) {
        try (Scanner inputNumber = new Scanner(System.in)) {
            System.out.print("Escreva um numero:");
            int number1 = inputNumber.nextInt();  // le o primeiro numero

            System.out.print("Escreva um numero:");
            int number2 = inputNumber.nextInt(); // le o segundo numero


            int sum = number1 + number2;
            System.out.println("A soma dos numeros e = " + sum); //exibe a soma

            int prod = number1 * number2;
            System.out.println("O produto dos numeros e = " + prod); // exibe o produto

            int dif = number1 - number2;
            System.out.println("A diferenca dos numeros e = " + dif); // exibe a subtracao

            int quo = number1 / number2;
            System.out.println("O quociente dos numeros e = " + quo); //exibe a divisao
        }




    }
}

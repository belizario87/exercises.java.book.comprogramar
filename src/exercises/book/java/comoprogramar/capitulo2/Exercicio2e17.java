package exercises.book.java.comoprogramar.capitulo2;

import java.util.Scanner;

/* (Aritmética, menor e maior) Escreva um aplicativo que insira três inteiros 
digitados pelo usuário e exiba
a soma, média, produto e os
números menores e maiores. Utilize as técnicas mostradas na Figura 2.15. 
[Observação: o cálculo da média neste exercício deve resultar
em uma representação de inteiro. 
Assim, se a soma dos valores for 7, a média deverá ser 2, não 2,3333...]*/ 

public class Exercicio2e17 {
    int number1;
    int number2;
    int number3;
    int soma;
    int media;
    int produto;

    /**
     * @param args
     */
    public static void main(String[] args) {
     

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o primeiro numero: ");
            int number1 = input.nextInt();

            
            System.out.print("Digite o segundo numero: ");
            int number2 = input.nextInt();

            
            System.out.print("Digite o terceiro numero: ");
            int number3 = input.nextInt();

            int soma = number1 + number2 + number3;
            System.out.println("O resultado da soma dos numeros e: " + soma);
            int media = soma / 3; 
            System.out.println("O resultado da media dos numeros e: " + media);
            int produto = number1 * number2 * number3;
            System.out.println("O resultado do produto dos numeros e: " + produto); 

                
            if (number1 > number2 && number3 > number2) {
                System.out.println("O menor numero e: " + number2);
            } else if (number2 > number1 && number3 > number1) {
                System.out.println("O menor numero e: " + number1);
            } else {
                System.out.println("O menor numero e: " + number3);
            }
        }
        
        


    }
    
}

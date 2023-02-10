package exercises.book.java.comoprogramar.capitulo2;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        int raio;
        int diametro;
        double circuferencia; // 2 x Pi X raio
        double area; //pi x raio ao quadrado


        Scanner input = new Scanner(System.in);
        System.out.printf("Insira o raio da circuferencia: ");
        raio = input.nextInt();

        System.out.println("Diametro: " + 2 * raio   );
        System.out.println("Circunferencia: " + (2 * Math.PI) * raio);

        System.out.printf("Area: " + Math.PI * (raio * raio));





    }
}

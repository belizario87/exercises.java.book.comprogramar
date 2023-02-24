package exercises.book.java.comoprogramar.capitulo2;

import java.util.Scanner;

/* (Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, 
além de determinar e imprimir o maior e o menor inteiro no grupo. 
Utilize somente as técnicas de programação que você aprendeu neste capítulo.
 */

public class Exercicio2e24 {
  int numeroUm;
  int numeroDois;
  int numeroTres;
  int numeroQuatro;
  int numeroCinco;
  public static void main(String[] args) {
  
    Scanner numeroEntrada = new Scanner(System.in);

    System.out.print("Digite o primeiro numero: ");
    int numeroUm = numeroEntrada.nextInt();

    System.out.print("Digite o segundo numero: ");
    int numeroDois = numeroEntrada.nextInt();

    System.out.print("Digite o terceiro numero: ");
    int numeroTres = numeroEntrada.nextInt();

    System.out.print("Digite o quarto numero: ");
    int numeroQuatro = numeroEntrada.nextInt();

    System.out.print("Digite o quinto numero: ");
    int numeroCinco = numeroEntrada.nextInt();


    if(numeroUm < numeroDois && numeroUm < numeroTres && numeroUm < numeroQuatro && numeroUm < numeroCinco){
        System.out.println("O menor numero e: " + numeroUm);
    }else if(numeroDois < numeroUm && numeroDois < numeroTres && numeroDois < numeroQuatro && numeroDois < numeroCinco){
        System.out.println("O menor numero e: " + numeroDois);
    }else if(numeroTres < numeroUm && numeroTres < numeroDois && numeroTres < numeroQuatro && numeroTres < numeroCinco){
        System.out.println("O menor numero e: " + numeroTres);
    }else if(numeroQuatro < numeroUm && numeroQuatro < numeroDois && numeroQuatro < numeroQuatro && numeroQuatro < numeroCinco){
        System.out.println("O menor numero e: " + numeroQuatro);
    }else {
        System.out.println("O menor numero e: " + numeroCinco);
    }

    if(numeroUm > numeroDois && numeroUm < numeroTres && numeroUm < numeroQuatro && numeroUm < numeroCinco){
        System.out.println("O maior numero e: " + numeroUm);
    }else if(numeroDois > numeroUm && numeroDois > numeroTres && numeroDois > numeroQuatro && numeroDois > numeroCinco){
        System.out.println("O maior numero e: " + numeroDois);
    }else if(numeroTres > numeroUm && numeroTres > numeroDois && numeroTres > numeroQuatro && numeroTres > numeroCinco){
        System.out.println("O maior numero e: " + numeroTres);
    }else if(numeroQuatro > numeroUm && numeroQuatro > numeroDois && numeroQuatro > numeroQuatro && numeroQuatro > numeroCinco){
        System.out.println("O maior numero e: " + numeroQuatro);
    }else {
        System.out.println("O maior numero e: " + numeroCinco);
    }
    
  }
}
   
    


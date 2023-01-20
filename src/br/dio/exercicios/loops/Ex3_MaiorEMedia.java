package br.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int numeroMaior = 0;
        double somaNumeros = 0;
        int count = 0;

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero > numeroMaior){
                numeroMaior = numero;
            }

            somaNumeros += numero;
            count++;
        } while (count < 5);

        double media = somaNumeros / count;

        System.out.println("Maior número: " + numeroMaior);
        System.out.println("Média: " + media);

    }
}

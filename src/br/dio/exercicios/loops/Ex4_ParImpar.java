package br.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int quantNumeros;
        int quantPares = 0;
        int quantImpares = 0;
        int count = 0;

        System.out.print("Quantidade de números: ");
        quantNumeros = scanner.nextInt();

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            if (numero % 2 == 0){
                quantPares++;
            } else {
                quantImpares++;
            }
            count ++;
        } while (count < quantNumeros);

        System.out.printf("Foram digitados %d números pares.", quantPares);
        System.out.printf("\nForam digitados %d números impares.", quantImpares);

    }
}

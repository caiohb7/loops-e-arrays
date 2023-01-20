package br.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabuada;

        System.out.print("Digite o número para a tabuada: ");
        tabuada = scanner.nextInt();

        System.out.printf("\nTabuada de %d: \n", tabuada);

        for(int i = 1; i <= 10; i++){
            int conta = tabuada * i;
            System.out.printf("%d X %d = %d\n", tabuada, i, conta);
        }
    }
}

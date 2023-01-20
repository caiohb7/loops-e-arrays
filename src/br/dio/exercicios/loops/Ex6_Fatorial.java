package br.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatorial;
        int resultado = 1;

        System.out.print("Fatorial: ");
        fatorial = scanner.nextInt();

        for(int i = fatorial; i >= 1; i--){
            resultado *= i;
        }
        System.out.printf("%d! = %d", fatorial, resultado);
    }
}

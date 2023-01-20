package br.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        while(true) {
            System.out.print("Nota: ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10){
                System.out.println("Nota inválida!\n");
            } else break;
        }
    }
}

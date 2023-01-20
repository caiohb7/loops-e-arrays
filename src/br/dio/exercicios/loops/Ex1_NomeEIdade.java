package br.dio.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        while (true) {
            System.out.print("Digite o nome: ");
            nome = scanner.next();
            if (nome.equals("0")) break;

            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();
            if (idade == 0) break;
        }
    }
}

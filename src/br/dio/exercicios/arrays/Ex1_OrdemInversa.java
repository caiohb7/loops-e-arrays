package br.dio.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {5, 7, 8, 6, 8, 9};

        for (int i = vetor.length - 1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}

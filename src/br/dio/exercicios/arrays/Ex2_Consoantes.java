package br.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        for (int i = 0; i < consoantes.length; i++){
            System.out.print("Letra: ");
            String letra = scanner.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[i] = letra;
                quantConsoantes++;
            }
        }

        System.out.print("Consoantes: ");
        for (String consoante:
             consoantes) {
            if (consoante != null){
                System.out.print(consoante + " ");
            }
        }

        System.out.println("\nQuantidade de consoantes: " + quantConsoantes);
    }
}

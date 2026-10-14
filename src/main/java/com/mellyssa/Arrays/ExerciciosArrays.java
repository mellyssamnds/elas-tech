package com.mellyssa.Arrays;

import java.util.Scanner;

public class ExerciciosArrays {

    // Exercício 1
    public static void pessoas() {
        String[] nomes = {"Mellyssa", "João", "Maria", "Pedro", "Ana"};

        System.out.println(nomes[0]);
        System.out.println(nomes[2]);
        System.out.println(nomes[4]);
    }

    // Exercício 2
    public static void notas() {
        double[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
    }

    // Exercício 3
    public static void media() {
        double[] notas = {8, 6, 10, 7, 9};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }

    // Exercício 4
    public static void numeros() {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números de trás para frente:");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

    public static void main(String[] args) {

        System.out.println("===== EXERCÍCIO 1 =====");
        pessoas();

        System.out.println("\n===== EXERCÍCIO 2 =====");
        notas();

        System.out.println("\n===== EXERCÍCIO 3 =====");
        media();

        System.out.println("\n===== EXERCÍCIO 4 =====");
        numeros();
    }
}

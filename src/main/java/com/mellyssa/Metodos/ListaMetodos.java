package com.mellyssa.Metodos;

import java.util.Scanner;

public class ListaMetodos {

    // 1
    public static void mostrarBoasVindas() {

        System.out.println("Bem-vinda ao curso de Java!");
    }

    // 2
    public static void saudar(String nome) {

        System.out.println("Olá, " + nome + "! Tudo bem?");
    }

    // 3
    public static int dobro(int numero) {

        return numero * 2;
    }

    // 4
    public static double calcularMedia(double n1, double n2) {

        return (n1 + n2) / 2;
    }

    // 5
    public static boolean ehMaiorDeIdade(int idade) {

        return idade >= 18;
    }

    // 6
    public static int somar(int a, int b) {

        return a + b;
    }

    public static int somar(int a, int b, int c) {

        return a + b + c;
    }

    public static double somar(double a, double b) {

        return a + b;
    }

    // 7
    public static void saudacao() {

        System.out.println("Olá!");
    }

    public static void saudacao(String nome) {

        System.out.println("Olá, " + nome + "!");
    }

    public static void main(String[] args) {

        // 1
        mostrarBoasVindas();
        System.out.println();

        // 2
        saudar("Mellyssa");
        saudar("Maria");
        saudar("Joana");
        System.out.println();

        // 3
        int resultadoDobro = dobro(5);
        System.out.println("O dobro de 5 é: " + resultadoDobro);
        System.out.println();

        // 4
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2);

        System.out.printf("A média é: %.2f%n", media);
        System.out.println();

        // 5
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        boolean maiorDeIdade = ehMaiorDeIdade(idade);

        if (maiorDeIdade) {
            System.out.println("A pessoa é maior de idade");
        } else {
            System.out.println("A pessoa é menor de idade");
        }
        System.out.println();

        // 6
        System.out.println("Soma 1: " + somar(2, 3));
        System.out.println("Soma 2: " + somar(2, 3, 4));
        System.out.println("Soma 3: " + somar(2.5, 3.5));
        System.out.println();

        // 7
        saudacao();
        saudacao("Mellyssa");

        scanner.close();
    }
}

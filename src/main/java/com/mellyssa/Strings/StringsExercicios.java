package com.mellyssa.Strings;

import java.util.Scanner;

public class StringsExercicios {

    Scanner scanner = new Scanner(System.in);

    // Exercício 1
    public void exercicio1() {
        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Seu nome tem " + nome.length() + " caracteres.");
    }

    // Exercício 2
    public void exercicio2() {
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("MAIÚSCULO: " + nome.toUpperCase());
        System.out.println("minúsculo: " + nome.toLowerCase());
    }

    // Exercício 3
    public void exercicio3() {
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("A primeira letra é: " + nome.charAt(0));
    }

    // Exercício 4
    public void exercicio4() {
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));
    }

    // Exercício 5
    public void exercicio5() {
        System.out.println("Digite seu nome: ");
        String nome1 = scanner.nextLine();

        System.out.println("Digite de novo: ");
        String nome2 = scanner.nextLine();

        System.out.println("Os nomes são iguais? " + nome1.equalsIgnoreCase(nome2));
    }

    public static void main(String[] args) {

        StringsExercicios exercicios = new StringsExercicios();

        System.out.println("===== EXERCÍCIO 1 =====");
        exercicios.exercicio1();

        System.out.println("\n===== EXERCÍCIO 2 =====");
        exercicios.exercicio2();

        System.out.println("\n===== EXERCÍCIO 3 =====");
        exercicios.exercicio3();

        System.out.println("\n===== EXERCÍCIO 4 =====");
        exercicios.exercicio4();

        System.out.println("\n===== EXERCÍCIO 5 =====");
        exercicios.exercicio5();
    }
}

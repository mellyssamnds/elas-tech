package com.mellyssa.Scanner;

import java.util.Scanner;

public class ScannerExercicios {

    Scanner scanner = new Scanner(System.in);

    String nome = "";
    int idade = 0;

    // Exercício 1
    public void exercicio1() {
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.println(
                "Oi " + nome + ", você tem " + idade +
                        " anos e vai fazer " + (idade + 1) +
                        " no próximo aniversário."
        );
    }

    // Exercício 2
    public void exercicio2() {
        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
    }

    // Exercício 3
    public void exercicio3() {
        System.out.println("Digite uma nota de 0 a 10: ");
        double nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovada");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovada");
        }
    }

    // Exercício 4
    public void exercicio4() {
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    numero + " x " + i + " = " + (numero * i)
            );
        }
    }


    public static void main(String[] args) {

        ScannerExercicios exercicios = new ScannerExercicios();

        exercicios.exercicio1();
        System.out.println();
        exercicios.exercicio2();
        System.out.println();
        exercicios.exercicio3();
        System.out.println();
        exercicios.exercicio4();
    }
}

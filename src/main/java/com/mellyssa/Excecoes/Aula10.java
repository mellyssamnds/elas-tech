package com.mellyssa.Excecoes;

public class Aula10 {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 2;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException ae) {
            System.out.println("Não se divide por 0");

        } finally {
            System.out.println("Isso sempre roda");
        }

        System.out.println("O programa continua");
    }
}
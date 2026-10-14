package com.mellyssa.ListaRevisao;

public class ParImpar {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d é Par%n", i);
            } else {
                System.out.printf("%d é Ímpar%n", i);
            }
        }
    }
}

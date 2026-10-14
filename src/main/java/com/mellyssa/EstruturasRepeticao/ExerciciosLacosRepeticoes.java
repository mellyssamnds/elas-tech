package com.mellyssa.EstruturasRepeticao;

public class ExerciciosLacosRepeticoes {

    public static void main(String[] args) {

        // Exercício 1 - Números de 1 a 30 usando for
        System.out.println("Exercício 1:");

        for (int i = 1; i <= 30; i++) {
            System.out.println(i);
        }


        // Exercício 2 - Contagem regressiva de 10 até 1
        System.out.println("\nExercício 2:");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Fim!!");


        // Exercício 3 - Números de 1 a 30 usando while
        System.out.println("\nExercício 3:");

        int contador = 1;

        while (contador <= 30) {
            System.out.println(contador);
            contador++;
        }

        /*
         * Comparação:
         *
         * for:
         * for (int i = 1; i <= 30; i++)
         *
         * while:
         * int contador = 1;
         * while (contador <= 30) {
         *     contador++;
         * }
         *
         * Os dois códigos fazem a mesma coisa.
         * O for deixa inicialização, condição e incremento
         * juntos. O while separa essas partes.
         */


        // Exercício 4 - Tabuada
        System.out.println("\nExercício 4:");

        int numero = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

package com.mellyssa;

import java.util.Scanner;

public class Revisao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer numero1 = 0;
        int[] numero2 = {10, 11, 21, 32, 49};

        //explicação for:
        // for (inicialização; condição; incremento) {
        //     // bloco de código a ser executado enquanto a condição for verdadeira

        for (int i = 0; i < 10; i++) {
            //System.out.println("Valor de i: " + i);
        }

        System.out.println(numero2.length);


        for (int i = 0; i < numero2.length; i++) {
            System.out.println("Posição: " + i + " é o valor: " + numero2[i]);
        }
    }
}

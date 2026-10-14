package com.mellyssa.ListaRevisao;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu ver camisas.");
                    break;

                case 2:
                    System.out.println("Você escolheu ver calças.");
                    break;

                case 3:
                    System.out.println("Saindo do menu...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

        sc.close();
    }
}

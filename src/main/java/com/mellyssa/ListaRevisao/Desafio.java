package com.mellyssa.ListaRevisao;

import java.util.Scanner;

class Aluna {

    String nome;
    double nota1;
    double nota2;
    double media;
    boolean passou;
}

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 2) {

            System.out.println("Deseja iniciar? Pressione 1 continuar, 2 para sair");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    Aluna aluna = new Aluna();

                    System.out.println("Nota 1:");
                    aluna.nota1 = sc.nextDouble();

                    System.out.println("Nota 2:");
                    aluna.nota2 = sc.nextDouble();

                    aluna.media = (aluna.nota1 + aluna.nota2) / 2;

                    sc.nextLine();

                    System.out.println("Nome da Aluna:");
                    aluna.nome = sc.nextLine();

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    }

                    System.out.println("\n--- RESULTADO DA ALUNA ---");

                    System.out.printf("Nome da aluna: %s%n", aluna.nome);
                    System.out.printf("Primeira nota: %.1f%n", aluna.nota1);
                    System.out.printf("Segunda nota: %.1f%n", aluna.nota2);
                    System.out.printf("Média final: %.1f%n", aluna.media);
                    System.out.printf("Aluna aprovada: %b%n", aluna.passou);

                    System.out.println("--------------------------\n");


                    break;

                case 2:

                    System.out.println("Encerrando o sistema. Até logo!");

                    break;

                default:

                    System.out.println("Opção inválida!");

                    break;
            }
        }

        sc.close();
    }
}

package com.mellyssa.ListaRevisao;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do lanche: ");
        String nomeLanche = sc.nextLine();

        System.out.print("Digite o valor do lanche: ");
        double valorLanche = sc.nextDouble();

        if (valorLanche > 30.00) {
            valorLanche -= 5.00;
        }

        System.out.printf(
                "O lanche %s custa R$ %.2f%n",
                nomeLanche,
                valorLanche
        );

        sc.close();
    }
}

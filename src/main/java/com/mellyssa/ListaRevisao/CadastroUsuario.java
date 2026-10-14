package com.mellyssa.ListaRevisao;

import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu Ano de Nascimento: ");
        int anoNascimento = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite o seu Nome Completo: ");
        String nomeCompleto = sc.nextLine();

        System.out.printf(
                "O usuário %s nasceu em %d.%n",
                nomeCompleto,
                anoNascimento
        );

        sc.close();
    }
}

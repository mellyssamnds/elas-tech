package com.mellyssa.ListaRevisao;

import java.util.Scanner;

public class Produto {

    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("Digite o nome do produto: ");
            String nomeProduto = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double precoProduto = sc.nextDouble();
            sc.nextLine();

            Produto produto = new Produto(nomeProduto, precoProduto);

            if (produto.preco > 100) {
                System.out.printf(
                        "Produto caro! O preço é R$ %.2f%n",
                        produto.preco
                );
            } else {
                System.out.printf(
                        "Produto com preço acessível! O preço é R$ %.2f%n",
                        produto.preco
                );
            }
        }

        sc.close();
    }
}

package com.mellyssa.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Ana");

        conta.depositar(500);
        System.out.println("Saldo: " + conta.getSaldo());

        conta.depositar(-100);

        conta.sacar(2000);

        conta.sacar(200);
        System.out.println("Saldo: " + conta.getSaldo());

        Produto produto = new Produto();
        System.out.println(produto.nome);
        System.out.println(produto.preco);
        //System.out.println(produto.codigoInterno);

    }
}

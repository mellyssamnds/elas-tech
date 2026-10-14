package com.mellyssa.Encapsulamento;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    private String numeroConta = "007-E";

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return;
        }

        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }

        saldo += valor;
        registarDeposito("Depósito de " + valor);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }

        if (!temSaldoSuficiente(valor)) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        saldo -= valor;
        registarSaque("Saque de " + valor);
    }

    private boolean temSaldoSuficiente(double valor) {
        return saldo >= valor;
    }

    private void registarDeposito(String descricao) {
        System.out.println(descricao + " registrado com sucesso!");
    }

    private void registarSaque(String descricao) {
        System.out.println(descricao + " registrado com sucesso!");
    }

}

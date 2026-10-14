package com.mellyssa.Petshop;

public class Pet {
    String nome;
    String especie;
    String porte;
    double peso;

    String definirPorte() {
        if (peso < 10) {
            return "Pequeno";
        } else if (peso < 25) {
            return "Médio";
        } else {
            return "Grande";
        }
    }

    public void emitirSom() {
        System.out.println(nome + " faz um som qualquer...");
    }
}
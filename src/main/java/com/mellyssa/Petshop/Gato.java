package com.mellyssa.Petshop;

public class Gato extends Pet {
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Miau!");
    }
}
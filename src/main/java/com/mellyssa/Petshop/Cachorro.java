package com.mellyssa.Petshop;

public class Cachorro extends Pet {
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: Au au!");
    }
}
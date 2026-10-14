package com.mellyssa.Petshop;

public class Tosa implements Servico {
    @Override
    public void executar(String nomePet) {
        System.out.println("Tosando " + nomePet + "...");
    }
}
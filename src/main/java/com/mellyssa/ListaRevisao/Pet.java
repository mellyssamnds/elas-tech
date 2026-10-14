package com.mellyssa.ListaRevisao;

public class Pet {

    String nome;
    String raca;
    double peso;

    public Pet(String nome, String raca, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }

    public static void main(String[] args) {

        Pet pet1 = new Pet("Rex", "Pastor Alemão", 25.5);
        Pet pet2 = new Pet("Mimi", "Siamês", 4.2);

        System.out.println("Pet 1:");
        System.out.println("Nome: " + pet1.nome);
        System.out.println("Raça: " + pet1.raca);
        System.out.println("Peso: " + pet1.peso + " kg");

        System.out.println();

        System.out.println("Pet 2:");
        System.out.println("Nome: " + pet2.nome);
        System.out.println("Raça: " + pet2.raca);
        System.out.println("Peso: " + pet2.peso + " kg");
    }
}

package com.mellyssa.HashMap;

import java.util.HashMap;

public class ListaHashmap {

    public static void main(String[] args) {

        // Exercício 1 - Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
        //   inteiro e depois use get para mostrar a idade de uma delas.
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Maria", 25);
        pessoas.put("Carlota", 30);
        pessoas.put("Joaquina", 35);

        System.out.println("Mapa de pessoas: " + pessoas);

        System.out.println("Idade da Carlota: " + pessoas.get("Carlota"));

    }
}

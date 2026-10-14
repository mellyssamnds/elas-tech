package com.mellyssa.Petshop;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;

public class Petshop {

    static void mostrarFicha(Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }

    static void mostrarFicha(Pet pet, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f kg%n", pet.peso);
        System.out.println("Porte: " + pet.porte);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pet[] pets = new Pet[5];
        Queue<String> filaBanho = new ArrayDeque<>();

        ArrayList<Servico> servicos = new ArrayList<>();
        servicos.add(new Banho());
        servicos.add(new Tosa());
        servicos.add(new Consulta());

        int total = 0;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("=== PETSHOP ===");
            System.out.println("1. Cadastrar Pet");
            System.out.println("2. Buscar Pets");
            System.out.println("3. Mostrar espécies cadastradas");
            System.out.println("4. Entrar na fila de banho");
            System.out.println("5. Atender o próximo");
            System.out.println("6. Listar pets");
            System.out.println("7. Executar serviços em um pet");
            System.out.println("8. Mostrar ficha (sobrecarga)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = input.nextInt();
                input.nextLine();

                switch (opcao) {
                    case 1:
                        if (total < pets.length) {
                            System.out.print("Digite o nome do Pet: ");
                            String nome = input.nextLine();

                            System.out.print("Digite a espécie do Pet: ");
                            String especie = input.nextLine();

                            System.out.print("Digite o peso do Pet (em kg): ");
                            double peso = input.nextDouble();
                            input.nextLine();

                            Pet novoPet;
                            if (especie.equalsIgnoreCase("cachorro")) {
                                novoPet = new Cachorro();
                            } else if (especie.equalsIgnoreCase("gato")) {
                                novoPet = new Gato();
                            } else {
                                novoPet = new Pet();
                            }

                            novoPet.nome = nome;
                            novoPet.especie = especie;
                            novoPet.peso = peso;
                            novoPet.porte = novoPet.definirPorte();

                            pets[total] = novoPet;
                            total++;

                            System.out.println("Pet cadastrado! Agora são " + total + " pet(s)");
                            System.out.println();
                        } else {
                            System.out.println("Limite de cadastro de 5 pets atingido");
                        }
                        break;

                    case 2:
                        System.out.print("Qual pet você procura? ");
                        String nomeBusca = input.nextLine();

                        boolean encontrado = false;

                        for (int i = 0; i < total; i++) {
                            if (pets[i].nome.equalsIgnoreCase(nomeBusca)) {
                                System.out.printf(
                                        "Encontrado: %s (%s) - %.1f kg%n",
                                        pets[i].nome,
                                        pets[i].especie,
                                        pets[i].peso
                                );
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Pet não encontrado!");
                        }

                        System.out.println();
                        break;

                    case 3:
                        HashSet<String> especies = new HashSet<>();

                        for (int i = 0; i < total; i++) {
                            especies.add(pets[i].especie);
                        }

                        System.out.println("--- ESPÉCIES CADASTRADAS ---");

                        for (String esp : especies) {
                            System.out.println("- " + esp);
                        }

                        System.out.println("Total de espécies diferentes: " + especies.size());
                        System.out.println();
                        break;

                    case 4:
                        System.out.print("Nome do pet pra entrar na fila: ");
                        String nomeFila = input.nextLine();

                        filaBanho.add(nomeFila);

                        System.out.println(nomeFila + " entrou na fila");
                        System.out.println("Fila agora: " + filaBanho);
                        System.out.println();
                        break;

                    case 5:
                        if (!filaBanho.isEmpty()) {
                            System.out.println("Próximo da fila: " + filaBanho.peek());

                            String atendido = filaBanho.poll();

                            System.out.println("Atendendo " + atendido + "...");
                            System.out.println("Fila agora: " + filaBanho);
                        } else {
                            System.out.println("A fila de banho está vazia");
                        }

                        System.out.println();
                        break;

                    case 6:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("--- PETS CADASTRADOS ---");
                            for (int i = 0; i < total; i++) {
                                System.out.printf(
                                        "%s (%s) - %.1f kg - Porte %s%n",
                                        pets[i].nome,
                                        pets[i].especie,
                                        pets[i].peso,
                                        pets[i].porte
                                );
                                pets[i].emitirSom();
                                System.out.println("");
                            }
                        }
                        System.out.println();
                        break;

                    case 7:
                        System.out.print("Nome do pet: ");
                        String nomeServico = input.nextLine();

                        for (Servico servico : servicos) {
                            servico.executar(nomeServico);
                        }
                        System.out.println();
                        break;

                    case 8:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado!");
                        } else {
                            mostrarFicha(pets[0]);
                            System.out.println("---");
                            mostrarFicha(pets[0], "=== FICHA DO PET ===");
                        }
                        System.out.println();
                        break;

                    case 0:
                        System.out.println("Até logo!!");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                input.nextLine();
                System.out.println();
            }
        }

        input.close();
    }
}
package com.jornada.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Esportes[] esportes = Esportes.values();

        System.out.println("Esportes:");
        for (int i = 0; i < esportes.length; i++) {
            System.out.println(i + "-" + esportes[i]);
        }
        System.out.println("Digite o número do esporte desejado: ");
        int escolha = input.nextInt();

        switch (esportes[escolha]) {
            case FUTEBOL:
            case BASQUETE:
            case VOLEI:
                System.out.println("O esporte utiliza bola!");
                break;
            case NATACAO:
            case JIUJITSU:
            case CROSSFIT:
                System.out.println("O esporte NÃO utiliza bola!");
                break;
        }

        System.out.println(
        esportes[escolha].getResumoEsporte()
        );
    }
}

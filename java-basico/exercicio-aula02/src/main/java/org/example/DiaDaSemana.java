package org.example;

import java.util.Scanner;

public class DiaDaSemana {
    private static String diaDaSemana() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro de 1 a 7:");
        int num = input.nextInt();
        switch (num) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-Feira";
            case 3:
                return "Terça-Feira";
            case 4:
                return "Quarta-Feira";
            case 5:
                return "Quinta-Feira";
            case 6:
                return "Sexta-Feira";
            case 7:
                return "Sábado";
            default:
                return "Dia inválido, por favor, insira um valor de 1 a 7";
        }
    }

    public static void getDiaSemana() {
        System.out.println(diaDaSemana());
    }
}

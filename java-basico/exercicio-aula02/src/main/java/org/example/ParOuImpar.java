package org.example;

import java.util.Scanner;

public class ParOuImpar {
    public static void confereParOuImpar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro para validar se ele é par ou impar: ");
        int num = input.nextInt();
        if(num % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
    }
}

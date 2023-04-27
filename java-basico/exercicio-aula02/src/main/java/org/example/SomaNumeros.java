package org.example;

import java.util.Scanner;

public class SomaNumeros {
    public static void somaNumeros() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = input.nextInt();
        System.out.println("A soma dos números é: " + (num1 + num2));
    }
}

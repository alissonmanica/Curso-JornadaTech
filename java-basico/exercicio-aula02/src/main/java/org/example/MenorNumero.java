package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MenorNumero {
    public static void menorNumero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = input.nextInt();

        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        System.out.println("O menor número é: " + numeros[0]);
    }
}

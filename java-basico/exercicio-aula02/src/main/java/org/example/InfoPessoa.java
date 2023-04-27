package org.example;

import java.util.Scanner;

public class InfoPessoa {
    public static void infoPessoa() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Digite sua cidade: ");
        input.nextLine();
        String cidade = input.nextLine();

        System.out.println("Digite seu estado: ");
        String estado = input.nextLine();

        System.out.println("Olá, seu nome é " + nome + ", você tem " + idade + " anos, é da cidade de " + cidade + ", situada no estado de " + estado + ".");
    }
}

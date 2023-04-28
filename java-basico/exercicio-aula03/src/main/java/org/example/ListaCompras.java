package org.example;

import java.util.Scanner;

public class ListaCompras {
    public static void compras() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números de itens, você quer que a lista tenha? Digite o número: ");
        int tamanhoLista = sc.nextInt();

        String[] lista = new String[tamanhoLista];

        for(int index = 0; index < lista.length; index++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o nome do item: ");

            String item = input.nextLine();
            lista[index] = item;
        }

        for(int index = 0; index < lista.length; index++) {
            System.out.println(lista[index]);
        }
    }
}

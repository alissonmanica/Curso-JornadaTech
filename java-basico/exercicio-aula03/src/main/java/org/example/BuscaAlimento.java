package org.example;

import java.util.Scanner;

public class BuscaAlimento {

    public static void busca() {
        String[] alimentos = {"arroz", "feijão", "batata", "filé", "morango", "alface", "macarrão", "frango", "farofa", "tomate"};
        boolean continua = true;

        while(continua) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Qual alimento você deseja encontrar? ");
            String resposta = sc.nextLine();

            for(int i = 0; i < alimentos.length; i++) {
                if(alimentos[i].equals(resposta)) {
                    System.out.println("Posição: " + i + ", Nome: " + alimentos[i]);
                    continua = false;
                    return;
                }
            }

            System.out.println("Alimento não encontrado, tente novamente.");
        }

    }
}

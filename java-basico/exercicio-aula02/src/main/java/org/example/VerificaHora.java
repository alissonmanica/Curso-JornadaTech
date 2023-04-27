package org.example;

import java.util.Scanner;

public class VerificaHora {
    private static String retornaHora() {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe uma hora em números inteiros: ");
        int hora = input.nextInt();

        if (hora >= 0 && hora <= 6) {
            return "Boa Madrugada";
        } else if (hora >= 7 && hora <= 11) {
            return "Bom Dia";
        } else if (hora >= 12 && hora <= 18) {
            return "Boa Tarde";
        } else if (hora >= 19 && hora <= 23) {
            return "Boa Noite";
        } else {
            return "Informe uma hora válida(somente numeros inteiros)";
        }
    }

    public static void getHora() {
        System.out.println(retornaHora());
    }
}

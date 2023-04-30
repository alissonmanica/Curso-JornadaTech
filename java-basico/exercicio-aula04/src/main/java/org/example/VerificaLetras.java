package org.example;

import java.util.Scanner;

public class VerificaLetras {
    public static void verifica() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String input = sc.nextLine();
        boolean onlyChar = true;
            for (int i = 0; i < input.length(); i++) {
                if(input.toLowerCase().charAt(i) == input.toUpperCase().charAt(i)) {
                    onlyChar = false;
                    break;
                }
            }
        System.out.println(onlyChar ? "Esta palavra contém apenas caracteres alfabéticos" : "Esta palavra não contém apenas caracteres alfabéticos");
    }
}

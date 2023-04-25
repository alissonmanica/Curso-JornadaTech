package org.example;

public class SeparaLetra {
    public static void separaLetra(String palavra) {
        String array[] = palavra.split("");

        for(int index = 0; index < palavra.length(); index++) {
            System.out.println(palavra.charAt(index));
        }
    }
}

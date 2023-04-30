package org.example;

public class MediaAritmetica {
    public static double soma(int[] numeros) {
        double totalSoma = 0;
        for (int i = 0; i < numeros.length; i++) {
            totalSoma += numeros[i];
        }
        return totalSoma / numeros.length;
    }
}

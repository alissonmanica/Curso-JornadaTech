package org.example;

public class MaiorNumero {
    public static void maiorNumero() {
        int[] numeros = {10, 20, 80, 40, 50};
        int maior = 0;
        for(int i = 0; i < numeros.length; i++) {
            for(int x = 0; x < numeros.length; x++) {
                if(numeros[i] > numeros[x] && numeros[i] > maior) {
                    maior = numeros[i];
                }
            }
        }
        System.out.println(maior);
    }
}

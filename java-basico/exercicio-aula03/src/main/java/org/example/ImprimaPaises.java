package org.example;

public class ImprimaPaises {
    public static void imprime() {
        String[] paises = {"Brasil", "Alemanha", "Estados Unidos", "Russia", "Portugal", "Mexico", "Argentina"};
        for(int index = 0; index < paises.length; index++) {
            System.out.println(paises[index]);
        }
    }
}

package org.example;

public class NumeroPrimo {
    public static void isPrimo(int num) {
        boolean ehPrimo = false;
        for (int i = 2; i <= num; i++) {
            ehPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    ehPrimo = false;
                }
            }
        }
        System.out.println(ehPrimo ? "O número " + num + " é primo!" : "O número " + num + " não é primo!");
    }
}

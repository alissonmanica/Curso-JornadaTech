package org.example.ex02;

public class Calculadora {

    int somar(int num1, int num2) {
        return num1 + num2;
    }

    double somar(double num1, double num2) {
        return num1 + num2;
    }

    int somar(int[] numeros) {
        int total = 0;
        for(int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }
        return total;
    }

    double somar(double[] numeros) {
        double total = 0;
        for(int i = 0; i < numeros.length; i++) {
            total += numeros[i];
        }
        return total;
    }
}

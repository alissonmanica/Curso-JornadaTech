package org.example.ex02;

public class Main {
    public static void main(String[] args) {
        int[] listaNum = {5, 5, 5 ,5};
        double[] listaDoubleNum = {3.3, 3.5, 6.3, 8.4};
        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(5, 5));
        System.out.println(String.format("%.2f", calc.somar(5.34, 6.13)));
        System.out.println(calc.somar(listaNum));
        System.out.println(String.format("%.2f", calc.somar(listaDoubleNum)));
    }
}

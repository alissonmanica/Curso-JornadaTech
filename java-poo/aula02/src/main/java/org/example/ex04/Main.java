package org.example.ex04;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo("Retangulo", 14, 8);
        retangulo.calcularArea();

        Circulo circulo = new Circulo("Circulo", 8.45);
        circulo.calcularArea();

        Triangulo triangulo = new Triangulo("Triângulo", 10, 12);
        triangulo.calcularArea();
    }
}

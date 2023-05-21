package org.example.ex04;

public class Retangulo extends FiguraGeometrica {
    double base;
    double altura;
    public Retangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    void calcularArea() {
        double area = base * altura;
        System.out.println("A área do retangulo é: " + area);
    }
}

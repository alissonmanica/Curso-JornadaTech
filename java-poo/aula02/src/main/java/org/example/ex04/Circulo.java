package org.example.ex04;

public class Circulo extends FiguraGeometrica {
    double raio;
    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    void calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + String.format("%.2f", area));

    }
}

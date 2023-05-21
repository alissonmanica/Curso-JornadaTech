package org.example.ex04;

public abstract class FiguraGeometrica {
    String nomeFigura;

    public FiguraGeometrica(String nome) {
        this.nomeFigura = nome;
    }

    abstract void calcularArea();
}

package com.jornada.exercicio1;

import java.util.Objects;

public class Retangulo {
    private Double largura;
    private Double altura;

    public void setAtributes(Double largura, Double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public Double getArea() {
        return largura * altura;
    }

    public Double getPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        return "Largura: " + largura + ", Altura: " + altura;
    }

    @Override
    public boolean equals(Object obj) {
        Retangulo retanguloComparado = (Retangulo) obj;
        return this.largura.equals(retanguloComparado.largura) && this.altura.equals(retanguloComparado.altura);
    }
}

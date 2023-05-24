package com.jornada.exercicio1;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setAtributes(6.30, 3.20);
        System.out.println(retangulo.getArea());
        System.out.println(retangulo.getPerimetro());
        System.out.println(retangulo.toString());

        Retangulo retanguloSec = new Retangulo();
        retanguloSec.setAtributes(6.30, 3.20);
        System.out.println(retanguloSec.getArea());
        System.out.println(retanguloSec.getPerimetro());
        System.out.println(retanguloSec.toString());

        System.out.println(retangulo.equals(retanguloSec));
    }
}

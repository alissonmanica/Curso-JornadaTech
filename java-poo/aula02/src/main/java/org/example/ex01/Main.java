package org.example.ex01;

import org.example.ex01.Carro;
import org.example.ex01.Moto;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Citroen";
        carro.modelo = "2020";
        System.out.println(carro.velocidade);
        carro.acelerar();
        System.out.println(carro.velocidade);

        Moto moto = new Moto();
        moto.marca = "Kawazaki";
        moto.modelo = "2019";
        System.out.println(moto.velocidade);
        moto.acelerar();
        System.out.println(moto.velocidade);

    }
}
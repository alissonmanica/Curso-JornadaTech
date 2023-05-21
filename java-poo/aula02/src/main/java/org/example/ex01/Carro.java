package org.example.ex01;

import org.example.ex01.Veiculo;

public class Carro extends Veiculo {
    double velocidade;
    void acelerar() {
        this.velocidade += 50;
    }
}

package org.example.ex01;

import org.example.ex01.Veiculo;

public class Moto extends Veiculo {
    double velocidade;
    void acelerar() {
        this.velocidade += 40;
    }
}

package org.example;

public class Veiculo {
    String nome;
    String cor;
    int numeroDeRodas;
    double velocidade;

    void mover() {
        this.velocidade += 50;
        System.out.println("Sua velocidade está em " + velocidade + "km/h");
    }

    void frear() {
        this.velocidade -= 25;
        System.out.println("Sua velocidade está em " + velocidade + "km/h");
    }

    void imprime() {
        System.out.println("Informações do veículo");
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Número de rodas: " + numeroDeRodas);
        System.out.println("Velocidade: " + velocidade + "km/h");
    };
}

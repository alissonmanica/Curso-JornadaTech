package org.example;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo();
        carro1.nome = "Fusca";
        carro1.cor = "Azul";
        carro1.numeroDeRodas = 4;
        carro1.velocidade = 40;

        carro1.mover();
        carro1.frear();
        carro1.imprime();

        Veiculo carro2 = new Veiculo();
        carro1.nome = "BMW";
        carro1.cor = "Preta";
        carro1.numeroDeRodas = 4;
        carro1.velocidade = 70;

        carro1.mover();
        carro1.frear();
        carro1.imprime();

        Animal cachorro = new Animal();
        cachorro.nome = "Aktor";
        cachorro.idade = 2;
        cachorro.som = "Au au au!";
        cachorro.emitirSom();

        Animal gato = new Animal();
        gato.nome = "Salém";
        gato.idade = 2;
        gato.som = "Miau!";
        gato.emitirSom();

        Animal passaro = new Animal();
        passaro.nome = "Dragon";
        passaro.idade = 1;
        passaro.som = "Piu piu!";
        passaro.emitirSom();

        Funcionario gerente = new Funcionario();
        gerente.nome = "Claiton";
        gerente.salario = 4300;
        gerente.calcularSalario(10, 15);

        Funcionario desenvolvedor = new Funcionario();
        desenvolvedor.nome = "Alistolfo";
        desenvolvedor.salario = 2000;
        desenvolvedor.calcularSalario(0, 10);
    }
}
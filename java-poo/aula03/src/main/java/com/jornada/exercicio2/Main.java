package com.jornada.exercicio2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1234, "Alisson");
        conta.depositar(500.43);
        conta.sacar(300.0);
    }
}

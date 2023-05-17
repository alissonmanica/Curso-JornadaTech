package org.example;

public class Animal {
    String nome;
    int idade;
    String som = "hmm!";

    void emitirSom() {
        System.out.println(nome + " faz o som de " + som);
    }
}

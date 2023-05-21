package org.example.ex03;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }
}

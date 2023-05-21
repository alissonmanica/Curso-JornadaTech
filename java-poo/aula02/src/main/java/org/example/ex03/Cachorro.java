package org.example.ex03;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println(nome + " diz: Au au!");
    }
}

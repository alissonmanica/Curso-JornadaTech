package org.example.ex03;

public class Vaca extends Animal {
    public Vaca(String nome) {
        super(nome);
    }

    @Override
    void emitirSom() {
        System.out.println(nome + " diz: Muuuu!");
    }
}

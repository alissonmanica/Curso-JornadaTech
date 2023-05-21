package org.example.ex05;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jose", 20);
        System.out.println("Nome: " + pessoa.nome + ", Idade: " + pessoa.idade +  ", Altura: " + pessoa.altura);

        Atleta atleta = new Atleta("Marcos", 24, 1.82, "Natação");
        System.out.println("Nome: " + atleta.nome + ", Idade: " + atleta.idade +  ", Altura: " + atleta.altura + ", Esporte: " + atleta.esporte);
    }
}

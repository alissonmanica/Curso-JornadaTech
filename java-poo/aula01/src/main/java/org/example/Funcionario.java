package org.example;

public class Funcionario {
    String nome;
    double salario;

    void calcularSalario(int bonificacao, int desconto) {
        salario += (salario * bonificacao) / 100;
        salario -= (salario * desconto) / 100;
        System.out.println("Caro " + nome + " seu salário total é " + String.format("%.2f", salario));
    }
}

package com.jornada.exercicio2;

import com.jornada.exercicio2.interfaces.Depositavel;
import com.jornada.exercicio2.interfaces.Sacavel;

public class ContaBancaria implements Sacavel, Depositavel {
    private Integer conta;
    private String titular;
    private Double saldo;

    public ContaBancaria(Integer conta, String titular) {
        this.conta = conta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
        System.out.println("Você sacou R$" + valor + " da sua conta, seu saldo atual é: R$" + saldo );
    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
        System.out.println("Você depositou R$" + valor + " em sua conta, seu saldo atual é: R$" + saldo);
    }

}

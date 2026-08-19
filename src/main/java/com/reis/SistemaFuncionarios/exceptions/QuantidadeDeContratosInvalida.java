package com.reis.SistemaFuncionarios.exceptions;

public class QuantidadeDeContratosInvalida extends RuntimeException {
    public QuantidadeDeContratosInvalida() {
        System.out.println("Não é possivel adicionar um numero negativo ou maior que 10");

    }
}

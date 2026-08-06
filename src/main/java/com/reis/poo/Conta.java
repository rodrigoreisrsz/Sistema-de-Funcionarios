package com.reis.poo;

public abstract class Conta {
    private String titular;
    private int numeroConta = 0;
    private double saldo;


    public Conta(String titular){
        this.titular = titular;
        this.numeroConta++;
    }
    public Conta(String titular, double depositoInicial){
        this.titular = titular;
        deposito(depositoInicial);
        this.numeroConta++;
    }

    public void deposito(double valor){
       saldo+=valor;
    }
    public void saque(double valor){
        saldo-=valor + 5;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}

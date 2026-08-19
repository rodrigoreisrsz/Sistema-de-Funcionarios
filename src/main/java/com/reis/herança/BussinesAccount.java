package com.reis.herança;

public class BussinesAccount extends Conta {
    private double limite;

    public BussinesAccount() {

    }

    public BussinesAccount(String nome, Double saldo, double limite) {
        super(nome, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void saque(double saque){
        super.saque(saque);
        balance -= 2.0;
    }
}

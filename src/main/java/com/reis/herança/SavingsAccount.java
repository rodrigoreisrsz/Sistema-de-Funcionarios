package com.reis.herança;

public final class SavingsAccount extends Conta {
    private Double interestRate;
    //final evita que seja criada uma subclasse de SavingsAccount . Ex: SavingsAccountPlus

    public SavingsAccount(){
        super();
    }
    public SavingsAccount(String nome, Double saldo, double interestRate) {
        super(nome, saldo);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    public void updateBalance(){
        balance += balance * interestRate;
        //logica mais porcentagem
    }
    @Override
    public void saque(double saque){
        balance -= saque;
        //final pode ser usado para nao permitir que outra classe sobrescreva o mesmo metodo
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", balance=" + balance +
                '}';
    }
}

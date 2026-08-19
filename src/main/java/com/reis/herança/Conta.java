package com.reis.herança;

public class Conta {
    private String nome;
    protected Double balance;


    public Conta(){

    }
    public Conta(String nome, Double balance) {
        this.nome = nome;
        this.balance = balance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getBalance() {
        return balance;
    }


    public void saque(double saque){
        balance -= saque + 5.0;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", balance=" + balance +
                '}';
    }
}

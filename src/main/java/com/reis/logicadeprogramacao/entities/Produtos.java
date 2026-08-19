package com.reis.logicadeprogramacao.entities;

public class Produtos {
    private String nome;

    public Produtos(){

    }

    public Produtos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

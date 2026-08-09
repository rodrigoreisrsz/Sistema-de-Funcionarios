package com.reis.SistemaFuncionarios.domain;

public class Funcionario {
    //private UUID uuid;
    private int idFuncionario;
    private String nome;
    private Double salario;

    public Funcionario(int idFuncionario, String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
        this.idFuncionario = idFuncionario;
    }
    public void aumentoSalario(Double aumento){
        salario = salario + (salario * aumento / 100);
    }

    public int getId() {
        return idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }



    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + idFuncionario +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}

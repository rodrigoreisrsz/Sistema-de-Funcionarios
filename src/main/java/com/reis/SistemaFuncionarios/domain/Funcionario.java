package com.reis.SistemaFuncionarios.domain;

import com.reis.SistemaFuncionarios.exceptions.QuantidadeDeContratosInvalida;

import java.lang.foreign.AddressLayout;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario{
    private String nome;
    private TrabalhadorNivel nivel;
    private Double baseSalario;
    private Departamento departamento;
    private static List<ContratoPorHora> contratos = new ArrayList<>();

    public Funcionario(){

    }

    public Funcionario(String nome, TrabalhadorNivel nivel, Double baseSalario, Departamento departamento, List<ContratoPorHora> contratos) {
        this.nome = nome;
        this.nivel = nivel;
        this.baseSalario = baseSalario;
        this.departamento = departamento;
        this.contratos = contratos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TrabalhadorNivel getNivel() {
        return nivel;
    }

    public void setNivel(TrabalhadorNivel nivel) {
        this.nivel = nivel;
    }

    public Double getBaseSalario() {
        return baseSalario;
    }

    public void setBaseSalario(Double baseSalario) {
        this.baseSalario = baseSalario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoPorHora> getContratos() {
        return contratos;
    }

    public void setContratos(List<ContratoPorHora> contratos) {
        this.contratos = contratos;
    }
    public static void adicionarContrato(ContratoPorHora contrato){
        contratos.add(contrato);
    }
    public void removerContrato(ContratoPorHora contrato){
        contratos.remove(contrato);
    }
    public double income(int year, int month){
        double soma = baseSalario;
        for(ContratoPorHora contrato: contratos){
            if(year == contrato.getData().getYear() && month == (contrato.getData().getMonthValue())){
               soma+= contrato.totalValor();
            }
        }
        return soma;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", baseSalario=" + baseSalario +
                ", departamento=" + departamento +
                ", contratos=" + contratos +
                '}';
    }
}

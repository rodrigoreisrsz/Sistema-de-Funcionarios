package com.reis.SistemaFuncionarios.domain;

import java.time.LocalDate;

public class ContratoPorHora {
    private LocalDate data;
    private Double valorPorHora;
    private Integer horas;


    public ContratoPorHora(){

    }
    public ContratoPorHora(LocalDate data, Double valorPorHora,Integer horas) {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }
    public LocalDate getData(){
        return data;
    }
    public void setData(LocalDate data){
        this.data = data;
    }
    public Double getValorPorHora(){
        return valorPorHora;
    }

    public Integer getHoras(){
        return horas;
    }
    public void setHuras(Integer horas){
        this.horas = horas;
    }
    public double totalValor(){
        return valorPorHora * horas;
    }





    @Override
    public String toString() {
        return "ContratoPorHora{" +
                "data=" + data +
                ", valorPorHora=" + valorPorHora +
                ", horas=" + horas +
                '}';
    }


}
